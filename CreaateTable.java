package jdbcprctise3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreaateTable {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		
		
		// By using Static Way
		
		
		
		// table creation
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4? createDatabaseIfNotExist=true","root","root");
		Statement sta = con.createStatement();
		sta.execute("create table if not exists student(id int primary key, name varchar(20), phone long, email varchar(20))");
		sta.close();
		con.close();
		System.out.println("created table........");
		
		
		// insert values into database
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4? createDatabaseIfNot=true","root","root");
		Statement sta1 = con1.createStatement();
		sta1.execute("insert into student values(3,'S',23456,'s@gmail.com')");
		sta1.execute("insert into student values(4,'K',45673,'k@gmail.com')");
		sta1.close();
		con1.close();
		System.out.println("inserted into table.......");
//		
		
		// delete values into database
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4? createDatabaseIfNotExit=true","root","root");
		Statement sta2 = con2.createStatement();
		sta2.execute("delete from student where id=3");
		sta2.close();
		con2.close();
		System.out.println("deleted into table........");
		
		
		// update values into database
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4? createDatabaseIfNotExit=true","root","root");
		Statement sta3 = con3.createStatement();
		sta3.execute("update student set name='mouli' where id=5");
		sta3.execute("update student set email='m@gmail.com' where id=5");
		sta3.close();
		con3.close();
		System.out.println("updated into table........");
		
		
		// fetch values into database
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4? createDatabaseIfNotExit=true","root","root");
		Statement sta4= con4.createStatement();
		ResultSet rs = sta.executeQuery("select * from student where id=1");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getLong(3));
			System.out.println(rs.getString(4));
		}
		sta4.close();
		con4.close();
		System.out.println("fetched into table........");
		
		
		
		
		// By using Dynamic Way
		
		
		
		// insert values into database using prepared statement
//		System.out.println("enter the id");
//		int id = scan.nextInt();
//		System.out.println("enter the name");
//		String name = scan.next();
//		System.out.println("enter the phone number");
//		long phone = scan.nextLong();
//		System.out.println("enter the email");
//		String email = scan.next();
//		System.out.println("inserted into table........");
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4? createDatabaseIfNotExit=true","root","root");
//		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
//		ps.setInt(1, id);
//		ps.setString(2, name);
//		ps.setLong(3, phone);
//		ps.setString(4, email);
//		ps.execute();
//		ps.close();
//		con.close();
		
		
		// delete values into database using prepared statement
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4? createDatabaseIfNotExist=true","root","root");
//		PreparedStatement ps1 = con1.prepareStatement("delete from student where id=5");
//		ps1.execute();
//		ps1.close();
//		con1.close();
//		System.out.println("deleted into table........");
		
		
		// update values into database using prepared statement
//		System.out.println("enter the name");
//		String name = scan.next();
//		System.out.println("enter the id");
//		int id = scan.nextInt();
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4? createDatabaseIfNotExist=true","root","root");
//		PreparedStatement ps2 = con2.prepareStatement("update student set name=? where id=?");
//		ps2.setString(1, name);
//		ps2.setInt(2, id);
//		ps2.execute();
//		ps2.close();
//		con2.close();
//		System.out.println("updated into table........");
		
		
		// fetch values into database using prepared statement
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4? createDatabaseIfNotExist=true", "root", "root");
//		PreparedStatement ps3 = con3.prepareStatement("select * from student where id=?");
//		System.out.println("enter the id");
//		int id = scan.nextInt();
//		ps.setInt(1, id);
//		ResultSet rs = ps.executeQuery();
//		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getLong(3));
//			System.out.println(rs.getString(4));
//			
//		}
//		ps3.close();
//		con3.close();
		
		
		
	}

}
