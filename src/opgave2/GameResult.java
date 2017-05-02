package opgave2;

public class GameResult {
    
    Player player;
    Player house;
    String result;
    
    public GameResult(Player player, Player house, String result) {
        this.player = player;
        this.house = house;
        this.result = result;
    }

    @Override
    public String toString() {
        return "GameResult{" + "player=" + player + ", house=" + house + ", result=" + result + '}';
    }
    
}
