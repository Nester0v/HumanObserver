import java.time.LocalDateTime;

public class HumanLifeCycle {
    private IHumanLifecycleObserver[] observers;
    final boolean gender = (Math.random() > 0.5);



    public void setObservers(IHumanLifecycleObserver[] observers) {
        this.observers = observers;
    }

    public void runLife() {

        for (IHumanLifecycleObserver observer : observers) {

            observer.onBirth(LocalDateTime.now(), gender,
                    4.5f,
                    52,
                    "Харьков");
        }

    }
}
