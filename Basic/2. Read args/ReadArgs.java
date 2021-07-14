/*
* Program to print Arguments passed while running the program.
* Created by : Bharatsinh Chavda
*/
public class ReadArgs {
    public static void main(String[] args){
        // Enter the arguments while running the program.

        if(args.length > 0){
            // if there are any arguments then print them

            for(String arguments:args){
                System.out.println(arguments);
            }
        }else{
            //there are no arguments
            System.out.println("No Arguments passed!");
        }
    }
}
