import entites.MonsterFactory;
import entites.Entity;
import entites.Player;
import entites.Slime;

public class Main {
    /*
    Summary:
    This is the entry point of the game. It currently shows how to create a Player
    and a monster (through MonsterFactory) and print their stats with repr().
     */
    public static void main (String args[]){
        Entity player = new Player();
        Entity slime01 = new MonsterFactory("fire","slime").getEntity();
        System.out.println("Created new player: ");
        player.repr();
        System.out.println("Created new Monster: ");
        slime01.repr();
        ((Slime)slime01).setElement("water");
        slime01.repr();
    }
}
