import entites.MonsterFactory;
import entites.Entity;
import entites.Player;

public class Main {
    public static void main (String args[]){
        Entity player = new Player();
        Entity slime01 = new MonsterFactory("fire","slime").getEntity();
        System.out.println("Created new player: ");
        player.repr();
        System.out.println("Created new Monster: ");
        slime01.repr();
    }
}
