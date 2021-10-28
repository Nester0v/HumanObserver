import java.time.LocalDateTime;

public class Mama implements IHumanLifecycleObserver {
    private final String whoAmI = "mama";

    @Override
    public void onBirth(LocalDateTime birthTime,
                        boolean gender,
                        float weight,
                        int height,
                        String location) {
        if (gender) {
            System.out.println(whoAmI + "Ура! Это мальчик!");
        } else {
            System.out.println("Ура! Это девочка!");
        }
    }

}
