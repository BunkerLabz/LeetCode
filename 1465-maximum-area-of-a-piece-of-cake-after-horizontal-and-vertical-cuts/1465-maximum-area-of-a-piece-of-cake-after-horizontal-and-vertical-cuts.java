class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int temp = 0;
        int maxHt = Math.max(horizontalCuts[0] - 0, h - horizontalCuts[horizontalCuts.length - 1]);
        for(int i = 1; i < horizontalCuts.length; i++) {
            temp = horizontalCuts[i] - horizontalCuts[i - 1];
            maxHt = Math.max(temp, maxHt);
        }
        int maxWdt = Math.max(verticalCuts[0] - 0, w - verticalCuts[verticalCuts.length - 1]);
        for(int i = 1; i < verticalCuts.length; i++) {
            temp = verticalCuts[i] - verticalCuts[i - 1];
            maxWdt = Math.max(temp, maxWdt);
        }
        long ans = 1L * maxHt * maxWdt;
        return (int) (ans % 1000000007);
    }
}