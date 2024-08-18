package Observable;

import Observer.Observer;

public interface Observable {

    public void add(Observer observer);
    public void remove(Observer observer);
    public void setStockCount(int newStockAdded);
    public int getStockCount();
    public void notifySubscribers();

}
