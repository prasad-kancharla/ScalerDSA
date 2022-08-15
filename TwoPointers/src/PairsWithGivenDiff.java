import java.util.*;
import java.util.stream.Collectors;

public class PairsWithGivenDiff {

	public static void main(String[] args) {
//		int[] arr = {5,2 2, 4, 1, 5};
		int[] arr = {1,2};
		System.out.println(solve(arr,0));
	}

    public static int solve(int[] A, int B) {
        Arrays.sort(A);
		int n = A.length;
		B = (int) Math.abs(B);

		int i = 0;
		int j = 1;
		int noOfPairs = 0;
		int[] currentPair = {0, 0};

		while (i < n && j < n) {
			int diff = A[j] - A[i];
			if (diff < B) {
				j++;
			} else if (diff > B) {
				i++;
			} else {
				if(A[j] != currentPair[1] && A[i] != currentPair[0]) {
					noOfPairs++;
					currentPair[0] = A[i];
					currentPair[1] = A[j];
				}
				i++;
				j++;
			}

			if (i == j) j++;
		}
		return noOfPairs;
    }

	public static int solveNew(int[] A, int B) {
		int n = A.length;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(A[i]);
		}
		list = list.stream().distinct().sorted().collect(Collectors.toList());
		n = list.size();
		B = (int) Math.abs(B);

		int i = 0;
		int j = 1;
		int noOfPairs = 0;

		while (i < n && j < n) {
			int diff = list.get(j) - list.get(i);
			if (diff < B) {
				j++;
			} else if (diff > B) {
				i++;
			} else {
				noOfPairs++;
				i++;
				j++;
			}
		}
		return noOfPairs;
	}
}
