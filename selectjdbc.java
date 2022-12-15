import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class selectjdbc {
	public static void main(String[] args)throws Exception {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver Registered Success...........");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya","root","Priya@3010");
		 if(conn!=null) {
			 Statement stmt=conn.createStatement();
			 ResultSet rs=stmt.executeQuery("select *from player");
			 while(rs.next()) {
				 System.out.println(rs.getString("name")+"\t"+rs.getInt("pid")+"\t"+rs.getInt(3));
			 }
		 }else {
			 System.out.println("Not Connected");
		 }

	}
}
	
