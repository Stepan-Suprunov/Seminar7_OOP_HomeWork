//  Домашнее задание к семинару №7 Объектно-ориентированное программирование Супрунов Степан

public class Main {
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Senior ivanov = new Senior("Ivanov");
        Middle petrov = new Middle("Petrov");
        Junior antonov = new Junior("Antonov");
        Student sidorov = new Student("Sidorov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(antonov);
        jobAgency.registerObserver(sidorov);

        for (int i = 0; i < 3; i++) {
            geekBrains.needEmployeeIt();
            google.needEmployeeIt();
            yandex.needEmployeeIt();

            geekBrains.needEmployeeHandyman();
            google.needEmployeeHandyman();
            yandex.needEmployeeHandyman();
        }
    }
}
