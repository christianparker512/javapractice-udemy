package School;

public class Educator implements TeacherResponsibilities {
    private String firstName;
    private String lastName;

    public Educator(String firstName, String lastName) throws IllegalArgumentException{
        if(firstName ==null || lastName == null) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String takeAttendance(){
        return String.format("Mr. %s class has 100% attendance", lastName);
    }
}
