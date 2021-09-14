package Assignment;

public class Main {

    public static void main(String[] args) {
        Subject team1 = new Subject();
        Subject team2 = new Subject();

        Person Josh = new Person("Josh");
        Person John = new Person("John");
        Person Jonny = new Person("Jonny");

        Person Marry = new Person("Marry");
        Person Jessica = new Person("Jessica");

        team1.registerObserver(John);
        team1.registerObserver(Josh);
        team1.registerObserver(Jonny);

        team2.registerObserver(Marry);
        team2.registerObserver(Jessica);

        Marry.beat(Josh);
        team1.setAttacked(Josh,Marry);
    }
}
