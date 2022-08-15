public class PairsWithGivenSum {

    public static void main(String[] args) {

    }

    public class Solution {
        public int solve(int[] A, int B) {
            int n = A.length;
            int i = 0;
            int j = n - 1;
            int noOfPairs = 0;

            while (i < j) {
                int sum = A[j] + A[i];
                if (sum < B) {
                    i++;
                } else if (sum > B) {
                    j--;
                    ;
                } else {
                    noOfPairs++;
                    i++;
                    j--;
                }
            }
            return noOfPairs;
        }
    }

}
