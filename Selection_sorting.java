//SELECTION SORTING
import java.util.*;
public class Selection_sorting {
    public static void selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int index=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[index]){
                index=j;  // index ko lowest value se swap kr diye yaha pe
                }
            }
            int temp= arr[index];
            arr[index]=arr[i];
            arr[i]= temp;
        }
    }

    public static void main(String[] args) {
            int arr1[]={1,44,55,3,43,22,343,22,22,2,343};
        System.out.print("the elements before selection sort: ");
        for(int e: arr1){
            System.out.print(e+ ",");
        }
        System.out.println();

        selection(arr1);
        System.out.print("the elements after selection sorting:");
        for(int e: arr1){
            System.out.print(e+ ",");
        }
    }
}
