import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import com.mysql.cj.xdevapi.Statement;
public class insertjdbc {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver Registered Success...........");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya","root","Priya@3010");
		 if(conn!=null) {
			 System.out.println("Database is connected");
			 System.out.println("Database is Connected");
				java.sql.Statement stmt=conn.createStatement();
				int value= stmt.executeUpdate("insert into player values('0','ABCDE',4000)");
				if(value>0) {
					System.out.println("Record Save Success...............");
				}
				else {
					System.out.println("Some problem is there...............");
				}
		 }
		 else {
			 System.out.println("Not Connected");
		 }
		
	}

}
