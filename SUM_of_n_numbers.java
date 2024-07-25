public class SUM_of_n_numbers {
    public static int sum(int n) {
        if (n <= 1) {
            return n;
            //System.out.println(sum(n+(n-1)));
            //System.out.println(n);
        }
        else{
            return n+ sum(n-1);
        }

    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}
