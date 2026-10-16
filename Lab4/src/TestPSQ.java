import java.util.Scanner;

public class TestPSQ {
	
	public static void displayMenu() {
		System.out.println("Welcome to PrintServer! Please select a number from the list.");
		System.out.println("1. Enqueue a job (User enters job details).");
		System.out.println("2. Dequeue a job");
		System.out.println("3. Peek at the job at front of the queue");
		System.out.println("4. Empty the queue");
		System.out.println("5. Display all jobs");
		System.out.println("6. Quit the program");
	}
	
	public static void main(String[] args) {
		
		QueueArrayBased q = new QueueArrayBased();
		Scanner input = new Scanner(System.in);
		
		int response;
		
	
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		
		System.out.println("Dequeued num: " + q.dequeue());
		System.out.println("Front num: " + q.peek());
		System.out.println("is the queue empty?: " + q.isEmpty());
		
		System.out.println();
		
		do {
			displayMenu();
			System.out.print("Enter the number: ");
			response = input.nextInt();
			switch(response) {
			case 1:
				System.out.println("1. Enqueue a job (User enters job details).");
				String s1 = input.nextLine();
				break;
			case 2:
				System.out.println("2. Dequeue a job");
				String s2 = input.nextLine();
				break;
			case 3:
				System.out.println("3. Peek at the job at front of the queue");
				String s3 = input.nextLine();
				break;
			case 4:
				System.out.println("4. Empty the queue");
				String s4 = input.nextLine();
			case 5:
				System.out.println("5. Display all jobs");
				String s5 = input.nextLine();
			case 6:
				System.out.println("6. Quit the program");
				String s6 = input.nextLine();
				break;
			}
			
			
		} while (response != 6);
		
		
	
		
		
		
		
	}
	
	

}
