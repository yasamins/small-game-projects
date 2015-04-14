package lab11;

import java.util.Scanner;

public class CommandInterpreter {

	public void run() {
		Scanner s = new Scanner(System.in);
		Dictionary d = new Dictionary();
		boolean done = false;

		while(!done) {
			System.out.print("Yes, Sir? ");
			String userInput = s.nextLine();
			
			System.out.println("userInput = " + userInput);
			String command = d.synonymFor(userInput);
			System.out.println("command = " + command);

			if(command == null) {
				System.out.println("I dont understand you.");
			} else {
				if(command.equals("run")) {
					System.out.println("I will " + userInput);
				} else if(command.equals("quit")) {
					System.out.println("I will " + userInput);
					done = true;
				}
			}
		}
		System.out.println("Thank you.");
	}

}
