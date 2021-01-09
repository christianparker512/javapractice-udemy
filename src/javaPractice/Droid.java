package javaPractice;

public class Droid {

    //instance field
    String name;
    int batteryLevel;

    //        constructors
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello. My name is " + name + ".  I am a Droid";
    }

    public void performingATask(String task) {
        System.out.println(name + " is performing the task of : " + task);
        batteryLevel = batteryLevel - 10;
        int remainingPower = batteryLevel;

    }

    public void energyReport() {
        System.out.println(name + "'s remaining power is : " + batteryLevel);
    }


        public static void main (String[]args){
            Droid codey = new Droid("Codey");
            Droid iris = new Droid("Iris");

            System.out.println(codey);
            codey.performingATask("running");
            codey.performingATask("jumping");
            codey.performingATask("coding");
            codey.energyReport();
            System.out.println();

            System.out.println(iris);
            // iris.performingATask("running");
            // iris.performingATask("jumping");
            iris.performingATask("coding");
            iris.energyReport();
            System.out.println();
        }
    }

