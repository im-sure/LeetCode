
public class _0223RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int total = (C - A) * (D - B) + (G - E) * (H - F);
        if ((A < E && C < E) || (A > G && C > G) || (B < F && D < F) || (B > H && D > H)) return total;
        else return total - (Math.min(C, G) - Math.max(A, E)) * (Math.min(D, H) - Math.max(B, F));
    }
}
