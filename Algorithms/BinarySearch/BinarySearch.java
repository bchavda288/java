
public class BinarySearch {
    public static void main(String[] args){
        int arr[]  ={21,22,23,34,56,58,62,77,88,99};
        int x = 88;
        int l = 0;
        int r = arr.length;
        BinarySearch bs = new BinarySearch();
        int result = bs.binarySearch(arr,l,r,x);

        if(result ==-1){
            System.out.println("Element Not Found");
        }else{
            System.out.println("Element Found at position :"+result);
        }

    }

    public int binarySearch(int arr[],int l,int r,int x){
        if(r>l){
            int mid =l+(r-1)/2;
            if(arr[mid] ==x){
                return mid;
            }
            if(arr[mid]>x){
                //left value
                return binarySearch(arr, l, mid-1, x);
            }
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }
}
