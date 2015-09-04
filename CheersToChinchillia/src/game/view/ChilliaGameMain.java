package game.view;

import java.util.Scanner;

import game.models.FatChillia;
import game.models.Player;
import game.models.SlimChillia;

public class ChilliaGameMain {

	public static void main(String[] args) {
		gameMenu();
		System.exit(0);	
	} // End Main
	
	public static void mainGameLoop(SlimChillia p) {
		SlimChillia mainGameCharacters = p;
		while(mainGameCharacters.getHealth() != 0){
			//peform the game
		}
	}
	
	public static void characterCreationLoop() {
		// Choose your Chilla Character.
		FatChillia fatMan;
		SlimChillia slimMan;
		
		// While Chilla health is not zero continue game loop.
		Scanner sc = new Scanner(System.in);
		System.out.println("**** Chose your Chilla");
		System.out.println("**** 1) Fat Chilla \n 2) Slim Chilla");
		char input = sc.next().charAt(0);
		if(input == '1') {
			//fatMan = new FatMan();
		} else if(input == '2') {
			slimMan = new SlimChillia("Slim",10,10,1,2,2);
			mainGameLoop(slimMan);
		} else {
			characterCreationLoop();
		}
	}
	
	public static void chilliaStatus() {
		
	}
	
	public static void gameMenu() {
		// Main welcome banner
				System.out.print("\033[H\033[2J");  
				System.out.flush();  
				System.out.println("**************\nCheers to Chinchilla\n**************\n");
				System.out.println("Help Chinchilla journey through his ultimate quest of finding grape juice and donuts.\n\n");
				
				// Prompt to begin journey
				int BeginJourney = 0;
				Scanner User_Input = new Scanner(System.in);
				String UserInput;
				while ( BeginJourney < 1 ) {
					System.out.print("Do you want to assist Chinchilla on this epic quest? [y/n]: ");
					UserInput = User_Input.next( );
					switch (UserInput) {
						case "y":
							System.out.println("\nAwesome! Lets start the journey...\n");
							BeginJourney=2;
							break;
						case "n":
							System.out.println("\nBoo! You\'re useless anyways. Chinchilla completed his quest without you...\n");
							BeginJourney=1;
							break;
						default:
							System.out.println("Please only enter y or n, for Yes or No...duh...");
					}
				}

				// Start or Exit 
				switch (BeginJourney)  {
					case 2:
						System.out.println("\n...Initalizing the quest...\n");
						characterCreationLoop();
						
						break;	
					case 1:
						System.out.println("\n...You missed out. Come back again if you\'re not a party-pooper.\n");
						break;
					default:
						System.out.println("\n Something weird happened with the program. Not the end of the world...?");
						System.exit(3);
				}
			
	}
} // ChilliaGameMain
