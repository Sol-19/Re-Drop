import entities.MonsterFactory;
import entities.Entity;
import entities.Player;
import entities.Slime;
import java.util.Scanner;

public class Main {
    /*
    Summary:
    This is the entry point of the game. It currently shows how to create a Player
    and a monster (through MonsterFactory) and print their stats with repr().
     */
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String args[]){
        Entity player = new Player();
        Entity slime01 = new MonsterFactory("fire","slime").getEntity();

        System.out.println("Created new player: ");
        player.repr();
        System.out.println("Created new Monster: ");
        slime01.repr();
        userEdit(slime01);
    }

    public static void userEdit(Entity slime01){
        String userinput;
        while(true){
        System.out.print("Change element: ");
        userinput = scanner.nextLine().trim().toLowerCase();
        switch (userinput){
            case "fire", "water", "earth", "wind" -> {
                ((Slime)slime01).setElement(userinput);
            }
            default->{
                slime01.setAttackPoints(10000000);
                slime01.setHealthPoints(10000000);
                ((Slime)slime01).setElement("none");
            }
        }
        slime01.repr();

        }
    }
}
