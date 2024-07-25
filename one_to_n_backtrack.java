public class one_to_n_backtrack {

    public static int num2(int i, int n){
        if(i<1){
            return 0;
        }
        else{
            num2(i-1, n);
            System.out.println(i);
        }
        return 0;
    }
    public static void main(String[] args) {
        int n=10;
        num2(n,n);
    }
}
