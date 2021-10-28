import java.time.LocalDateTime;

public interface IHumanLifecycleObserver {
    void onBirth(LocalDateTime birthTime,
                 boolean gender,
                 float weght,
                 int height,
                 String location);

    void childGarden(int toysQuantity);

    void school(float middleGrade);

    void highSchool(float finalExamGrade, float pocketMoney);

    void university(String speciality, float diplomaGrade, float scholarship, String formOfEducation);

    void work(String sphere, String position ,float salary);

    void pension();
}
