import java.util.*;

class Guesser
 {

  int guessNum;

  int guessingNumber()

     {
       
       Scanner scan =new Scanner(System.in);
       System.out.println("Guesser kindly guess the number");
       guessNum=scan.nextInt();
       return guessNum;
    }

}

class Player
 {
      int guessNum;
      int guessingNumber(){
         Scanner scan = new Scanner(System.in);
         System.out.println("player ! kindly guess the number");
         guessNum = scan.nextInt();
         return guessNum;
        }
        
      }



class Umpire
 {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;


    void collerctNumFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumFromPlayers()
    {
       Player p1 = new Player();
       Player p2 = new Player();
       Player p3 = new Player();
       numFromPlayer1=p1.guessingNumber();
       numFromPlayer2=p2.guessingNumber();
       numFromPlayer3=p3.guessingNumber();
    }

    void compare()
    {
        if( numFromGuesser == numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
                System.out.println("evey one is winnner");
            }
            else if (numFromGuesser==numFromPlayer2){
                System.out.println(" player 1 amd palyer 2 winnner hain");
            }

            else if (numFromGuesser==numFromPlayer3){
                System.out.println(" Player 1sth and 3rd won the Game");
            }

            else{
                System.out.println("Player !st won the Game");
            }

        }

        else if(numFromGuesser==numFromPlayer2){

            if(numFromGuesser==numFromPlayer3){
                System.out.println("player 2 and player 3 won the game ");
            }
            else{
                System.out.println("player 2 won the game");
            }
           
        }

        else if (numFromGuesser==numFromPlayer3){
            System.out.println("player 3 won the game");
        }

        else{
            System.out.println("Not Matched");
        }
    }
}




public class LunchedGame {
   public static void main(String[] args) {
     System.out.println("Game Started");
    Umpire u= new Umpire();
    u.collerctNumFromGuesser();
    u.collectNumFromPlayers();
    u.compare();
   } 
}
