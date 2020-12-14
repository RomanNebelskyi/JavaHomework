package hw6;

public abstract class Warrior {

    private int hp = 0;
    private int damage = 0;
    private int critDamage = 0;
    private boolean isLive = true;
    public Warrior(){
    this.isLive = true;
    }
    public abstract void attack(Warrior warrior);
    public Warrior(int hp, int damage, int critDamage) {
        this.hp = hp;
        this.damage = damage;
        this.critDamage = critDamage;
        if(damage> critDamage)
        {
            this.setDamage(critDamage);
            this.setCritDamage(damage);
        }
        if(damage==0 || hp==0||critDamage==0)
            System.out.println("Error! Enter normal value.");
        return;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if(hp<=0)
            this.isLive = false;

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCritDamage() {
        return critDamage;
    }

    public void setCritDamage(int critDamage) {
        this.critDamage = critDamage;
    }
}
