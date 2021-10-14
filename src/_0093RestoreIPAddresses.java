import java.util.ArrayList;
import java.util.List;

public class _0093RestoreIPAddresses {
  public List<String> restoreIpAddresses(String s) {
    char[] chars = s.toCharArray();
    int[] nums = new int[chars.length];
    for (int i = 0; i < chars.length; i++) {
      nums[i] = chars[i] - 48;
    }
    int[] seps = new int[4];
    return restoreIpAddresses(nums, seps, 0, 0);
  }

  private List<String> restoreIpAddresses(int[] nums, int[] seps, int part, int start) {
    List<String> res = new ArrayList<>();
    if (part > 3) {
      if (start == nums.length) {
        StringBuilder sb = new StringBuilder();
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
          sb.append(nums[i]);
          if (i == seps[p]) {
            if (p < 3) {
              sb.append('.');
            }
            p++;
          }
        }
        res.add(sb.toString());
      }
      return res;
    } else if (start == nums.length) {
      return res;
    }
    for (int i = start; i < nums.length; i++) {
      int n = nums[i];
      if (i == start && n == 0) {
        seps[part] = i;
        part++;
        res.addAll(restoreIpAddresses(nums, seps, part, i + 1));
        break;
      } else {
        int m = 0;
        for (int j = start; j <= i; j++) {
          m += nums[j] * Math.pow(10, i - j);
        }
        if (m <= 255) {
          seps[part] = i;
          part++;
          res.addAll(restoreIpAddresses(nums, seps, part, i + 1));
          part--;
        } else {
          break;
        }
      }
    }
    return res;
  }
}
