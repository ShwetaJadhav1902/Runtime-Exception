package runtimeexception;
import java.util.Scanner;


public class MainApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Email:");
		String Email=sc.next();
		
		if(Email.contains("@")&&(Email.contains(".com")))
		{
			System.out.println("valid Email");
		}
		else {
			try {
			throw new InvalidEmailException("Invalid Email");
		}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
