package School;

import java.util.ArrayList;
import java.util.List;

public class Assessment {
    public static int square(int input) {
        return input * input;
    }

    public static int sum(int argument1, int argument2) {
        return argument1 + argument2;
    }

    public static double sum(double argument1, double argument2) {
        return argument1 + argument2;
    }

    public static double average (int[] nums){
        double currentTotal = 0;
        int length = nums.length;
        for(int i = 0; i<nums.length; i++){
            currentTotal += nums[i];
        }
        return currentTotal/length;
    }

    public static ArrayList<Teacher> capitalizeTeacherNames(ArrayList<Teacher>teachers){
//        ArrayList<Teacher> capitalizedTeacherNames = new ArrayList<>();
        for (Teacher teacher: teachers){
            teacher.setFirstName(String.format("%s%s", teacher.getFirstName().substring(0,1).toUpperCase(), teacher.getFirstName().substring(1).toLowerCase()));
            teacher.setLastName(String.format("%s%s", teacher.getLastName().substring(0,1).toUpperCase(), teacher.getLastName().substring(1).toLowerCase()));
//            teacher.setFirstName(teacher.getFirstName().substring(0,1).toUpperCase() + teacher.getFirstName().substring(1));
//            teacher.setLastName(teacher.getLastName().substring(0,1).toUpperCase() + teacher.getLastName().substring(1));
//            capitalizedTeacherNames.add(teacher);
            System.out.println(teacher.getFirstName() + " " + teacher.getLastName());
////            System.out.println(teacher.getFirstName());
//            This will give me the address
//            System.out.println(teacher);
//
        }
//        return capitalizedTeacherNames;
        return teachers;
    }

    public static void main(String[] args) {
//        Assessment assessment = new Assessment();
//        System.out.println(square(5));
//        System.out.println(sum(10,10));
//        System.out.println(sum(3.5, 5.25));
//        int average1 [] = {1,2,3,4,5,6,7,9};
//        int average2 [] = {2,4,6,8,10};
//        System.out.println(average(average1));
//        System.out.println(average(average2));

        ArrayList<Teacher>teachers=new ArrayList<>();
//        int [] arr1 = {1,2};
        teachers.add(new Teacher("christian", "parker", true));
        teachers.add(new Teacher("ryan", "kendall", false));
        teachers.add(new Teacher("Jason", "gutierrez", true));
//        for(Teacher teacher: teachers);
//        System.out.println(capitalizedTeacherNames);
            capitalizeTeacherNames(teachers);

    }
    }