package hw6;

public class Samurai extends Warrior
{
    public Samurai() {
    }

    public Samurai(int hp, int damage, int critDamage)
    {

        super(hp, critDamage, damage);

    }
    @Override
    public void attack(Warrior warrior)
    {
        double d = Math.random();
        if (d < 0.4)
        {
            warrior.setHp(warrior.getHp()- this.getDamage());
            System.out.println(this.getClass().getName() + "punched " + warrior.getClass().getName()+ " with  "+ this.getDamage()  );
        }

        else if (d < 0.8){
            warrior.setHp(warrior.getHp()- this.getDamage() - this.getCritDamage()); //
            System.out.println(this.getClass().getName() + "punched " + warrior.getClass().getName()+ " with  "+ (this.getDamage() + this.getCritDamage()) );

        }

        else{
            warrior.setHp(warrior.getHp()- this.getDamage());
            System.out.println(this.getClass().getName() + "punched " + warrior.getClass().getName()+ " with  "+ this.getDamage()  );
        }
        System.out.println("Warrior " +warrior.getClass().getName() + "has "  + warrior.getHp()+ "hp");

    }
}
