import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.*;

public class deletejdbc {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver Registered Success...........");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya","root","Priya@3010");
		 if(conn!=null) {
			 System.out.println("Database is Connected");

				Statement stmt = conn.createStatement();
				Scanner xyz = new Scanner(System.in);
				System.out.println("Enter the player id ");
				int pid = xyz.nextInt();
				 
				int value = stmt.executeUpdate("delete from player where pid="+pid+"");
				if (value > 0) {
					System.out.println("Product Deleted Success..............");
				} else {
					System.out.println("Some problem is there...............");
				}
			} 
		else {
			 System.out.println("Not Connected");
		 }

	}

}
