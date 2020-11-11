import java.util.HashMap;
import java.util.Map;

public class _0208ImplementTrie_PrefixTree {
  Map<String, Boolean> prefixs = new HashMap<>();

  /** Initialize your data structure here. */
  public _0208ImplementTrie_PrefixTree() {

  }
  
  /** Inserts a word into the trie. */
  public void insert(String word) {
    for (int i = 0; i < word.length(); i++) {
      prefixs.put(word, true);
      String subString = word.substring(0, i + 1);
      if (!prefixs.containsKey(subString)) {
        prefixs.put(subString, false);
      }
    }
  }
  
  /** Returns if the word is in the trie. */
  public boolean search(String word) {
    return prefixs.containsKey(word) && prefixs.get(word);
  }
  
  /** Returns if there is any word in the trie that starts with the given prefix. */
  public boolean startsWith(String prefix) {
    return prefixs.containsKey(prefix);
  }
}
