
public class Person implements Comparable <Person>  {
    private String firstName;
    private String lastName;
    private String specialization;
    private int estimation;

    public Person(String firstName, String lastName, String specialization, int estimation){
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.estimation = estimation;
    }

    public String getFirstName() {return firstName; }
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName; }
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getSpecialization() {return specialization; }
    public void setSpecialization(String specialization) {this.specialization = specialization;}

    public int getEstimation() {return estimation;}
    public void setEstimation (int estimation) {this.estimation = estimation;}

    @Override
    public String toString() {
        return "Person {" +
        "firstName = ' " +  firstName + '\'' +
        ", lastName = ' " +  lastName + '\'' +
        ", specialization = ' " +  specialization + '\'' +
        ", estimation= " + estimation +
        '}';
    }

    @Override
    public int compareTo(Person o) {
        return firstName.compareTo(o.getFirstName());
    }

}
