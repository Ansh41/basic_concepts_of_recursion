// without hashing
import java.util.*;
public class count_appearing_digits {
    /*public static int countOccurrences(int arr[], int n, int x) {
        int count = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
                count++;
        return count;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int n = arr.length;
        int x = 0;
        System.out.println(countOccurrences(arr, n, x));
    }
}
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();//input liya n
        int[] arr = new int[n];// wahi input liya huwa size ka array bana diya
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();// poore array me input liya
        }

        //precompute:
        int[] hash = new int[13];//hash banaya 13 size ka,, tmhra man kitne ka b bana skta hai
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;// jo jo value enter kiya gaya hai array me usko count krte jana
        }

        int q;
        q = sc.nextInt();//jisko find krna hai uska input liya
        while (q-- != 0) {// loop liya taaki jitna number upar daala hai us us number ka appearance amoutn pata kr ske
            int number;
            number = sc.nextInt();// jiska appearance pta krna hai us number ka input liya
            // fetching:
            System.out.println(hash[number]);// wo jitna baar aay print krwa diya
        }
    }
}
