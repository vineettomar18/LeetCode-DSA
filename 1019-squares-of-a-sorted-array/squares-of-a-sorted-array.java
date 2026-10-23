class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int k = n-1;

        int res[] = new int[n];

        while(i<=j){
            int leftSquare = nums[i] * nums[i];
            int rightSquare = nums[j] *nums[j];

            if(leftSquare<rightSquare){
                res[k] = rightSquare;
                j--;
                k--;
            }else{
                res[k] = leftSquare;
                i++;
                k--;
            }
        }
        return res;
    }
}