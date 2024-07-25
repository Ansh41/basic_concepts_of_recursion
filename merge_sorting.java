import java.util.Arrays;
public class merge_sorting {
    //+++CODE IS DOWN BELOW+++//
   /*
   // Merge two sub arrays L and M into array

        void merge(int array[], int p, int q, int r) {

            int n1 = q - p + 1;
            int n2 = r - q;

            int L[] = new int[n1];
            int M[] = new int[n2];

            // fill the left and right array
            for (int i = 0; i < n1; i++)
                L[i] = array[p + i];
            for (int j = 0; j < n2; j++)
                M[j] = array[q + 1 + j];

            // Maintain current index of sub-arrays and main array
            int i, j, k;
            i = 0;
            j = 0;
            k = p;

            // Until we reach either end of either L or M, pick larger among
            // elements L and M and place them in the correct position at A[p..r]
            // for sorting in descending
            // use if(L[i] >= <[j])
            while (i < n1 && j < n2) {
                if (L[i] <= M[j]) {
                    array[k] = L[i];
                    i++;
                } else {
                    array[k] = M[j];
                    j++;
                }
                k++;
            }

            // When we run out of elements in either L or M,
            // pick up the remaining elements and put in A[p..r]
            while (i < n1) {
                array[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                array[k] = M[j];
                j++;
                k++;
            }
        }

        // Divide the array into two sub arrays, sort them and merge them
        void mergeSort(int array[], int left, int right) {
            if (left < right) {

                // m is the point where the array is divided into two sub arrays
                int mid = (left + right) / 2;

                // recursive call to each sub arrays
                mergeSort(array, left, mid);
                mergeSort(array, mid + 1, right);

                // Merge the sorted sub arrays
                merge(array, left, mid, right);
            }
        }

        public static void main(String args[]) {

            // created an unsorted array
            int[] array = { 6, 5, 12, 10, 9, 1 };

            merge_sorting ob = new merge_sorting();

            // call the method mergeSort()
            // pass argument: array, first index and last index
            ob.mergeSort(array, 0, array.length - 1);

            System.out.println("Sorted Array:");
            System.out.println(Arrays.toString(array));
        }
    }

    //time complexity: 0(n log n).

    */
   public static void conquer(int arr[], int si, int mid, int ei){
       int merged[] = new int[ei-si+1];// utna hi size ka ek black array banaye taaki usme sorted elements daal ske
       int indx1=si; // ye index mid se pehle ke array ko denote krega
       int indx2= mid+1;// ye index mid ke baad ke array ko denote krega
       int x=0;// ye zero ++ hoga jab bhi koi while condition true hoga aur usme koi lement daalayega

       while(indx1<=mid&& indx2<= ei){
       if(arr[indx1]<=arr[indx2]){
            merged[x++]=arr[indx1++];
            }
       else{
           merged[x++]=arr[indx2++];
            }
       }
       while(indx1<=mid){
           merged[x++]=arr[indx1++];
       }

       while(indx2<=ei){
           merged[x++]=arr[indx2++];
       }
       for(int i=0, j=si; i<merged.length; i++, j++){
            arr[j]=merged[i];
       }
   }
    public static void divide(int []arr, int si, int ei){
       if(si>=ei){
           return;
       }
       int mid=si+(ei-si)/2; // or can be written as si+ei/2
       divide(arr, si, mid);
       divide(arr, mid+1, ei);
       conquer(arr, si, mid, ei);
   }

    public static void main(String[] args) {
        int arr[]={2,233,2,4,234,2,4,24,2,42,34,234,2,42,34,2,};
        int n=arr.length;
        divide(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
   }
}
