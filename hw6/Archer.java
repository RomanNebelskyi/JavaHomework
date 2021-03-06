package hw6;

import javax.sound.midi.Soundbank;

public class Archer extends Warrior
{
    public Archer() {
    }

    public Archer(int hp, int damage, int critDamage) {
        super(hp, damage, critDamage);


    }
    @Override
    public void attack(Warrior warrior)
    {
        var d = Math.random();
        if (d < 0.9)
        {
            warrior.setHp(warrior.getHp()- this.getDamage());
            System.out.println(this.getClass().getSimpleName() + " punched " + warrior.getClass().getSimpleName()+ " with  "+ this.getDamage()  );
        }

        else {
            warrior.setHp(warrior.getHp()- this.getDamage() - this.getCritDamage()); //
            System.out.println(this.getClass().getSimpleName() + " punched " + warrior.getClass().getSimpleName()+ " with  "+ (this.getDamage() + this.getCritDamage()) );
        }

        System.out.println("Warrior " +warrior.getClass().getSimpleName() + " has "  + warrior.getHp()+ " hp");



    }
}
