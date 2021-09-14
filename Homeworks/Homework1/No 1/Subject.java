package Assignment;
import java.util.ArrayList;
import java.util.List;


public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private Observer teammate;
    private Observer enemy;
    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }
    public void deleteObserver(Observer observer){
        this.observers.remove(observer);
    }
    public void setAttacked(Observer friend, Observer enemy){
        this.teammate=friend;
        this.enemy=enemy;
        this.notifyObservers();
    }
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this.teammate,this.enemy);
        }
    }

}
