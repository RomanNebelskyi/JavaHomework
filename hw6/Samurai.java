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
        if (d < 0.6)
        {
            warrior.setHp(warrior.getHp()- this.getDamage());
            System.out.println(this.getClass().getSimpleName() + " punched " + warrior.getClass().getSimpleName()+ " with "+  this.getDamage()  );
        }

        else  {
            warrior.setHp(warrior.getHp()- this.getDamage() - this.getCritDamage()); //
            System.out.println(this.getClass().getTypeName() + "punched " + warrior.getClass().getSimpleName()+ " with  "+ (this.getDamage() + this.getCritDamage()) );

        }

        System.out.println("Warrior " +warrior.getClass().getSimpleName() + " has "  + warrior.getHp()+ " hp ");

    }
}
