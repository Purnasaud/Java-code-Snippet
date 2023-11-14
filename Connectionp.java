package purna;
import java.sql.Connection;
import java.sql.DriverManager;
public class Connectionp {
	private static Connection co;
		public static Connection create() {
		try 
		{
			Class.forName("org.postgresql.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			
		} 
		 try {
	  String url = "jdbc:postgresql://localhost:5432/student_manage";
	  String user ="postgres";
	 String password="1575";
	 co= DriverManager.getConnection(url,user,password);
	 }
	 catch (Exception e)
	 {
		 e.printStackTrace();
 }
		 return co;
		
	}
}

