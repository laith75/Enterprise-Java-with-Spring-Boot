import java.util.Scanner;

class Guesser
{
    // storing the guessed number
    int guessNum;

    // action of guessing the number and telling the empire
    public int guessNumber()
    {
        Scanner in = new Scanner(System.in);


        System.out.println("Guesser kindly guess the number between 1 and 10");
        boolean x = true;
        int a = 0;
        while (x)
        {
            guessNum = in.nextInt();
            if (guessNum > 0 && guessNum < 11)
            {
                a = guessNum;
                x = false;
            }
            else
            {
                System.out.println("Enter a number again between 1 and 10");
            }
        }
        return a;
    }
}

class player1
{
    // place to store the number guessed
    int playerGuessNum;

    // action of guessing
    public int guessNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("player 1 kindly guess the number");

        boolean x = true;
        int a = 0;
        while(x) {
            playerGuessNum = in.nextInt();
            if (playerGuessNum > 0 && playerGuessNum < 11)
            {
                a = playerGuessNum;
                x = false;
            }
            else
            {
                System.out.println("Enter a number again between 1 and 10");
            }


        }
        return a;
    }
}
class player2
{
    // place to store the number guessed
    int playerGuessNum;

    // action of guessing
    public int guessNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("player 2 kindly guess the number");

        boolean x = true;
        int a = 0;
        while(x) {
            playerGuessNum = in.nextInt();
            if (playerGuessNum > 0 && playerGuessNum < 11)
            {
                a = playerGuessNum;
                x = false;
            }
            else
            {
                System.out.println("Enter a number again between 1 and 10");
            }


        }
        return a;
    }
}
class player3
{
    // place to store the number guessed
    int playerGuessNum;

    // action of guessing
    public int guessNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("player 3 kindly guess the number");

        boolean x = true;
        int a = 0;
        while(x) {
            playerGuessNum = in.nextInt();
            if (playerGuessNum > 0 && playerGuessNum < 11)
            {
                a = playerGuessNum;
                x = false;
            }
            else
            {
                System.out.println("Enter a number again between 1 and 10");
            }


        }
        return a;
    }
}


// One player game
class UmpireOnePlayer
{
    int numFromGuesser;
    int numFromPlayer1;

    public void collectNumberFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNumber();
    }
    public void collectNumberFromPlayer()
    {

        player1 p1 = new player1();

        numFromPlayer1 = p1.guessNumber();

    }
    public void compare()
    {
        if(numFromGuesser == numFromPlayer1)
        {
            System.out.println("Player 1 won the game");
        }
        else
        {
            System.out.println("Game lost! try again");
        }

    }

}

// Two player game
class UmpireTwoPlayers
{
    int numFromGuesser;

    int numFromPlayer1;

    int numFromPlayer2;

    public void collectNumberFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNumber();
    }
    public void collectNumberFromPlayer()
    {

        player1 p1 = new player1();
        player2 p2 = new player2();
        player3 p3 = new player3();


        numFromPlayer1 = p1.guessNumber();
        numFromPlayer2 = p2.guessNumber();

    }
    public void compare()
    {
        if(numFromGuesser == numFromPlayer1)
        {
            if(numFromGuesser == numFromPlayer2 )
            {
                System.out.println(" Game tied, The two players guessed correctly ");
            }
            else
            {
                System.out.println("Player 1 won the game");
            }
        }



        else if (numFromGuesser == numFromPlayer2)
        {
            System.out.println("player 2 won the game");
        }

        else
        {
            System.out.println("Game lost! try again");
        }




    }



}



// Three player game
class UmpireThreePlayers
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;


    public void collectNumberFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNumber();
    }

    public void collectNumberFromPlayer()
    {

        player1 p1 = new player1();
        player2 p2 = new player2();
        player3 p3 = new player3();


        numFromPlayer1 = p1.guessNumber();
        numFromPlayer2 = p2.guessNumber();
        numFromPlayer3 = p3.guessNumber();
    }

    public void compare()
    {
        if(numFromGuesser == numFromPlayer1)
        {
            if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3 )
            {
                System.out.println(" Game tied, all three players guessed correctly ");
            }
            else if (numFromGuesser == numFromPlayer2)
            {
                System.out.println("Player 1 and 2 won the game ");
            }
            else if(numFromGuesser == numFromPlayer3)
            {
                System.out.println("player 1 and 3 won");
            }
            else
            {
                System.out.println("Player 1 won the game");
            }
        }



        else if (numFromGuesser == numFromPlayer2)
        {
            if(numFromGuesser == numFromPlayer3)
            {
                System.out.println("player 2 and player 3 won the game");
            }
            else
            {
                System.out.println("player 2 won the game");
            }
        }



        else if(numFromGuesser == numFromPlayer3)
        {
            System.out.println("player 3 won the game");
        }
        else
        {
            System.out.println("Game lost! try again");
        }
    }








}


public class LaunchGame {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int command = 0;
        boolean exit = false;
        printCommand();
        while(!exit)
        {
            System.out.println("Enter your command: ");
            command = in.nextInt();


            switch (command)
            {
                case 0:
                    printCommand();
                    break;
                case 1:
                    int a;
                    a = LaunchGame.ChosePlayerNumber();
                    switch (a)
                    {
                        case 1:
                            UmpireOnePlayer one = new UmpireOnePlayer();
                            one.collectNumberFromGuesser();
                            one.collectNumberFromPlayer();
                            one.compare();
                            break;
                        case 2:
                            UmpireTwoPlayers two = new UmpireTwoPlayers();
                            two.collectNumberFromGuesser();
                            two.collectNumberFromPlayer();
                            two.compare();
                            break;
                        case 3:
                            UmpireThreePlayers Three = new UmpireThreePlayers();
                            Three.collectNumberFromGuesser();
                            Three.collectNumberFromPlayer();
                            Three.compare();
                            break;

                    }
                    break;
                case 2:
                    exit = true;
                    break;
            }
        }



    }

    public static void printCommand()
    {
        System.out.println("Press 0 : To print instructions");
        System.out.println("Press 1 : Start the game");
        System.out.println("Press 2 : To exit the Game");
    }


    public static int ChosePlayerNumber()
    {
        int numberOfPlayers;

        System.out.println("3 is the maximum number of players");
        System.out.println("Enter the number of players ");
        Scanner in = new Scanner(System.in);

        boolean x = true;
        int a = 0;
        while(x) {
            numberOfPlayers = in.nextInt();
            if (numberOfPlayers > 0 && numberOfPlayers <= 3)
            {
                a = numberOfPlayers;
                x = false;
            }
            else
            {
                System.out.println("3 is the maximum number of players");
            }


        }
        return a;
    }

    }








