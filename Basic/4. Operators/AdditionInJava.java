public class AdditionInJava{
    public static void main(String[] args){

        //Integer Addition
        System.out.println("Adding Integers");
        int a =5;
        int b =12;
        addIntegers(a, b);
        //Floating Numbers addition
        System.out.println("Adding float");
        float fa =4.34f;
        float fb= 3.67f;
        addFloat(fa,fb);

        //double  addition
        System.out.println("Adding Double");
        double da = 5.34567;
        double db = 32.34456788;
        addDouble(da, db);

        


    }
    public static void addIntegers(int a , int b){
        System.out.println("Sum of integers:"+(a+b));
    }
    public static void addFloat(float a , float b){
        float x = a+b;
        System.out.println("Sum of float numbers :"+x);
    }
    public static void addDouble(double a , double b){
        double x = a+b;
        System.out.println("Sum of double: "+x);
    }
}