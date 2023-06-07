import warriors.Archer;
import warriors.Infantryman;
import warriors.Warrior;
import weapons.meleeWeapon.Axe;
import weapons.meleeWeapon.Sword;
import weapons.rangeWeapon.Bow;
import weapons.rangeWeapon.CrossBow;

public class mainSeminar4 {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow()));
        team1.add(new Infantryman("John", 150, new Axe()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow()));
        teamArchers.add(new Archer("Piter", 100, new Bow()));

        Team<Infantryman> infantrymanTeam = new Team<>();
        infantrymanTeam.add(new Infantryman("James", 150, new Sword()));

        System.out.println(team1.toString());
        System.out.println("---------------------------------------------------------");
        System.out.println(teamArchers.toString());
        System.out.println("---------------------------------------------------------");
        System.out.println(infantrymanTeam.toString());
    }
}
