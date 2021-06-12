public class Player {
    private String name;
    private int rank;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    Player(){
        name="INVALID";
        rank=-1;
        position=0;
    }

    public Player(String name) {
        this.name = name;
        rank=-1;
        position=0;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Player setName(String name) {
        this.name = name;
        return null;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", position=" + position +
                '}';
    }
}
