import warriors.Archer;
import warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable{
    private List<T> team = new ArrayList<>();
    public void add(T element){
        team.add(element);
    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }
    public int getTeamHealht(){
        int teamHealht = 0;
        for (T warrior: team) { // вместо team можно this
            teamHealht+=warrior.getHealthPoint();
        }
        return teamHealht;
    }

    public int maxAttackDistance(){
        int maxDistance = 0;
        for (T warrior: team) {
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
        for (T warrior: team) {
            teamAttack += warrior.getWeapon().damage();
        }
        return teamAttack;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T warrior : team) {
            sb.append(warrior).append("\n");
        }
        sb.append(String.format("TeamHealth: %d; ", getTeamHealht()));
        sb.append(String.format("TeamAttack: %d; ", getTeamAttack()));
        sb.append(String.format("MaxAttackDistance: %d ", maxAttackDistance()));
        return "Team: \n" + sb;
    }
}
