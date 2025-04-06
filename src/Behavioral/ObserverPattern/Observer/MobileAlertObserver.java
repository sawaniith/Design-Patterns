package Behavioral.ObserverPattern.Observer;

import Behavioral.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationObserver {
    private String mobileNumber;
    private StockObservable stockObservable;

    public MobileAlertObserver(String mobileNumber, StockObservable stockObservable) {
        this.mobileNumber = mobileNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("SMS to " + mobileNumber + ": " + stockObservable.getProductName() + " is now in stock!");
    }
}