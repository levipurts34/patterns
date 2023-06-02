package Observer;

import Decorator.Computer;

public interface PCShop {
    void addSubscription(Subscribers subscribers);
    void removeSubscription(Subscribers subscribers);
    void notifySubscribers(Computer computer);
    Computer createContent();
}
