package vn.org.gs1.gepir.load;

import java.sql.*;

public class DBConnection {
	private Connection con = null;

	public Connection getDBConnection() {
		try {
			// Load the SQLServerDriver class, build the
			// connection string, and get a connection
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl = "jdbc:sqlserver://TDTSQ\\SQLEXPRESS:51525;" + "instance=SQLEXPRESS"
					+ "databaseName=IDD;" + "user=sa;" + "password=nam41287";
			con = DriverManager.getConnection(connectionUrl);
			System.out.println("Connected to Database.");
			

		} catch (Exception e) {
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return con;
	}
	
	public void closeDB(Connection conn){
		try {
            con.close();
        } catch(Exception e) {
           
        }
	}
}
