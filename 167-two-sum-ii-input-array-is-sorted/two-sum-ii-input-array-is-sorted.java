class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        //   2,4,5
        //   i
        //       j
        //   check 2+5 = 7; 7<9   i = i+1
        //         4+5 = 9; 9=9   return [1+1,2+1] = [2,3]
        // T:O(n)
        // S:O(1)

        while(i<j){
            int sum = numbers[i] + numbers[j];

            if(sum > target){
                j = j-1;
            }else if(sum < target){
                i = i+1;
            }else{
                return new int[]{
                    i+1,
                    j+1,
                };
            }

        }
        return new int[]{
            -1,-1
        };
    }
}