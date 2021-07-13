/*
*
    Java Program to Read the int input and print it.
    Created By : Bharatsinh Chavda
*/
import java.io.*;
import java.util.Scanner;

class ReadInt{
    public static void main(String[] args){
        //Declare int variable to hold the value
        int intNumber;

        //Ask for input
        System.out.println("Please Enter Integer Number :");

        //Scanner object
        Scanner s = new Scanner(System.in);

        //Read next integer from the screen and store it in variable
        intNumber =s.nextInt();

        //Print the Read Number ;
        System.out.println("Entered Number is :"+intNumber);

    
    }
}
