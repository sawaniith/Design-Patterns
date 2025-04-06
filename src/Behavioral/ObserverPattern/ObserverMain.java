package Behavioral.ObserverPattern;

import Behavioral.ObserverPattern.Observable.IPhoneStockObservable;
import Behavioral.ObserverPattern.Observable.StockObservable;
import Behavioral.ObserverPattern.Observer.EmailAlertObserver;
import Behavioral.ObserverPattern.Observer.MobileAlertObserver;
import Behavioral.ObserverPattern.Observer.NotificationObserver;

public class ObserverMain {
    public static void main(String[] args) {
        //Observer Pattern allows one object (called the Subject) to notify multiple other objects (called Observers)
        // about changes or events, without tightly coupling them.


        // Create the observable product
        StockObservable iphoneStock = new IPhoneStockObservable("iPhone 15 Pro Max");

        NotificationObserver emailObserver1 = new EmailAlertObserver("alice@example.com", iphoneStock);
        NotificationObserver emailObserver2 = new EmailAlertObserver("bob@example.com", iphoneStock);
        NotificationObserver mobileObserver1 = new MobileAlertObserver("9876543210", iphoneStock);

        iphoneStock.add(emailObserver1);
        iphoneStock.add(emailObserver2);
        iphoneStock.add(mobileObserver1);

        // Stock update
        iphoneStock.setStockCount(5);
    }
}
