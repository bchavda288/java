public class OddEvenProgram {
    public static void main(String[] args){
        int num = 5;
        oddEvenBrutforce(num);
        oddEvenBitwiseAND(num);
        oddEvenBitwiseOR(num);
        oddEvenBitwiseXOR(num);
    }
    public static void oddEvenBrutforce(int n){
        if(n%2 == 0){
            System.out.println("Entered Number is Even");
        }else{
            System.out.println("Entered Number is Odd");
        }
    }

    public static void oddEvenBitwiseOR(int n){
        //the logic here is Bitwise OR operation of the even number
        //by 1 increment the value of the number by 1 othrwise it remains unchanged
        if((n|1)>n){
            System.out.println("Entered Number is Even");
        }else{
            System.out.println("Entered Number is Odd");
        }
    }
    public static void oddEvenBitwiseAND(int n){
        //Bitwise AND operation of the odd number  by 1 will be 1 as the last bit will be
        //already set otherwise it will be 0
        if((n&1)==1){
            System.out.println("Entered Number is Odd");
        }else{
            System.out.println("Entered Number is Even");
        }
    }
    public static void oddEvenBitwiseXOR(int n){
        //Bitwise XOR operation of even number by 1 will increment the value by 1
        //else it will decrement the value of 1 for  odd numbers
        if((n^1)==n+1){
            System.out.println("Entered Number is Even");
        }else{
            System.out.println("Entered Number is Odd");
        }
    }
}
