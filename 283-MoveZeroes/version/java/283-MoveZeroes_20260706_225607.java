// Last updated: 7/6/2026, 10:56:07 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int p1 = 0, p2 = 0;
4
5        while(p2 < nums.length){
6            if(nums[p2] != 0){
7                int temp = nums[p1];
8                nums[p1] = nums[p2];
9                nums[p2] = temp;
10
11                p1++;
12            }
13            p2++;
14        }
15    }
16}