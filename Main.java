import entities.MonsterFactory;
import entities.Entity;
import entities.Player;
import entities.Slime;
import exceptions.InvalidMonsterException;

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

    public static void userEdit(Entity slime01) {
        while (true) {
            System.out.print("Change element: ");
            String userinput = scanner.nextLine().trim().toLowerCase();
            try {
                ((Slime) slime01).setVariant(MonsterFactory.slimeVariant(userinput));
            } catch (InvalidMonsterException e) {
                System.out.println(e.getMessage());
                continue;
            }
            slime01.repr();
        }
    }
}
