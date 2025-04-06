package Behavioral.ObserverPattern.Observer;

import Behavioral.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationObserver{
    private String email;
    private StockObservable stockObservable;

    public EmailAlertObserver(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Email to " + email + ": " + stockObservable.getProductName() + " is now in stock!");
    }
}
