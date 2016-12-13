
public class _165CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int l1 = v1.length;
        int l2 = v2.length;
        int i = 0;
		while (i != l1 && i != l2) {
        	if (Integer.valueOf(v1[i]) < Integer.valueOf(v2[i])) return -1;
        	else if (Integer.valueOf(v1[i]) > Integer.valueOf(v2[i])) return 1;
        	else i++;
        }
		if (l1 < l2) {
			for (int j = i; j < l2; j++) {
				if (Integer.valueOf(v2[j]) != 0) return -1;
			}
			return 0;
		} else if (l1 > l2) {
			for (int j = i; j < l1; j++) {
				if (Integer.valueOf(v1[j]) != 0) return 1;
			}
			return 0;
		} else return 0;
    }
}
