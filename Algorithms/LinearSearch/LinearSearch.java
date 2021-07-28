/*
* Linear search on array of n elements
*
*/
public class LinearSearch{
    public static void main(String[] args){
        int arr[] = {4,2,6,7,8,1,99,23,35,21};
        int x=8;

        int result = search(arr,x);

        if(result== -1){
            System.out.println("Element is not present");

        }else{
            System.out.println("Element is present at index :"+result);
        }
    }
    public static int search(int arr[], int x){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
}