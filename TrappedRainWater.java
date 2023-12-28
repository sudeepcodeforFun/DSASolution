public class TrappedRainWater {
    public static int trappedRainWater(int height[]){
        int n = height.length;
        int width = 1;
        int trappedRainWater = 0;

        // creating an two array
        int leftMaxBoundary[] = new int[n];
        int rightMaxBoundary[] = new int[n];

        // assiging the first value to leftMaxBoundary array
        leftMaxBoundary[0] = height[0];
        for(int i=1; i<n; i++){
            leftMaxBoundary[i] = Math.max(leftMaxBoundary[i-1], height[i]);
        }

        // assiging the last value to rightMaxBoundary array
        rightMaxBoundary[n - 1] = height[n - 1];
        for(int i=n-2; i>=0; i--){
            rightMaxBoundary[i] =Math.max(rightMaxBoundary[i+1], height[i]);
        }
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            trappedRainWater += (waterlevel - height[i])*width;
        }


        return trappedRainWater;
    }
    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        int ans = trappedRainWater(height);
        System.out.println("volume of trapped water is:"+ans);
    }
}
