import java.util.Scanner;
public class G{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Character player = new Warrior("Player");
        Character enemy = new Mage("Enemy");

        System.out.println("Battle Start: "+ player.getName() + " vs " + enemy.getName());

        while(player.isAlive() && enemy.isAlive()){
            System.out.println("\nYour turn to choose action :  ");
            System.out.println("1. Normal Attack");
             System.out.println("2. Special Attack");
             int choice = sc.nextInt();
             if(choice == 1)
             player.attack(enemy);
             else if(choice == 2 && player instanceof Moves){
                System.out.println("\n" + enemy.getName() + " is defeated! You Won!");
                break;
             }
             if(Math.random()>0.5) 
             enemy.attack(player);

             else if(enemy instanceof Moves) 
             ((Moves) enemy).specialAttack(player);
                   if (!player.isAlive()) {
                System.out.println("\n" + player.getName() + " is defeated! Game Over.");
                break;
            }
        }
        sc.close();
    }
    
}