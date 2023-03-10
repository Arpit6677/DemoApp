package test;

import java.util.Scanner;

class OverAgeException extends Exception {
	OverAgeException(String msg) {
		super(msg);
	}

}

class UnderAgeException extends Exception {

	UnderAgeException(String msg) {
		super(msg);
	}
}

class Applicant {
	int age;

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ur age:");
		age = scan.nextInt();

	}

	public void verify() throws UnderAgeException, OverAgeException {

		if (age < 18) {
			UnderAgeException uae = new UnderAgeException("u r not eligible below 18");
			System.out.println(uae.getMessage());
			throw uae;
			
		} else if (age > 60) {
			OverAgeException oea = new OverAgeException("u r not eligible over age 60");
			System.out.println(oea.getMessage());
			throw oea;
		}else {
			System.out.println("u r eligible");
		}
	}

}
 class Rto{
	 
	 public void rtoVerification(){
	 Applicant ap=new Applicant();
	 
	 try {
		 ap.input();
		ap.verify();
	} catch (UnderAgeException|OverAgeException e) {
		// TODO Auto-generated catch block
		
		 try {
			 ap.input();
			ap.verify();
		} catch (UnderAgeException|OverAgeException e1) {
			// TODO Auto-generated catch block
			System.out.println("dont try again");
			
		} 
	} 
	 }
 }

public class MainTest {
	public static void main(String[] args) {
Rto r=new Rto();
r.rtoVerification();
	}
}
