import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Trash = "";
        String playerA = "";
        String playerB = "";
        String play = "y";
        while (play.equalsIgnoreCase("Y")) {

            System.out.println("Player A, Choose your weapon: [R,P,S]: ");
            if (in.hasNextLine()) {
                playerA = in.nextLine();
                while (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S")) {
                    System.out.println("Enter a valid response R, P or S.");
                    playerA = in.nextLine();
                }
                System.out.println("Player A chose " + playerA);
                {
                    System.out.println("Player B, Choose your weapon [R,P,S]: ");
                    {
                        if (in.hasNextLine())
                            playerB = in.nextLine();
                        while (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S")) {
                            System.out.println("Enter a valid response R, P or S.");
                            playerB = in.nextLine();
                        }
                        System.out.println("Player B chose " + playerB);

                        if (playerA.equalsIgnoreCase("R")) {
                            if (playerB.equalsIgnoreCase("R"))
                                System.out.println("Rock vs Rock, It's a Tie!");

                            else if (playerB.equalsIgnoreCase("S"))
                                System.out.println("Rock smashes scissors, Player A wins");

                            else if (playerB.equalsIgnoreCase("P"))
                                System.out.println("Paper covers Rock, Player B wins!");

                        }
                        if (playerA.equalsIgnoreCase("P")) {
                            if (playerB.equalsIgnoreCase("R"))
                                System.out.println("Paper covers Rock, Player A wins!");

                            else if (playerB.equalsIgnoreCase("S"))
                                System.out.println("Scissors cuts Paper, Player B wins");

                            else if (playerB.equalsIgnoreCase("P"))
                                System.out.println("Paper vs Paper, It's a Tie!");

                        }
                        if (playerA.equalsIgnoreCase("S")) {
                            if (playerB.equalsIgnoreCase("R"))
                                System.out.println("Rock smashes Scissors, Player B wins!");

                            else if (playerB.equalsIgnoreCase("P"))
                                System.out.println("Scissors cuts Paper, Player A wins");

                            else if (playerB.equalsIgnoreCase("S"))
                                System.out.println("Scissors vs Scissors, It's a Tie!");

                        }
                    }
                }
            }
            System.out.println("Play Again? [Y/N]");
            play = in.nextLine();
        }
    }
}



