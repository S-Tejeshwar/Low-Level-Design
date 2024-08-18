package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockObservable implements Observable{

    int stockCount;
    List<Observer> observerList =  new ArrayList<>();

    @Override
    public void add(Observer observer) {
     observerList.add(observer);
    }

    @Override
    public void setStockCount(int newStockCount) {
      if (stockCount == 0) {
          notifySubscribers();;
      }
      stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void notifySubscribers() {
        for (Observer observer: observerList) {
            observer.update();
        }
    }

    @Override
    public void remove(Observer observer) {
       observerList.remove(observer);
    }
}
