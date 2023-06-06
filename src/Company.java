import java.util.Random;

public class Company {

    private Random random;
    private String nameCompany;
    private double maxSelary;
    private Publisher jobAgency;

    public Company(String nameCompany, double maxSelary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSelary = maxSelary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    public void needEmployeeIt() {
        Vacancy vacancy = new Vacancy(nameCompany, random.nextDouble(3000, maxSelary), TypeVacancy.IT);
        jobAgency.sendOffer(vacancy);
    }

    public void needEmployeeHandyman() {
        Vacancy vacancy = new Vacancy(nameCompany, random.nextDouble(3000, maxSelary), TypeVacancy.HANDYMAN);
        jobAgency.sendOffer(vacancy);
    }
}
