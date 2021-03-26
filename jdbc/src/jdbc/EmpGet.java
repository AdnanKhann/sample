package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.postgresql.Driver;
public class EmpGet {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new Driver());
		System.out.println("driver class present");
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String pass = "Wh0c@res123";
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("connection established");
		String query = "select * from emp where empno = 1131";
		PreparedStatement pst = conn.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getDate("hiredate")+" "+rs.getDouble(6)+" "+rs.getDouble(7)+" "+rs.getInt(8));
		}
	}
}
