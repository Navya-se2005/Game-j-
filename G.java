import java.util.Scanner;
public class G{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Character player = new Warrior("Player");
        Character enemy = new Mage("Enemy");

        System.out.println("Battle Start: "+ player.getName() + " vs " + enemy.getName());
    }
}