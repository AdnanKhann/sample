package jdbc;

import java.sql.*;
import java.sql.Connection;
import org.postgresql.Driver;

public class getData {
	public static void main(String[] args) throws SQLException{
		DriverManager.registerDriver(new Driver());
		System.out.println("driver class Present");
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String pass = "Wh0c@res123";
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("connection established");
		String query = "select * from department";
		PreparedStatement pst = conn.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString("deptname")+" "+rs.getString(3));
		
	}

}
