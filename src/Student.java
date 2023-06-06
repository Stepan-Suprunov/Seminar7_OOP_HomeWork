public class Student implements Observer {

    private String name;
    private double salary;
    private TypeVacancy type;

    public Student(String name) {
        this.name = name;
        salary = 5000;
        type = TypeVacancy.HANDYMAN;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.type.equals(vacancy.getType())) {
            if (this.salary < vacancy.getSelary()) {
                System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %f - %s]\n", name, vacancy.getNameCompany(),
                        vacancy.getSelary(), vacancy.getType());
                this.salary = vacancy.getSelary();
            } else {
                System.out.printf("Студент %s >>> Я найду работу получше! [%s - %f - %s]\n", name, vacancy.getNameCompany(),
                        vacancy.getSelary(), vacancy.getType());
            }
        }
    }
}
