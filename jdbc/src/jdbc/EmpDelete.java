package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		System.out.println("driver class found");
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String pass = "Wh0c@res123";
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection established");
		String query = "delete from employees where empcode = ?";
		PreparedStatement pst = conn.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 1; i++) {
			System.out.println("empcode = ");
			int empcode = sc.nextInt();
			pst.setInt(1, empcode);
			int rows = pst.executeUpdate();
			System.out.println(rows+"deleted");
		}
	}
}
