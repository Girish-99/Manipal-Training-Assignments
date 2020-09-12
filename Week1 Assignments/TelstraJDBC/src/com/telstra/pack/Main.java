package com.telstra.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

	public static void main(String[] args) throws InstantiationException , IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/databasetelstra","root","Mysql123@");
        System.out.println("Connected database successfully...");
        Statement st = con.createStatement();
        ResultSet rs=st.executeQuery("Select * from  book");
//               System.out.println(rs);
                while(rs.next()){
                    // rs coloum index starts from 1
                    System.out.println(rs.getString(1)+"   "+rs.getInt(2));            
                    }
                con.close();

	}

}
