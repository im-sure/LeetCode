public class _0605CanPlaceFlowers {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int actual = 0;
    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
          (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
        flowerbed[i] = 1;
        actual++;
      }
    }
    return n <= actual;
  }
}
