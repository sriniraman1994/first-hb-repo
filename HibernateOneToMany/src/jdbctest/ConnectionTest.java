package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	public static void main(String[] args) {
		String jdbc = "jdbc:mysql://localhost:3306/jinji_one_to_one?useSSl=false";
		String username = "jinji";
		String password = "jinji";
		try{
			System.out.println("connecting to db");
			Connection con = DriverManager.getConnection(jdbc, username, password);
		
			System.out.println("Db Connected");
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
