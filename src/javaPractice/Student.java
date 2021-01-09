package javaPractice;

//The public class is the folder for this student. It is introduced into the public and then class and then the name of the class.
public class Student {
    //Field - this is where objects are initialized. This is similar to declaring variables. You do this in the area of field before(or in this case above or outside the method)

    int id;
    String name;
    boolean firstGrader = true;

        public static void main(String[] args) {
            Student s1 = new Student();
            s1.id = 12345;
            s1.name = "Chris";
            s1.firstGrader = true;
            System.out.println("The student's id number is " + s1.id);
            System.out.println("The student's name is " + s1.name);
            System.out.println("Is the student a first grader?: " +s1.firstGrader);

    }
}
