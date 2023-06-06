public class Middle implements Observer {

    private String name;
    private double salary;
    private TypeVacancy type;

    public Middle(String name) {
        this.name = name;
        salary = 50000;
        type = TypeVacancy.IT;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.type.equals(vacancy.getType())) {
            if (this.salary < vacancy.getSelary()) {
                System.out.printf("Мидл %s >>> Мне нужна эта работа! [%s - %f - %s]\n", name, vacancy.getNameCompany(),
                        vacancy.getSelary(), vacancy.getType());
                this.salary = vacancy.getSelary();
            } else {
                System.out.printf("Мидл %s >>> Я найду работу получше! [%s - %f - %s]\n", name, vacancy.getNameCompany(),
                        vacancy.getSelary(), vacancy.getType());
            }
        }
    }
}
