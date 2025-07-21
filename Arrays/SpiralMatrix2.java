class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int top=0;
        int bottom = n-1;
        int right = n-1;
        int left = 0;
        int num=1;
        while (top<=bottom && left <=right){
            for (int i=left;i<=right;i++){
                arr[left][i]= num++;
            }
            top++;
            for (int i=top;i<=bottom;i++){
                arr[i][right]= num++;
            }
            right--;
            if(top<=bottom){
                for (int i=right;i>=left;i--){
                    arr[bottom][i]= num++;
                }
                bottom--;
            }
            if(left<=right){
                for (int i=bottom;i>=top;i--){
                    arr[i][left]= num++;
                }
                left++;
            }
        }
        return arr;
    }
}
//59. Spiral Matrix II
//Leetcode-Medium