
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
		
		if((int) (Math.random() * 100 + 1) == 1) {
			System.out.println("You have all the correct paperwork and should be good to go now. Have a nice day!");
		}
		else {
			System.out.println("You didn't even bring the paperwork? You can't blame us for the wait times, this is all your own fault! Mwa ha ha!");
		}

	}
	
}
