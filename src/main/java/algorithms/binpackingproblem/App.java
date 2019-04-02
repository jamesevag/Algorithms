package main.java.algorithms.binpackingproblem;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> items = Arrays.asList(5,5,5);
		int binCapacity = 5;

		FirstFitDecreasingAlgorithm algorithm = new FirstFitDecreasingAlgorithm(items, binCapacity);
		algorithm.solveBinPackingProblem();
		algorithm.showResults();

	}

	private void sortArray() {
		int count = 5, temp;
		int[] num = {3, 2, 5, 4, 1};


		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
