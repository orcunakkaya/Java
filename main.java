/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ercantopuz
 */
public class Login {

    static ResultSet yap() {
        ResultSet myRs=null;
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apatmanyonetim", "root", "123");

            Statement myStat=myConn.createStatement();
             myRs =myStat.executeQuery("select * from daire;");
                    

        } catch (Exception e) {
            e.printStackTrace();

        }
        return myRs;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
