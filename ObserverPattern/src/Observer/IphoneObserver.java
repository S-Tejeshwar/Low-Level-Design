package Observer;

import Observable.Observable;

public class IphoneObserver implements Observer{

    Observable observable;
    String userName;

    public IphoneObserver(Observable observable, String userName) {
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update() {
        System.out.println(userName + " new stock is available now");
    }
}
