import java.util.Arrays;

public class LongestDecreasingSubsequence {
    public static int lds(int[] arr) {
        int n= arr.length;
        int[] dp= new int[n];
        Arrays.fill(dp, 1); 

        for (int i= 1;i< n;i++) {
            for (int j=0;j< i;j++) {
                if (arr[i]<arr[j] && dp[i]<dp[j] + 1) {
                    dp[i]= dp[j] +1;
                }
            }
        }
        int maxLength= 0;
        for (int len: dp) {
            if (len>maxLength) {
                maxLength = len;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr={15,27,14,38,63,55,46,65,85 };
        System.out.println("LDS: "+lds(arr)); 
    }
}