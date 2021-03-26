package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class EmpAdd {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		Class.forName("org.postgresql.Driver");
		System.out.println("driver class present");
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String pass = "Wh0c@res123";
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("connection established");
		String query = "insert into emp values(?,?,?,?,?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<8;i++)
		{
			System.out.println("enter empno");
			int empno = sc.nextInt();
			System.out.println("enter ename");
			String ename = sc.next();
			System.out.println("enter job");
			String job = sc.next();
			System.out.println("enter mgr");
			int mgr = sc.nextInt();
			System.out.println("enter hiredate");
			String date = sc.next();
			System.out.println("enter sal");
			double sal = sc.nextDouble();
			System.out.println("enter comm");
			double comm = sc.nextDouble();
			System.out.println("enter deptno");
			int deptno = sc.nextInt();
			pst.setInt(1,empno);
			pst.setString(2, ename);
			pst.setString(3, job);
			pst.setInt(4,mgr);
			pst.setDate(5, Date.valueOf(date));
			pst.setDouble(6,sal);
			pst.setDouble(7, comm);
			pst.setInt(8,deptno);
			int rows = pst.executeUpdate();
			System.out.println(rows+" inserted");
		}

	}

}
