package Employee;

public class ArtTeacher extends Teacher{
    protected boolean specials;

    public ArtTeacher(String firstName, String lastName, boolean specials) {
        super(firstName, lastName);
        this.specials = specials;
    }
}
