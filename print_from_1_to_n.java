public class print_from_1_to_n {

  /*  public static int print_num(int n){
        count++;
        if(count<=n) {
            System.out.println(count);
            print_num(n);
        }
        return n;
    }
    static int count=0;

    public static void main(String[] args) {
        int n=10;
        print_num(n);
    }
}

   */
  public static int num(int i, int n){
    if(i>n){
      return 0;
    }
    else{
      System.out.println(i);
      num(i+1, n);
    }
      return i;
  }

  public static void main(String[] args) {
    int n=10;
    num(1,n);
  }
}
