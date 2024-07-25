import java.io.*;
import java.util.Arrays;
class Test {
    static private boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while(left<right)
        {
            char l = s.charAt(left), r = s.charAt(right);
            if(!Character.isLetterOrDigit(l))
                left++;
            else if(!Character.isLetterOrDigit(r))
                right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "ABCDCBA";
        boolean ans = isPalindrome(str);

        if (ans == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
//===not understood====


//palindrome without recursion
/*
 public static void main(String args[]){
  int r,sum=0,temp;
  int n=454;//It is the number variable to be checked for palindrome

  temp=n;
  while(n>0){
   r=n%10;  //getting remainder
   sum=(sum*10)+r;
   n=n/10;
  }
  if(temp==sum)
   System.out.println("palindrome number ");
  else
   System.out.println("not palindrome");
}
}  
 */