public class reccursive_insertion_sorting {
    public static void insertion(int []array, int n){
        if(n<=0){
            return;
        }
        insertion(array, n-1); // for sorting the elements till n-1
        int last=array[n-1];
        int j=n-2;
        while(j>=0&& array[j]> last){
            array[j+1]=array[j];
            j--;
        }
        array[j+1]=last;

    }
    public static void main(String[] args) {
        int array[]={2,23,4,4,5,2,2,4,4,2,2,4,3,2,3,22};

        System.out.println("the elements before sorting are: ");
        for(int e:array){
            System.out.print(e+" ");
        }

        insertion(array, array.length);

        System.out.println("the elements after sorting are: ");
        for(int e: array){
            System.out.print(e+" ");
        }

    }
}
