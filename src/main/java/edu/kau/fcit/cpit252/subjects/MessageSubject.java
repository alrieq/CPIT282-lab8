package edu.kau.fcit.cpit252.subjects;
 
import java.util.ArrayList;
import java.util.List;

import edu.kau.fcit.cpit252.observers.Observer;

 
public class MessageSubject implements Subject {
    private List<Observer> observers  = new ArrayList<Observer>(); 
    @Override
    public void subscribe(Observer o) {
        // TODO Auto-generated method stub
        observers.add(o); 
    }

    @Override
    public void unsubscribe(Observer o) {
        // TODO Auto-generated method stub
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(String m) {
        // TODO Auto-generated method stub
        for (Observer observer : observers) {
            observer.update(m);
        }
    }
     
    
}
