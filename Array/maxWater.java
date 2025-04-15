class Solution {
    public int maxArea(int[] height) {
         
        int maxArea =0;
        int currentArea=0;
        if(height.length==2){
            return min(height[0],height[1]);
        }

        // for (int i = 0; i < height.length; i++){
        //     for (int j = i+1; j < height.length; j++){ 
        //         currentArea = min(height[i],height[j]) * (j-i);
        //         if(maxArea < currentArea) maxArea = currentArea; 
        //     }
        // }

        for (int i = 0; i < height.length/2; i++){
                currentArea = min(height[i],height[height.length-i-1]) * ((height.length-i-1)-i);
                if(maxArea < currentArea) maxArea = currentArea;
        }
 
        return maxArea;
    }

    public static int min(int num1,int num2) {
        if (num1>=num2) return num2;
        else return num1;
    }
}

class maxWater{
    public static void main(String[] args) {
        
    }
}