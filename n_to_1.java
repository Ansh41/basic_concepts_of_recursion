public class n_to_1 {
    public static int num1(int i,int n){
        if(i<1){
            return 0;
        }
        else{
            System.out.println(i);
            num1(i-1, n);
        }
        return 0;
    }
    public static void main(String[] args) {
        int n=10;
        num1(n,n);
    }
}
