public class print_name {
    public static void printMessage(int n)
    {
        count++;
        if(count<=n)
        {
            System.out.print("ansh yaaar"+"\n");
            printMessage(n);
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int n=10;
        printMessage(n);
    }
}


