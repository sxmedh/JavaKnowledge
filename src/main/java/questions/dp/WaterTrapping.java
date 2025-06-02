package questions.dp;

public class WaterTrapping {
    public int trap(int[] height) {
        int water = 0;
        int n = height.length;
        int[] maxleft = new int[n];
        int[] maxright = new int[n];
        maxleft[0] = height[0];
        maxright[n - 1] = height[n - 1];
        int max1 = 0;
        for (int i = 0; i < n; i++) {
            max1 = Math.max(height[i], max1);
            maxleft[i] = max1;
        }

        int max2 = 0;
        for (int i = n - 1; 0 <= i; i--) {
            max2 = Math.max(height[i], max2);
            maxright[i] = max2;
        }
        for (int i = 0; i < n; i++) {
            if ((Math.min(maxleft[i], maxright[i]) - height[i]) > 0) {
                water += (Math.min(maxleft[i], maxright[i])) - height[i];
            }
        }
        return water;
    }
}
