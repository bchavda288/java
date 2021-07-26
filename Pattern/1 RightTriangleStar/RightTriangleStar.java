/*
* Input any positive integer and it will print the pattern
*
*/
public class RightTriangleStar{
    public static void main(String[] args){
        int k=6;
        StarPattern(k);
    }
    public static void StarPattern(int n){
        for(int i =0;i<n;i++){
            for(int j = 0 ; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}