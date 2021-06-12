import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Snake> snakes = new ArrayList<>();
        ArrayList<Ladder> ladders = new ArrayList<>();

        snakes.add(new Snake(62,5));
        snakes.add(new Snake(33,6));
        snakes.add(new Snake(49,9));
        snakes.add(new Snake(88,16));
        snakes.add(new Snake(41,20));
        snakes.add(new Snake(56,53));
        snakes.add(new Snake(98,64));
        snakes.add(new Snake(93,73));
        snakes.add(new Snake(95,75));


        ladders.add(new Ladder(2,37));
        ladders.add(new Ladder(27,46));
        ladders.add(new Ladder(10,32));
        ladders.add(new Ladder(51,68));
        ladders.add(new Ladder(61,79));
        ladders.add(new Ladder(65,84));
        ladders.add(new Ladder(71,91));
        ladders.add(new Ladder(81,100));

        players.add(new Player("Gaurav"));
        players.add(new Player("Sagar"));

        Board board = new Board();

        board.setLadders(ladders);
        board.setPlayer(players);
        board.setSnakes(snakes);

        while(true){
            Player currentPlayer = board.move();
            if(!currentPlayer.getName().equals("INVALID")){
                System.out.println(currentPlayer.getName()+" WON!!!");
                break;
            }
        }
    }
}


