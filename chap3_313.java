public class chap3_313 {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public chap3_313(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        if(monthlySalary > 0.0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    // method to calculate yearly salaray
    public double yearlySalary() {
        return monthlySalary * 12;
    }

    // method to give a raise of 10%
    public void giveRaise() {
        monthlySalary *=1.10;
    }

    // getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getMontlySalary() {
        return this.monthlySalary;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthySalary) {
        this.monthlySalary = monthySalary;
    }
}