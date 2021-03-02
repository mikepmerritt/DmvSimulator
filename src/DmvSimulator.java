
public class DmvSimulator {

	public static void main (String[] args) {
		System.out.println("Hello, welcome to the DMV!");
		
		int userNumber = (int) (Math.random() * 200 + 1);
		System.out.println("Your number is " + userNumber + ". Please wait until your number is called.");
		
		for(int calledNumber = userNumber + 1; calledNumber != userNumber; calledNumber++) {
			if(calledNumber > 200) {
				calledNumber -= 200;
			}
			System.out.println("Now serving: " + calledNumber);
		}
		System.out.println("Now serving: " + userNumber);
		
		System.out.println("Sorry, we cannot help you, as you do not appear to have the required paperwork.");
	}
	
}
