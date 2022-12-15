package jdbcapp;
import java.sql.*;
public class jdbcfirst {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver Registered Success...........");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Priya@3010");
		 if(conn!=null) {
			 System.out.println("Database is connected");
		 }
		 else {
			 System.out.println("Not Connected");
		 }
		
		
	}

}
