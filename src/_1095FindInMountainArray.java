public class _1095FindInMountainArray {
  public int findInMountainArray(int target, List<Integer> mountainArr) {
    int start = 0;
    int end = mountainArr.length();
    int mid = (start + end) / 2;
    while (mountainArr.get(mid - 1) > mountainArr.get(mid) || mountainArr.get(mid + 1) > mountainArr.get(mid)) {
      if (mountainArr.get(mid - 1) > mountainArr.get(mid)) {
        end = mid;
      } else {
        start = mid;
      }
      mid = (start + end) / 2;
    }
    if (mountainArr.get(mid) == target) {
      return mid;
    }
    start = 0;
    end = mid;
    int preMid = (start + end) / 2;
    while (start < end) {
      if (mountainArr.get(preMid) == target) {
        return preMid;
      }
      if (mountainArr.get(preMid) > target) {
        if (end == preMid) {
          break;
        }
        end = preMid;
      } else {
        if (start == preMid) {
          break;
        }
        start = preMid;
      }
      preMid = (start + end) / 2;
    }
    start = mid;
    end = mountainArr.length();
    int postMid = (start + end) / 2;
    while (start < end) {
      if (mountainArr.get(postMid) == target) {
        return postMid;
      }
      if (mountainArr.get(postMid) > target) {
        if (start == postMid) {
          break;
        }
        start = postMid;
      } else {
        if (end == postMid) {
          break;
        }
        end = postMid;
      }
      postMid = (start + end) / 2;
      if (postMid == start || postMid == end) {
        break;
      }
    }
    return -1;
  }
}
