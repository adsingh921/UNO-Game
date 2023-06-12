
package unoGame;

//import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			//This is printing from Card class
			Card myTable = new Card();
			myTable.playTable();
			//This is printing from Deck class 
			Deck myWork = new Deck();
			myWork.playGame();
			// This is reading from Hand Class.
			Hand myHand = new Hand();
			myHand.playHand();
	}

}
