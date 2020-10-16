import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
    _Interview17_26SparseSimilarityLCCI test = new _Interview17_26SparseSimilarityLCCI();
    int[][] docs = {{14, 15, 100, 9, 3}, {32, 1, 9, 3, 5}, {15, 29, 2, 6, 8, 7}, {7, 10}};
		System.out.println(test.computeSimilarities(docs));
	}
}