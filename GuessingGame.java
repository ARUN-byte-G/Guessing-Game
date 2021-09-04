import java.util.Scanner ;

class Game{
    void startgame(){
        int time ;
        System.out.println("Enter the Number of Times : ");
        Scanner in = new Scanner(System.in);
        time = in.nextInt();
        

        while(time>0){
            
            // Entering the Player Input in Player variables
            Guessing P1 = new Guessing();
            Guessing P2 = new Guessing();
            Guessing P3 = new Guessing();

            // Extra Using things for output .

            String result = "Hihi";
            boolean win = false ;
            System.out.println("I’m thinking of a number between 0 and 9...");
            // Generating a Random Number

            int target = ( int )(Math.random()*10);

            //Checking the and finding the winning candidate
            System.out.print("Player One , guess your Number : ");
            
            if (P1.Guess() == target) {
                win = true;
                result = "First Player.";
            }

            System.out.print("Player Second , guess your Number : ");

            if (P2.Guess() == target) {
                win = true ;
                result = "Second Player.";
            }

            System.out.print("Player Third , guess your Number : ");
            
            if (P3.Guess() == target){
                win = true ;
                result = "Third Player.";
            }
            
            if (win == true) {
                System.out.println("\n\nWe got a Winner .");
                System.out.println("\nThe Winner is : "+result);
                break ;
            }           
            System.out.println("\n\nTry Again  , Buddies ......\n\n");
            time--;
        }
        in.close();
        
    }
}

class Guessing{
    int Guess(){
    int n ;
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    return n;
    }
}

public class GuessingGame {
    public static void main(String[] args) {
        Game start = new Game();
        start.startgame();
        
    }
    
}
