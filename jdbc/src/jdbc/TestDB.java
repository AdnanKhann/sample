package jdbc;

import java.sql.*;
import java.util.Scanner;

public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		System.out.println("driver class present");
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String pass = "Wh0c@res123";
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("connection established");
		/*String query = "insert into department values(40,'DELIVERY','HYD')";
		Statement st = conn.createStatement();
		st.executeUpdate(query);
		System.out.println("inserted");*/
		/*String query = "insert into department values(?,?,?)";
		PreparedStatement pst = conn.prepareStatement(query);
		pst.setInt(1, 70);
		pst.setString(2, "MARKETING");
		pst.setString(3, "CHENNAI");
		int rows = pst.executeUpdate();
		System.out.println(rows+" inserted ");*/
		String query = "insert into department values(?,?,?)";
		PreparedStatement pst = conn.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter deptno");
			int id = sc.nextInt();
			System.out.println("enter deptname");
			String type = sc.next();
			System.out.println("enter location");
			String loc = sc.next();
			pst.setInt(1,id);
			pst.setString(2,type);
			pst.setString(3,loc);
			int rows = pst.executeUpdate();
			System.out.println(rows+" inserted");
		}
		}
}
