package Observer;

import Observable.Observable;

public class EmailObserver implements Observer{

    Observable observable;
    String emailIId;

    public EmailObserver(Observable observable, String emailIId) {
        this.observable = observable;
        this.emailIId = emailIId;
    }
    @Override
    public void update() {
        System.out.println(emailIId + " new stocks have been added");
    }
}
