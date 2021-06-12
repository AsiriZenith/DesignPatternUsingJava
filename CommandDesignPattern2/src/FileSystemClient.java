public class FileSystemClient {

    public static void main(String[] args) {

        //Creating the receiver object
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);

        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);

        //perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
