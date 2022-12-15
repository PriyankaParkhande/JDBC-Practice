
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class selectspecificrowjdbc {
	public static void main(String[] args)throws Exception
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya","root","Priya@3010");
		if(conn!=null) {
			System.out.println("db connected");
			Scanner xyz  = new Scanner(System.in);
			System.out.println("Enter the player name");
			String name=xyz.nextLine(); //JAVA
		 Statement stmt=conn.createStatement();
		 ResultSet rs=stmt.executeQuery("select *from player where name='"+name+"'");
		 if(rs.next()) {
			 System.out.println("player Found");
		 }
		 else {
			 System.out.println("player not found");
		 }
		}
		else {
			System.out.println("Not Connected");
		}
	}

}
