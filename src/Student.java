public class Student extends Person implements Payable {
    private double gpa;
    private final double scholarship = 36660.00;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return scholarship;
        } else {
            return 0.00;
        }
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public int compareTo(Payable o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}

