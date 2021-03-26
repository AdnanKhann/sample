package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		System.out.println("driver class found");
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String pass = "Wh0c@res123";
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection established");
		String query = "update emp set sal = ? where empno =?";
		PreparedStatement pst = conn.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<1;i++)
		{
			System.out.println("set salary = ");
			double sal = sc.nextDouble();
			System.out.println("where empno = ");
			int empno = sc.nextInt();
			pst.setDouble(1, sal);
			pst.setInt(2, empno);
			int rows = pst.executeUpdate();
			System.out.println(rows+"inserted");
		}
		
	}

}
