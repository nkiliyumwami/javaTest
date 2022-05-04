import org.w3c.dom.Text;

public class Testing {

	public static void main(String[] args) {

		/* for loop */
		
		for(int i = 0; i <=10; i++) {
			String text = "The number is: ";
			System.out.println(text + i);
		}
		
		/* while loop */
		
		int a = 0;
		
		while(a <=5) {
			String text = "Hello: ";
			System.out.println(text + a);
			a++;
		}
		
		
		/* conditional statements */
		
		int age = 40;
		char sex = 'M';
		double weight = 51.5;
		
		
		if(age >=18 && weight <=50) {
			System.out.println("You are eligible");
		} else {
			System.out.println("You will have to wait until you became 18 years and must be under 50kg by that time.");
		}
		
		/* switch statements */
		
		char grade = 'A';
		
		switch (grade) {
		case 'A':
			System.out.println("100%-90%");
			break;
		case 'B': 
			System.out.println("80%");
			break;

		default:
			System.out.println("Failed");
			break;
		}
	}

}
