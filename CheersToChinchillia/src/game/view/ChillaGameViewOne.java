package game.view;

import java.util.Scanner;

import game.models.FatChillaE;
import game.models.LevelOneAttack;
import game.models.PlayerE;

public class ChillaGameViewOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		welcomeMessage();
		double playerType = choosePlayer(input);
		PlayerE chilla = null;
		int choice = 0;
		while (choice == 0) {
			if (playerType == 1) {
				chilla = createFatChilla();
				choice = 1;
			} else if (playerType == 2) {
				//chilla = createSlimChilla();
				choice = 1;
			} else {
				System.out.println("Invalid Choice");
				playerType = choosePlayer(input);
			}
		}
		mainGameLoop(chilla);
	}
	
	public static void welcomeMessage() {
		System.out.println("ChinChilla v1.0");
		
	}
	
	public static Integer choosePlayer(Scanner input) {
		System.out.println("Choose your Chilla: \n 1) \n Slim 2) Fat");
		String userInput = input.next();
		if(userInput.equals("1")) {
			return 1;
		} else if (userInput.equals("2")) {
			return 2;
		} else {
			return 0;
		}
	}
	
	public static FatChillaE createFatChilla(){
		FatChillaE chilla = new FatChillaE("George");
		return chilla;
	}

	public static void mainGameLoop(PlayerE chilla) {
		while(chilla.getHealth().getHealth() != 0) {
			System.out.println("THIS IS THE MAIN GAME LOOP");
			chilla.getHealth().setHealth(0.0);
			// Let player move()
			// On random let the player encounter an enemy or food.
			boolean isLevelOne = false;
			if(isLevelOne) {
				LevelOneAttack attackL1 = new LevelOneAttack();
				chilla.setAttack(attackL1);
			}
		}
	}
}
