import shield.Shell;
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
        team1.add(new Archer("Robin", 100, new Bow(), new Shell()));
        team1.add(new Infantryman("John", 150, new Axe(), new Shell()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(), new Shell()));
        teamArchers.add(new Archer("Piter", 100, new Bow(), new Shell()));

        Team<Infantryman> infantrymanTeam = new Team<>();
        infantrymanTeam.add(new Infantryman("James", 150, new Sword(), new Shell()));

        System.out.println(team1.toString());
        System.out.println("---------------------------------------------------------");
        System.out.println(teamArchers.toString());
        System.out.println("---------------------------------------------------------");
        System.out.println(infantrymanTeam.toString());


        Battle battle1 = new Battle(new Infantryman("John", 50, new Axe(), new Shell()),
                new Archer("Robin", 60, new Bow(), new Shell()));
        battle1.fight();
    }
}
