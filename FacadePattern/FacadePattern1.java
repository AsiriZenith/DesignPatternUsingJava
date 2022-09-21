package FacadePattern;

import java.sql.Connection;

/**
 * DBConnectionHelper
 */
interface DBConnectionHelper {
    public void generateMySqlPDFReport(String tableName, Connection con);

    public void generateMySqlHTMLReport(String tableName, Connection con);
}

/**
 * MySqlHelper
 */
class MySqlHelper implements DBConnectionHelper {

    public static Connection getMySqlDbConnection() {
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
    }

    public void generateMySqlHTMLReport(String tableName, Connection con) {
    }

}

/**
 * OracleHelper
 */
class OracleHelper implements DBConnectionHelper {

    public static Connection getOracleDbConnection() {
        return null;
    }

    @Override
    public void generateMySqlPDFReport(String tableName, Connection con) {
    }

    @Override
    public void generateMySqlHTMLReport(String tableName, Connection con) {
    }

}

/**
 * HelperFacade
 */
class HelperFacade {

    public static void generateReport(DBTypes dbTypes, ReportType reportType, String tableName) {
        Connection con;

        switch (dbTypes) {
            case MYSQL:
                con = MySqlHelper.getMySqlDbConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType) {
                    case HTML:
                        mySqlHelper.generateMySqlHTMLReport(tableName, con);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName, con);
                        break;
                    default:
                        break;
                }
                break;
            case ORACLE:
                con = OracleHelper.getOracleDbConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML:
                        oracleHelper.generateMySqlHTMLReport(tableName, con);
                        break;
                    case PDF:
                        oracleHelper.generateMySqlPDFReport(tableName, con);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }
}

enum DBTypes {
    MYSQL, ORACLE;
}

enum ReportType {
    HTML, PDF;
}

/**
 * FacadePattern1
 */
public class FacadePattern1 {

    public static void main(String[] args) {
        String tableName = "Employee";

        Connection con = MySqlHelper.getMySqlDbConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);

        Connection con1 = OracleHelper.getOracleDbConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateMySqlPDFReport(tableName, con1);

        HelperFacade.generateReport(DBTypes.MYSQL, ReportType.HTML, tableName);
        HelperFacade.generateReport(DBTypes.ORACLE, ReportType.PDF, tableName);
    }
}
