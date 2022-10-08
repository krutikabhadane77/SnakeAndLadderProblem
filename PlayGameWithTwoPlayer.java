package Snake_and_Ladder_Problem;

import java.util.Random;

public class PlayGameWithTwoPlayer {
    PlayGameWithTwoPlayer(){
        System.out.println();
    }
    public static void main(String[] args){
        PlayGameWithTwoPlayer a=new PlayGameWithTwoPlayer();
        String p1="player1";
        String p2="player2";
        int start_position=0;
        int Player1_Position = 0;
        int Player2_Position = 0;
        int Winning_Position = 100;
        int p1_count=getcount(p1,Player1_Position,Winning_Position);
        int p2_count=getcount(p2,Player2_Position,Winning_Position);

        //Compare player1 & player2 and find winner.
        if (p1_count>p2_count)
            System.out.println(p2+ " is winner");
        else if (p1_count<p2_count) {
            System.out.println(p1+ " is winner");
        }
        else
            System.out.println("Exit");
        }
        public static int getcount(String name,int Player_Position,int Winning_Position)
        {
            Random random = new Random();
            int die_count=0;
            do {
                int die = (random.nextInt(6) + 1);
                die_count++;
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
                if (Player_Position > Winning_Position)
                {
                    Player_Position -= die;
                    System.out.println("Position goes beyond 100.\nSo no play - Player stays in the same position ");
                    System.out.println("Player current position is : " + Player_Position);
                    System.out.println("The number required by the player is : "+(Winning_Position-Player_Position));
                }
            }
            while (Player_Position != Winning_Position);//Check exact winning position
            System.out.printf("Player reaches the exact winning position " ,name);
            System.out.println("The number of times the dice was rolled is : "+die_count);
            return die_count;
        }
}

