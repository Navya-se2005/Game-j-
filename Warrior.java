public class Warrior extends Character implements Moves {
    public Warrior(String name){
        super(name, 150, 10);
    }
   // @Override
    public void attack(Character target){
        System.out.println(name+" slashes sword at "+target.getName());
        target.damage(attackP);
    }
  //@Override
    public void specialAttack(Character target){
        System.out.println(name+" performs POWER STRIKE on "+target.getName());
        target.damage(attackP * 2);
    }
}
