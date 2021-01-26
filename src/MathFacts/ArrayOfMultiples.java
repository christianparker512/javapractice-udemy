package MathFacts;


public class ArrayOfMultiples {
    public static int[] arrayOfMultiples(int num, int length) {

        int[] intArray = new int[length];
        int result=0;
        for(int i=length; i>=1; i--){

            result =i*num;
            intArray[i-1]=result;

        }

        System.out.println( "array is"  + intArray);
        return intArray;
    }
}