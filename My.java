package purna;
import java.sql.*;
import java.util.Scanner;
public class My { 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Press 1 to ADD students");
	System.out.println("Press 2 to Delete Students");
	System.out.println("Press 3 to Display students");
	System.out.println("Press 4 to exit app");
	int c= sc.nextInt();
	switch (c)
	{
	case 1:
	    boolean flag= true;
		System.out.println("Enter the name of the students");
		String n=sc.next();
		System.out.println("Enter the phoneNumber");
		String p= sc.next();
		System.out.println("Enter City");
		String ci= sc.next();
		String q= "INSERT INTO students (s_name,s_phone,s_city) VALUES (?,?,?)";
		try
		{
		Connection con= Connectionp.create();
		PreparedStatement pst= con.prepareStatement(q);
		 pst.setString(1,n);
		 pst.setString(2,p); 
		 pst.setString(3,ci);
		 pst.executeUpdate();
		 flag=false;
		if(flag==false)
		{
			System.out.println("Data base updated Successfully");
		}
		else
		{
			System.out.println("Sorry something went wrong");
		}
		
	}
	catch (Exception e)
	{
      e.printStackTrace();
	}
		break;
	case 2:
		boolean f= false;
		System.out.println("Enter name of the Students");
		String x= sc.next();
		String qu="DELETE FROM students WHERE s_name= ?";
		try
		{
			Connection conn= Connectionp.create();
			PreparedStatement ps= conn.prepareStatement(qu);
			ps.setString(1,x);
			ps.executeUpdate();
			f=true;
			if (f==true)
			{
				System.out.println("Your records are deleted successfully...........");
			}
			else
			{
				System.out.println("Sorry something went wrong !!!!!");
			}
			
					}
		catch (Exception exc)
		{
			exc.printStackTrace();
		}
		break;
	case 3:
		System.out.println();
		try
		{
			String que=  "SELECT * FROM students";
			Connection connection = Connectionp.create();
			Statement st= connection.createStatement();
			ResultSet set= st.executeQuery(que);
			while(set.next())
			{
				 String  name= set.getString("s_name");
				 String number=set.getString("s_phone");
				 String city= set.getString("s_city");
				 int id= set.getInt("s_id");
				 System.out.println("name: " + name);
				 System.out.println("Number: " + number);
				 System.out.println("City: " + city);
				 System.out.println("Id: " + id);
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		break;
      default:
		System.out.println("Error..........");
		break;
}
}
}