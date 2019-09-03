
public class _0331VerifyPreorderSerializationOfABinaryTree {
    public boolean isValidSerialization(String preorder) {
        String[] s = preorder.split(",");
        int nulls = 1;
        for (String str : s) {
        	if (--nulls < 0) return false;
        	if (!str.equals("#")) nulls += 2;
        }
        return nulls == 0;
    }
}
