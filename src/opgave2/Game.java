package opgave2;

import java.util.Scanner;

public class Game {
    Player player, house;

    public Game(Player player, Player house) {
        this.player = player;
        this.house = house;
    }
    
    public GameResult playGame1(){
        int playerCount = 0;
        int houseCount = 0;
        for(int i=1; i<=10; i++ ) {
            Die die = new Die(6);
            playerCount += die.throwDie();
            houseCount += die.throwDie();
        }
        player.setPoints(playerCount);
        house.setPoints(houseCount);
        
        if(playerCount > houseCount)
            return new GameResult(player, house, "player wins");
        return new GameResult(player, house, "house wins");
    }
    
    public GameResult playGame2(){
        int playerCount = 0;
        int houseCount = 0;
        for(int i=1; i<=5; i++ ) {
            Die die12 = new Die(12);
            playerCount += die12.throwDie();
            houseCount += die12.throwDie();
            Die die24 = new Die(24);
            playerCount += die24.throwDie();
            houseCount += die24.throwDie();
        }
        player.setPoints(playerCount);
        house.setPoints(houseCount);
        
        if(playerCount > houseCount)
            return new GameResult(player, house, "player wins");
        return new GameResult(player, house, "house wins");
    }
    
    public GameResult playGame3() {
        int playerCount = 0;
        int houseCount = 0;
            Die die = new Die(6);
            playerCount += die.throwDie();
            houseCount += die.throwDie();
            
            if(playerCount <= 3) {
                Die die1 = new Die(12);
                playerCount += die.throwDie();
                houseCount += die.throwDie();
            }
            else {
                Die die1 = new Die(10);
                playerCount += die.throwDie();
                houseCount += die.throwDie();
            }
        
        player.setPoints(playerCount);
        house.setPoints(houseCount);
        
        if(playerCount > houseCount)
            return new GameResult(player, house, "player wins");
        return new GameResult(player, house, "house wins");
    }
    
    public static void main(String[] args) {
        
        System.out.print("Insert name:");
        String name = new Scanner(System.in).next();
        System.out.println();
        
       
        
        Game game = new Game(new Player(name,0),new Player("House",0));
        short continueLoop = 0;
        do {
            System.out.print("Which game you want to play(1-3)?");
            int option = new Scanner(System.in).nextInt();
            if(option == 1) {
                GameResult result = game.playGame1();
                System.out.println("Ten 6 sided cubes roll for you...");
                System.out.println("your point: " + game.player.getPoints());

                System.out.println("Ten 6 sided cubes roll for house...");
                System.out.println("House's point: " + game.house.getPoints());
                System.out.println(result.toString());
            } else if(option == 2) {
                GameResult result = game.playGame2();
                System.out.println("five 12 sided, five 24 sided cubes roll for you...");
                System.out.println("your point: " + game.player.getPoints());

                System.out.println("five 12 sided, five 24 sided cubes roll for house...");
                System.out.println("House's point: " + game.house.getPoints());
                System.out.println(result.toString());
            } else if(option == 3) {
                GameResult result = game.playGame3();
                System.out.println("five 12 sided, five 24 sided cubes roll for you...");
                System.out.println("your point: " + game.player.getPoints());

                System.out.println("five 12 sided, five 24 sided cubes roll for house...");
                System.out.println("House's point: " + game.house.getPoints());
                System.out.println(result.toString());
            }
            System.out.print("want to continue playing(1-yes, 2-no)?: ");
            continueLoop = new Scanner(System.in).nextShort();
        }
        while(continueLoop == 1);
       
    }
}
