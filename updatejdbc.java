
import java.sql.*;
import java.util.*;
public class updatejdbc {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver Registered Success...........");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya","root","Priya@3010");
		 if(conn!=null) {
			 System.out.println("Database is Connected");
			 Scanner xyz  = new Scanner(System.in);
			System.out.println("Enter the id,playername and runs");
			int pid=xyz.nextInt();
			String name=xyz.nextLine();
			int run_record=xyz.nextInt();
			Statement stmt=conn.createStatement();
			int value=stmt.executeUpdate("insert into player values('"+pid+"','"+name+"',"+run_record+")");
			if(value>0) {
				System.out.println("Record Save Success...............");
			}
			else {
				System.out.println("Some problem is there...............");
			}
		}else {
			 System.out.println("Not Connected");
		 }

	}

}
