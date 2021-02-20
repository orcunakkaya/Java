package Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {

    static ResultSet yap() {
        ResultSet myRs = null;

        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

            Statement myStat = myConn.createStatement();
            myRs = myStat.executeQuery("select * from daire;");

        } catch (Exception e) {
            e.printStackTrace();

        }
        return myRs;

    }

    public static void main(String[] args) {

    }

}