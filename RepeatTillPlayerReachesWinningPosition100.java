package Snake_and_Ladder_Problem;

import java.util.Random;

public class RepeatTillPlayerReachesWinningPosition100 {
    RepeatTillPlayerReachesWinningPosition100() {
        System.out.println();
    }

    public static void main(String[] args) {
        RepeatTillPlayerReachesWinningPosition100 a = new RepeatTillPlayerReachesWinningPosition100();
        int start_position = 0;
        int Player_Position = 0;
        int Winning_Position = 100;
        Random random = new Random();

        //Snake & Ladder game played with single played at start position.
        System.out.println("Single player at starting position " + start_position);

        //The player rolling die till reaches the winning position.
        do {
            int die = (random.nextInt(6) + 1);
            System.out.println("The Player rolls the die and get a random no between 1 to 6 : " + die);

            //Player checks for an option.
            int b = random.nextInt(3);
            Player_Position = Player_Position + die;
            switch (b) {
                case 0:
                    System.out.println("No play the player stays in the same position ");
                    System.out.println("Player current position : " + Player_Position);
                    break;
                case 1:
                    Player_Position = Player_Position + die;
                    System.out.println("Player gets Ladder & Player moves ahead by number of position received in the die : " + die);
                    System.out.println("Player current position : " + Player_Position);
                    break;
                case 2:
                    Player_Position = Player_Position - die;
                    if (Player_Position <= 0) {
                        Player_Position = 0;
                        System.out.println("Oops Snake byte and Player is Starting from zero");
                        System.out.println("Player current position is : " + Player_Position);
                    } else {
                        System.out.println("Oops Snake bytes and Player moves behind by number of position : " + die);
                        System.out.println("Player current position is : " + Player_Position);
                    }
                    break;
            }
        }
        while (Player_Position != Winning_Position && Player_Position <= Winning_Position);
        System.out.println("Player reaches the winning position");
    }
}