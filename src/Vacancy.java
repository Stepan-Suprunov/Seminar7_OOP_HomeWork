public class Vacancy {

    private String nameCompany;
    private double selary;
    private TypeVacancy type;

    public Vacancy(String nameCompany, double selary, TypeVacancy type) {
        this.nameCompany = nameCompany;
        this.selary = selary;
        this.type = type;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public double getSelary() {
        return selary;
    }

    public TypeVacancy getType() {
        return type;
    }
}
