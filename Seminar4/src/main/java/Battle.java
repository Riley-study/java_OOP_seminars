import shield.Shield;
import warriors.Warrior;
import weapons.Weapon;

public class Battle<W1 extends Weapon, S1 extends Shield, W2 extends Weapon, S2 extends Shield> {
    private Warrior<W1, S1> w1;
    private Warrior<W2, S2> w2;

    public Battle(Warrior<W1, S1> w1, Warrior<W2, S2> w2){
        this.w1 = w1;
        this.w2 = w2;
    }
    public void fight(){
        while (w1.getHealthPoint()> 0 && w2.getHealthPoint()>0){
            int damage1 = w1.hit();
            int shield2 = w2.shieldProtection();
            System.out.println("Warrior 1 hit Warrior 2: " + damage1);
            System.out.println("Warrior 2 shield: " + shield2);
            w2.reduceHealthWithShield(damage1,shield2);
            int damage2 = w2.hit();
            int shield1 = w1.shieldProtection();
            System.out.println("Warrior 2 hit Warrior 1: " + damage2);
            System.out.println("Warrior 1 shield: " + shield1);
            w1.reduceHealthWithShield(damage2,shield1);
            System.out.println(w1);
            System.out.println(w2);
        }
    }
}
