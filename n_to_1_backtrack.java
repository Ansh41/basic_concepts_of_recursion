public class n_to_1_backtrack {
    public static int num4(int i, int n){
        if(i>=1){
            num4(i-1, n);
            System.out.println(i);
        }
        else{
            return 0;

        }
        return 0;
    }
    public static void main(String[] args) {
        int n=10;
        num4(n,n);
    }
}
//===PENDING=== NOT DONE THE QUESTION YET====COMPLETE MEEE===
