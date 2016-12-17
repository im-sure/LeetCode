import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_406QueueReconstructionByHeight test = new _406QueueReconstructionByHeight();
		int[][] a = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		int[][] result = test.reconstructQueue(a);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i][0] + "  " + result[i][1]);
			System.out.println();
		}
	}
}