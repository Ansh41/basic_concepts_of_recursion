import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class quick_sort {
    public static int partion(int []arr, int low, int high){
        int i=low-1;// imaginary place abhi maan liye hai ki low se chota koi number nai hai
        int pivot=arr[high];// quick sort me pivot last element hota hai aur neeche high hamlog n-1 last element de chuke hai
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;// i++ mtlb jagah banana ki ek khali space create krke rakha gaya hai jisme aap koi b value daaliye
                int temp=arr[i];// swap kr diye us khaali jagah me wo low elemenet ko daal diye jo pivot se chota hai
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;// yaha wapis jagah banaye
        int temp=arr[i];//aur ye swap tha wo last element jo bach gaya tha pivot ke roop me to uska index find krne ke liye swap kiye arr[high] se
        arr[i]=pivot;
        arr[high]=temp;
        return i;// returns the pivot index

    }

    public static void quicksort(int []arr, int low, int high){
        if(low<high){
            int pivotIndex=partion(arr, low, high);// neeche high diya huwa hai(n-1) last element, to agar low
                                                    // less than hai high se pivot ka index upar call kr dega partition method ko

            quicksort(arr, low, pivotIndex-1);// yaha quick sort method khud ko call kiya for the samaller elements which is less than the pivot
            quicksort(arr, pivotIndex+1, high);// yaha quick sort khud ko call kiya for the elements which are on the right of the pivot
        }
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,2,12,5,6,7,3,5,4,2};
        int n=arr.length;
        System.out.print("the elements before sorting are: ");
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println(" ");
        System.out.println("Elements after sorting are: ");
        quicksort(arr,0,n-1);//quick sort ko call krke low 0 diye and high ko n-1 last element
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print(" ");}
}

//time complexity for :
// worst case: 0(n^2)
//avg case: 0(nlogn)