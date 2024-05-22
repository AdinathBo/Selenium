package bankmanagementsystem;
import java.sql.*;

public class Conn {
	
	Connection c;
	Statement s;
	public Conn () {
		try {
			
			// load the jdbc driver 
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//create connection
			//String url = "jdbc:oracle:thin:@localhost:1521:ORCL";

			c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "sys", "Admin@123");
			s = c.createStatement();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
