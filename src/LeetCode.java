import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_289GameOfLife test = new _289GameOfLife();
		int[][] a = {{0,0,0,0},{0,1,1,0},{0,1,1,0},{0,0,0,0}};
		test.gameOfLife(a);
		for (int[] ar : a) {
			for (int n : ar) System.out.print(n + " ");
			System.out.println();
		}
	}
}