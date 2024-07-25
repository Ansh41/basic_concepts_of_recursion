public class factorial_of_n_num {
    public static int fact(int n) {
        if (n <= 1) {
            return n;
            //System.out.println(sum(n+(n-1)));
            //System.out.println(n);
        }
        else{
            return n* fact(n-1);
        }

    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(fact(n));
    }
}

