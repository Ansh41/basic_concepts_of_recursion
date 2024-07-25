public class bubble_sorting {
    public static void bubble(int [] arr){
        int temp=0;
        for(int i=0; i<arr.length; i++){

            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]= temp;
                }// hamlog yah pe time optimize krne ke liye break laga skte hai int doesbreak ke naam se aur jab bhi array jaise hi sorted ho jayega wo turant hi break ho jayega extra loop run nai krega faltu ka.
                
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
            int arr[]={2,3,423,42,342,34,23,41,3};
        System.out.println("the elements before sorting: ");
        for(int e: arr){
            System.out.print(e+ " ");
        }

        bubble(arr);
        System.out.println("the elements after sorting are: ");
        for(int e: arr){
            System.out.print(e+ " ");

        }
    }
}
