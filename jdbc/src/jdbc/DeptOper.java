package jdbc;

import java.sql.*;
import org.postgresql.Driver;

public class DeptOper {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new Driver());
		System.out.println("driver class present");
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String pass = "Wh0c@res123";
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("connection established");
		String query = "update department set location=? where deptno=?";
		PreparedStatement pst = conn.prepareStatement(query);
		pst.setString(1, "MANGALORE");
		pst.setInt(2, 40);
		int rows = pst.executeUpdate();
		System.out.println(rows+" updated");
	}

}
