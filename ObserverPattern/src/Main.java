import Observable.Observable;
import Observable.StockObservable;
import Observer.*;

public class Main {
    public static void main(String[] args) {

        Observable observable = new StockObservable();

        Observer iphoneObserver = new IphoneObserver(observable, "Tejeshwar");
        Observer emailObserver = new EmailObserver(observable, "tejeshwar.sn@gmail.com");

        observable.add(iphoneObserver);
        observable.add(emailObserver);

        observable.setStockCount(10);
    }
}