package ProxyPattern;

/**
 * CommandExecutor
 */
interface CommandExecutor {
    public void runCommand(String cmd) throws Exception;
}

/**
 * CommandExecutor
 */
class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }

}

/**
 * CommandExecutorProxy
 */
class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("Asiri".equals(user) && "Asiri@123".equals(pwd))
            isAdmin = true;
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }

}

public class ProxyPattern {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Asiri", "Asiri@123");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message:: " + e.getMessage());
        }
    }
}
