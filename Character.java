public abstract class Character {
    protected String name;
    protected int health;
    protected int attackP;

    public Character(String name, int health, int attackP){
        this.name=name;
        this.health=health;
        this.attackP = attackP;

    }
    public abstract void attack(Character target);
    public void damage(int d){
        health = health - d;
        System.out.println(name + " took " + d + " damage! Remaining HP: "+health);

    }
    public boolean isAlive(){
        if(health > 0){
            return true;
        }
        return false;
    }
    public String getName(){
        return name;
    }
    }