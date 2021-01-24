package Employee;

import java.util.ArrayList;

public class Teacher implements MorningDuty{
    private String firstName;
    private String lastName;

    public Teacher(String firstName, String lastName) throws IllegalArgumentException{
        if (firstName ==null || lastName == null) throw new IllegalArgumentException();
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

    public String MorningDuty() {
        return String.format("Good Morning %s, %s. How are you doing today?", firstName, lastName);
    }

    @Override
    public String sayGoodMorning(){
        return String.format("Good Morning %s %s", firstName, lastName);
    }
//    This is my first attempt at trying the capitalizing of the name.
//    public static ArrayList<ArtTeacher>capitalize = new ArrayList<>();
//    ArrayList<ArtTeacher> funTeachers = new ArrayList<>();
//    for(ArtTeacher ArtTeacher : ArtTeacher){
//        ArtTeacher.setFirstName(String.format("%s%s", ArtTeacher.getFirstName()));
//        ArtTeacher.setLastName(String.format("%s%s", ArtTeacher.getLastName()));
//        funTeachers.add(ArtTeacher);
//        System.out.println(ArtTeacher.getFirstName() + " " + ArtTeacher.getLastName());
//        funTeachers.add(ArtTeacher);
//    }

    public static void main(String[] args) {
        ArrayList<ArtTeacher>Specials = new ArrayList<>();
        int [] arr1 = {1,2,3,4,5};
        Teacher me = new Teacher ("chris", "parker");
        Teacher Schultse = new Teacher("matt", "schultse");
        System.out.println(me.sayGoodMorning());
        System.out.println(Schultse.sayGoodMorning());
        Specials.add(new ArtTeacher("Christian", "Parker", true));
        Specials.add(new ArtTeacher("Ralf", "Petiton", true));
        Specials.add(new ArtTeacher("Matt", "Schultse", true));
        Specials.add(new ArtTeacher("Gabe", "Gonzales", true));
        Specials.add(new ArtTeacher("Todd", "Moore", false));
        System.out.println();
    }

}



