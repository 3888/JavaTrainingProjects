package Desing_Patterns.Observer;

/**
 * Created by 3888 on 19.06.2016.
 */
public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
