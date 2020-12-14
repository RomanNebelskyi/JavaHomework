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
        if (d < 0.5)
        {
            warrior.setHp(warrior.getHp()- this.getDamage());
            System.out.println(this.getClass().getName() + "punched " + warrior.getClass().getName()+ " with  "+ this.getDamage()  );
        }

        else if (d < 0.60){
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
