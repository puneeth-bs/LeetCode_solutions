package DynamicProgramming;

public class LongestCommonSubsequence {


    public static int longestSubsequence(String s1, String s2){
        int result = 0;
        int [][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 0;
        }
        for(int i = 0; i < dp[0].length; i++){
            dp[0][i] = 0;
        }
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    result = Math.max(result, dp[i][j]);
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return result;
    }


    public static void main(String [] args){
        System.out.print(longestSubsequence("abcde", "debfdy"));
    }
}
