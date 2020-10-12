import java.util.List;

public class _0524LongestWordInDictionaryThroughDeleting {
  public String findLongestWord(String s, List<String> d) {
    String result = "";
    int sLength = s.length();
    for (String word : d) {
      int i = 0;
      int j = 0;
      int wordLength = word.length();
      while (i < wordLength && j < sLength) {
        if (word.charAt(i) == s.charAt(j)) {
          i++;
        }
        j++;
      }
      if (i == wordLength &&
          (result == "" ||
              (result != "" &&
                  (word.length() > result.length() ||
                      (word.length() == result.length() && word.compareTo(result) < 0))))) {
        result = word;
      }
    }
    return result;
  }
}
