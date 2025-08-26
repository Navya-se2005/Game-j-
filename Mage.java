public class Mage extends Character implements Moves{
    public Mage(String name){
        super(name, 100, 20);
    }
    public void attack(Character target){
        System.out.println(name + " casts a spell at " + target.getName());
        target.damage(attackP);
    }

    public void specialAttack(Character target){
        System.out.println(name+ " uses FIREBALL on " +target.getName());
        target.damage(attackP*3);
    }

}