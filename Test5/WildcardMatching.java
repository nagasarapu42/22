public class WildcardMatching {
    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        
        boolean[] dp = new boolean[m + 1];
        dp[0] = true;
        
        // Filling the first row of dp
        for (int i = 1; i <= m; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[i] = dp[i - 1];
            }
        }
        
        // Filling the remaining cells of dp
        for (int i = 1; i <= n; i++) {
            boolean prev = dp[0];
            dp[0] = false;
            for (int j = 1; j <= m; j++) {
                boolean temp = dp[j];
                if (p.charAt(j - 1) == '*') {
                    dp[j] = dp[j - 1] || dp[j];
                } else if (p.charAt(j - 1) == '?' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    dp[j] = prev;
                } else {
                    dp[j] = false;
                }
                prev = temp;
            }
        }
        
        return dp[m];
    }
    
    public static void main(String[] args) {
        String s = "adceb";
        String p = "*a*b";
        
        if (isMatch(s, p)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
