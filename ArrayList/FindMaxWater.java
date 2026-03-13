public class FindMaxWater {
    // bruteforce approch
    public static int maxArea(int[] height) {
        int area = 0;
        int h = 0;
        int w = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                h = Math.min(height[i], height[j]);
                w = Math.abs(i - j);
                int Curr_area = h * w;
                if (Curr_area > area) {
                    area = Curr_area;
                }
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 2, 4, 5, 6, 8 };
        System.out.println(maxArea(height));
    }
}
