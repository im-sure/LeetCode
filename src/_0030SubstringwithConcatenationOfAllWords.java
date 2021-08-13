import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0030SubstringwithConcatenationOfAllWords {
  public List<Integer> findSubstring(String s, String[] words) {
    int wordL = words[0].length();
    Map<String, Integer> wordMap = new HashMap<>();
    for (String word : words) {
      wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
    }
    List<Integer> res = new ArrayList<>();
    if (s.length() < wordL * wordMap.size()) {
      return res;
    }
    for (int i = 0; i < wordL; i++) {
      int start = i;
      Map<String, List<Integer>> currentWords = new HashMap<>();
      for (int j = i; j < s.length() - wordL + 1; j += wordL) {
        String sub = s.substring(j, j + wordL);
        if (wordMap.containsKey(sub)) {
          List<Integer> indexs = currentWords.get(sub);
          if (indexs == null) {
            indexs = new ArrayList<>();
            currentWords.put(sub, indexs);
          }
          indexs.add(j);
          if (indexs.size() > wordMap.get(sub)) {
            int del = indexs.remove(0);
            start = del + wordL;
            for (List<Integer> wordIndexs : currentWords.values()) {
              while(wordIndexs.size() > 0) {
                if (wordIndexs.get(0) < del) {
                  wordIndexs.remove(0);
                } else {
                  break;
                }
              }
            }
          }
          if (currentWords.size() == wordMap.size()) {
            boolean check = true;
            for (String word : currentWords.keySet()) {
              if (currentWords.get(word).size() < wordMap.get(word)) {
                check = false;
                break;
              }
            }
            if (check) {
              res.add(start);
            }
          }
        } else {
          currentWords.clear();;
          start = j + wordL;
        }
      }
    }
    return res;
  }
}
