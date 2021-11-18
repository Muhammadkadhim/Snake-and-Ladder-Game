package snake_ladder;

import java.util.Scanner;

public class SnakeAndLadderGame {
	
	
	public static void main(String[] args) throws InterruptedException {

		System.err.println("\t\t <<< Welcom to Snakes and Ladders Game >>>"+"\n\n");
		
		
		
	Scanner input=new Scanner(System.in);
	System.out.println("Hi \nWrite down \"yes\" to Start the game....");
	String start=input.next();

	if(start.equalsIgnoreCase("yes")) {
		System.out.println();
		gameStarting();
	}
	

	
	}//main method
///////////////////////////////////////////////////////////////////////////////////	
	private static void gameStarting() throws InterruptedException {
		
	
		
		Scanner  input=new Scanner (System.in);
		
		
		System.out.println("Player one plaese write your name:");
		String playerOne=input.nextLine();
		
		input.nextLine();
		System.out.println("Player two plaese write your name:");
		String playerTwo=input.nextLine();	
		input.nextLine();
		
		
		 playerOne = (playerOne.equals(null)) ? "player one name is: "+playerOne : "player 1";
		 playerTwo = (playerOne.equals(null)) ? "player two name is: "+playerTwo : "player 2";
		
		 
		System.out.println("player one name is: "+playerOne);
		System.out.println("player two name is: "+playerTwo);
		System.out.println("-----------------------------------");
			input.nextLine();
		
			 int dice11=(int)(Math.random()*6)+1;
			 int dice22=(int)(Math.random()*6)+1;
			
			
			 System.out.println(playerOne+" throw your dice");
			 input.nextLine();
			 System.out.println("you rolled a : "+dice11);
			 System.out.println("-------------------------");
			 input.nextLine();
			 System.out.println(playerTwo+" thorw your dice");
			 input.nextLine();
			 System.out.println("you rolled a : "+dice22);
			
			 /////////////////////////////////////////////////////////////////////////////////
			
			int playerOnePosition=0;
			 int playerTwoPosition=0;
			 
			
			boolean sum=true;
			 
			while(sum) {
				
				 input.nextLine();
				
				
				 
				 playerOnePosition+=dice11;
				
				 if(playerOnePosition==4) {
					 playerOnePosition=14;
				 }
				 if(playerOnePosition==9) {
					 playerOnePosition=31;
				 }
				 if(playerOnePosition==20) {
					 playerOnePosition=38;
				 }
				 if(playerOnePosition==28) {
					 playerOnePosition=84;
				 }
				 if(playerOnePosition==40) {
					 playerOnePosition=59;
				 }
				 if(playerOnePosition==51) {
					 playerOnePosition=67;
				 }
				 if(playerOnePosition==63) {
					 playerOnePosition=81;
				 }
				 if(playerOnePosition==71) {
					 playerOnePosition=91;
				 }
				 if(playerOnePosition==101) {
					 playerOnePosition-=dice11;
				 }
				 /////////////
				 if(playerTwoPosition==17) {
					 playerTwoPosition=7;
				 }
				 if(playerTwoPosition==54) {
					 playerTwoPosition=34;
				 }
				 if(playerTwoPosition==62) {
					 playerTwoPosition=19;
				 }
				 if(playerTwoPosition==64) {
					 playerTwoPosition=60;
				 }
				 if(playerTwoPosition==87) {
					 playerTwoPosition=24;
				 }
				 if(playerTwoPosition==93) {
					 playerTwoPosition=73;
				 }
				 if(playerTwoPosition==95) {
					 playerTwoPosition=75;
				 }
				 if(playerTwoPosition==99) {
					 playerTwoPosition=78;
				 }
				 ////////////////////////
				 else if(playerOnePosition==102) {
					playerOnePosition-=dice11; 
				 }
				 else if(playerOnePosition==103) {
						playerOnePosition-=dice11; 
					 }
				 else if(playerOnePosition==104) {
						playerOnePosition-=dice11; 
					 }
				 else if(playerOnePosition==105) {
						playerOnePosition-=dice11; 
					 }
				 if(playerOnePosition==100) {
					 sum=false;
					
					 System.out.println(playerOne+" is on the square "+playerOnePosition+"\nCongartulation "+playerOne+" you win!!");
						break;
						
					}
				
				 input.nextLine();
				 
			 playerTwoPosition+=dice22;
			 
			
			 
			 if(playerTwoPosition==4) {
				 playerTwoPosition=14;
			 }
			 if(playerTwoPosition==9) {
				 playerTwoPosition=31;
			 }
			 if(playerTwoPosition==20) {
				 playerTwoPosition=38;
			 }
			 if(playerTwoPosition==28) {
				 playerTwoPosition=84;
			 }
			 if(playerTwoPosition==40) {
				 playerTwoPosition=59;
			 }
			 if(playerTwoPosition==51) {
				 playerTwoPosition=67;
			 }
			 if(playerTwoPosition==63) {
				 playerTwoPosition=81;
			 }
			 if(playerTwoPosition==71) {
				 playerTwoPosition=91;
			 }
			 ///////////////
			 if(playerTwoPosition==17) {
				 playerTwoPosition=7;
			 }
			 if(playerTwoPosition==54) {
				 playerTwoPosition=34;
			 }
			 if(playerTwoPosition==62) {
				 playerTwoPosition=19;
			 }
			 if(playerTwoPosition==64) {
				 playerTwoPosition=60;
			 }
			 if(playerTwoPosition==87) {
				 playerTwoPosition=24;
			 }
			 if(playerTwoPosition==93) {
				 playerTwoPosition=73;
			 }
			 if(playerTwoPosition==95) {
				 playerTwoPosition=75;
			 }
			 if(playerTwoPosition==99) {
				 playerTwoPosition=78;
			 }
			 
			 if(playerTwoPosition==101) {
				 playerTwoPosition-=dice22;
			 }
			 else if(playerTwoPosition==102) {
				 playerTwoPosition-=dice22; 
			 }
			 else if(playerTwoPosition==103) {
				 playerTwoPosition-=dice22; 
				 }
			 else if(playerTwoPosition==104) {
				 playerTwoPosition-=dice22; 
				 }
			 else if(playerTwoPosition==105) {
				 playerTwoPosition-=dice22; 
				 }
			 
			 
			 
			 if(playerTwoPosition==100) {
				 sum=false;
				 System.out.println(playerTwo+" is on the square "+playerTwoPosition+"\nCongratulation "+playerTwo+" you win!!");
					break;
				}
			
			 System.out.println(playerOne+" is on the square "+playerOnePosition);
			 System.out.println(playerTwo+" is on the square "+playerTwoPosition);
			
			}
			
			 ////////////////////////////////////////////////////////////////////////////////////
			
			 
	
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 }
	
	

}
}
