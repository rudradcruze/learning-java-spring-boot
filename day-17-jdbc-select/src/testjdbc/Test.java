package testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ecommerce_springboot";
		String user = "root";
		String pass = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("Select * from categories");
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getString(4));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
