package School;

public class Teacher extends Educator{
    protected boolean admin;

    public Teacher(String firstName, String lastName, boolean admin) throws IllegalArgumentException {
        super(firstName, lastName);
        this.admin = admin;
    }

//    public boolean isAdmin() {
//        return admin;
//    }
//
//    public void setAdmin(boolean admin) {
//        this.admin = admin;
//    }
}
