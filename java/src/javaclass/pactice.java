package javaclass;
import java.util.Scanner;

public class pactice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String userName = sc.nextLine();
		String password = sc.nextLine();
		
		if(userName.equals("prabakaran") && password.equals("955345"))
		{
			System.out.println("Login Successful");	
	}
		else
		{
			System.out.println("Login Failed");
		}
		
		sc.close();

	}

}
