package javaPractice;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(){
//        1st constructor
//        the below should never be written like this.
//        this.x=0;
//        this.y=0;
//        this.width = 0;
//        this.height=0;
        this(0,0);
//        calls the 2nd constructor
    }
    public Rectangle(int width, int height){
//        2nd constructor
//        this(0,0,width, height);
//        this.x = 0;
//        this.y = 0;
//        this.width = 0;
//        this.height = 0;
//        calls the 3rd constructor
        this(0,0,width, height);
    }
//    3rd constructor
//    This is called constructor chaining and
//    writing the above constructors like this allows the 3rd constructor to do all the work
    public Rectangle (int x, int y, int width, int height){
//        initialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

//        Don't do the commented out code. Duplicated code is back coding can lead to bugs and more work
    }
}
