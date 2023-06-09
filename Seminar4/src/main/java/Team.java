import shield.Shield;
import warriors.Archer;
import warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<W extends Warrior> implements Iterable {
    private List<W> team = new ArrayList<>();
    public void add(W element){
        team.add(element);
    }

    @Override
    public Iterator<W> iterator() {
        return team.iterator();
    }
    public int getTeamHealth(){
        int teamHealth = 0;
        for (W warrior: team) { // вместо team можно this?
            teamHealth+=warrior.getHealthPoint();
        }
        return teamHealth;
    }

    public int maxAttackDistance(){
        int maxDistance = 0;
        for (W warrior: team) {
            if (!(warrior instanceof Archer)){
                continue;
            }
            int currentDistance = ((Archer) warrior).distance();
            if (maxDistance < currentDistance){
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }
    public int getTeamAttack(){
        int teamAttack = 0;
        for (W warrior: team) {
            teamAttack += warrior.getWeapon().damage();
        }
        return teamAttack;
    }

    public int getMinShield(){
        int minShield = 1000;
        for (W warrior: team){
            if (minShield > warrior.getShield()){
                minShield = warrior.getShield();
            }
        }
        return minShield;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (W warrior : team) {
            sb.append(warrior).append("\n");
        }
        sb.append(String.format("TeamHealth: %d; ", getTeamHealth()));
        sb.append(String.format("TeamAttack: %d; ", getTeamAttack()));
        sb.append(String.format("MaxAttackDistance: %d; ", maxAttackDistance()));
        sb.append(String.format("MinShield: %d ", getMinShield()));
        return "Team: \n" + sb;
    }
}
