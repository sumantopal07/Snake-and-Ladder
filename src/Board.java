import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private final int numberOfDice;
    private final int size;
    private int turn;
    private boolean moreTurns;
    private final boolean endAfterOneWinner;
    private final int[] grid;
    List<Player> players;
    Board(){
        moreTurns=false;
        numberOfDice=1;
        size=100;
        grid=new int[size+1];
        for(int i=0;i<=size;i++){
            grid[i]=i;
        }
        turn=0;
        endAfterOneWinner=true;
    }
    public Player move(){
        int score=0;
        Player player=players.get(turn);

        for(int rep=0;rep<numberOfDice;rep++){
            score += ThreadLocalRandom.current().nextInt(1, 6+1);
        }

        int currentPosition= player.getPosition()+score;
        if(currentPosition>size){
            return new Player();
        }
        while(grid[currentPosition]!=currentPosition) {
            currentPosition = grid[currentPosition];
        }
        player.setPosition(currentPosition);

        System.out.println(score+" "+ player.getName()+" score and final position "+ currentPosition);

        turn=(turn+1)%players.size();

        //If Player won
        if(state(currentPosition))
            return player;

        //If Player Lost send Invalid player
        return new Player();
    }

    public boolean state(int position){
        if(!endAfterOneWinner){
            /**
             * Not Implemented as its an optional Requirement
             * will look after if time permits
             * */
            return true;
        }
        return (position==size);
    }



    public void setPlayer(List<Player> players) {
        this.players = players;
    }



    public void setSnakes(List<Snake> snakes) {
        for(Snake snake : snakes){
            grid[snake.getStart()]=snake.getEnd();
        }
    }


    public void setLadders(List<Ladder> ladders) {
        for(Ladder ladder : ladders){
            grid[ladder.getStart()]=ladder.getEnd();
        }
    }
}
