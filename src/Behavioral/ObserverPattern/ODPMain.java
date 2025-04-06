package Behavioral.ObserverPattern;

import Behavioral.ObserverPattern.Observable.IphoneObservable;
import Behavioral.ObserverPattern.Observable.StockObservable;
import Behavioral.ObserverPattern.Observer.EmailNotificObserver;
import Behavioral.ObserverPattern.Observer.MobileNotificObserver;
import Behavioral.ObserverPattern.Observer.NotificationObserver;

public class ODPMain {
    public static void main(String[] args) {
        StockObservable iphone = new IphoneObservable();
        NotificationObserver obj1 = new EmailNotificObserver(iphone, "sawan@gmail.com");
        NotificationObserver obj2 = new EmailNotificObserver(iphone, "sawan.kumar@gmail.com");
        NotificationObserver obj3 = new MobileNotificObserver(iphone, "8885209881");

        iphone.add(obj1);
        iphone.add(obj2);
        iphone.add(obj3);

        iphone.setStockCount(10);
        System.out.println(iphone.getStockCount());
    }
}
