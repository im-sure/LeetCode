import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _Interview17_26SparseSimilarityLCCI {
  public List<String> computeSimilarities(int[][] docs) {
    List<String> res = new ArrayList<>();
    Map<Integer, List<Integer>> wordMap = new HashMap<>();
    for (int i = 0; i < docs.length; i++) {
      Map<Integer, Integer> intersection = new HashMap<>();
      for (int j = 0; j < docs[i].length; j++) {
        List<Integer> docIndexes = wordMap.get(docs[i][j]);
        if (docIndexes == null) {
          docIndexes = new ArrayList<>();
          wordMap.put(docs[i][j], docIndexes);
        }
        for (Integer docIndex : docIndexes) {
          intersection.put(docIndex, intersection.getOrDefault(docIndex, 0) + 1);
        }
        docIndexes.add(i);
      }
      for (Integer docIndex : intersection.keySet()) {
        double similarity = (double) intersection.get(docIndex) /
            (docs[i].length + docs[docIndex].length - intersection.get(docIndex));
        res.add(String.format("%d,%d: %.4f", docIndex, i, similarity));
      }
    }
    return res;
  }
}
