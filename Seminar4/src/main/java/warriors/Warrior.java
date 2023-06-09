package warriors;

import shield.Shield;
import weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon, S extends Shield> {
    private String name;
    private int healthPoint;
    private W weapon;
    private S shield;


    public Warrior(String name, int healthPoint, W weapon, S shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }
    public S getShield() {
        return shield;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }

    public int hit() {
        Random rnd = new Random();
        int hitDamage = rnd.nextInt(0, weapon.damage()+1);

        return hitDamage;
    }

    public int shieldProtection(){
        Random rnd = new Random();
        int shieldProtection = rnd.nextInt(0, shield.protection()+1);
        return shieldProtection;
    }
    public void reduceHealthWithShield(int damage, int shield){
        if (shield > damage){
            shield = damage;
        }
        healthPoint+= (shield - damage);
        if (healthPoint<0){
            healthPoint =0;
        }
    }

    public void reduceHealth(int damage) {
        healthPoint -= damage;
        if (healthPoint<0){
            healthPoint =0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, Weapon: %s, Health Point: %d", name, weapon, healthPoint);
    }
}


