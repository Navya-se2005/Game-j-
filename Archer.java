public class Archer extends Character implements Moves{
    public Archer(String name){
        super(name, 100, 15);
    }

    public void attack(Character target){
        System.out.println(name + " shoots an arrow at "+target.getName());
        target.damage(attackP);
    }
    public void specialAttack(Character target){
        System.out.println(name+" performs RAPID FIRE on "+target.getName());
        target.damage(attackP+10);
    }
}