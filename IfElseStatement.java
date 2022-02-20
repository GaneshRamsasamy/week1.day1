package week1.day2;

// Shortcut key: type syso & cntrl+space
public class IfElseStatement {
	
	public static void main(String[] args) {
		int age = 25;
		
		if(age < 15) {
		System.out.println("Minor");
		} else if (age >= 18 && age < 60) {
			
			System.out.println("Adult");
		} else {
			System.out.println("Senior Citizen");
		}
		
	}
}