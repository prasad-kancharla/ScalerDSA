import java.util.Arrays;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(solve(arr,5)));
    }

    public static int[] solve(int[] A, int B) {
        int n = A.length;

        int[] prefixSum = new int[n];
        int sum = 0;
        for(int k = 0; k < n; k++) {
            sum += A[k];
            prefixSum[k] = sum;
        }

        int i = 0;
        int j = 0;

        while (i < n && j < n) {
            int subArraySum = getPrefixSum(prefixSum, i, j);
            if (subArraySum < B) {
                j++;
            } else if (subArraySum > B) {
                i++;
            } else {
                int[] ans = new int[j - i + 1];
                for (int k = i; k <= j; k++) {
                    ans[k - i] = A[k];
                }
                return ans;
            }
        }
        return new int[]{-1};
    }

    public static int getPrefixSum(int[] prefixSum, int i, int j) {
        if (i == 0) return prefixSum[j];
        return prefixSum[j] - prefixSum[i - 1];
    }

}
