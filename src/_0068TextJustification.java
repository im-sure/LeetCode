import java.util.ArrayList;
import java.util.List;

public class _0068TextJustification {
  public List<String> fullJustify(String[] words, int maxWidth) {
    List<String> res = new ArrayList<>();
    int i = 0;
    while (i < words.length) {
      int width = 0;
      int j = i;
      for (; j < words.length; j++) {
        if ((width > 0 && width + 1 + words[j].length() > maxWidth) ||
            width + words[j].length() > maxWidth) {
          break;
        } else {
          width += words[j].length() + (width > 0 ? 1 : 0);
        }
      }
      j--;
      StringBuilder sb = new StringBuilder();
      int restSpaceNum = maxWidth - width;
      if (j < words.length - 1) {
        int avg = j > i ? restSpaceNum / (j - i) : restSpaceNum;
        int rest = j > i ? restSpaceNum % (j - i) : 0;
        for (int k = i; k <= j; k++) {
          sb.append(words[k]);
          if (j == i || k < j) {
            appendSpace(sb, (k < j ? 1 : 0) + avg + (rest > 0 ? 1 : 0));
            if (rest > 0) {
              rest--;
            }
          }
        }
      } else {
        for (int k = i; k <= j; k++) {
          if (k > i) {
            sb.append(' ');
          }
          sb.append(words[k]);
        }
        appendSpace(sb, restSpaceNum);
      }
      res.add(sb.toString());
      i = j + 1;
    }
    return res;
  }

  private void appendSpace(StringBuilder sb, int n) {
    for (int i = 0; i < n; i++) {
      sb.append(' ');
    }
  }
}
