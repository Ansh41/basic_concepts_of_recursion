public class fibonacci_series {
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int n){
        if(n>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(n-1);
        }
    }
    public static void main(String args[]){
        int n=10;
        System.out.print(n1+" "+n2);
        printFibonacci(n-2);
    }
}
//== thoda sa aur smjhna hai===
