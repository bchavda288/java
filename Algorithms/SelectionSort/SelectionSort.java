
public class SelectionSort {

    void sort(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int min_idx = i;
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    void printArray(int[] arr){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {23,66,11,88,12,89,34,21,54,9,76,2,5};
        SelectionSort ss = new SelectionSort();
        ss.printArray(arr);
        System.out.println("Sorted Array :");
        ss.sort(arr);
        ss.printArray(arr);
    }
}
