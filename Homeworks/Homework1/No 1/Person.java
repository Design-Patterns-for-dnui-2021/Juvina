package Assignment;

public class Person implements Member, Observer{
    private String name;
    public Person(String name){
        super();
        this.name= name;
    }

    @Override
    public void action(Person enemy) {
        System.out.println(this.name + " is now attacking "+enemy.name + " back. ");
    }

    @Override
    public void update(Object f, Object e) {
        //skip if its the person that was attacked
        Person friend = (Person)f;
        Person enemy = (Person)e;
        if(friend.name == this.name) return;
        action(enemy);
    }
    public void beat(Person enemy){
        System.out.println(this.name + " has attacked "+ enemy.name);
    }
}
