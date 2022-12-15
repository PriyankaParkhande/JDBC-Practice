
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class likeopjdbc {
	public static void main(String[] args)throws Exception
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya","root","Priya@3010");
		if(conn!=null) {
			Scanner xyz  = new Scanner(System.in);
			 
		 Statement stmt=conn.createStatement();
		 ResultSet rs=stmt.executeQuery("select *from player where name like 'i%'");
		 while(rs.next()) {
			System.out.println(rs.getInt("pid")+"\t"+rs.getString("name")+"\t"+rs.getInt("run_record"));
		 }
		 
		}
		else {
			System.out.println("db Not Connected");
		}
	}

}


