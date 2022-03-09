import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private int birthDate;
    private boolean anotherCompanyOwner;
    private boolean pesioner;
    private boolean publicServer;
    private float salary;

    public Person(String name, String surname, int birthDate, boolean anotherCompanyOwner, boolean pesioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pesioner = pesioner;
        this.publicServer = publicServer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPesioner() {
        return pesioner;
    }

    public void setPesioner(boolean pesioner) {
        this.pesioner = pesioner;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public String fullName(){
        return name + " " + surname;
    }

    public float calculateYearlySalary(){
        return getSalary() * 12;
    }

    public boolean isMei(){
        LocalDate current_date = LocalDate.now();
        return (getSalary()*12 < 130000) &&
                (current_date.getYear() - getBirthDate()>18) &&
                isAnotherCompanyOwner() == false &&
                isPesioner() == false &&
                isPublicServer() == false;


    }
}
