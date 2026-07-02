// Last updated: 7/2/2026, 8:43:04 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int left = 0;
4        int mid = 0;
5        int right = nums.length - 1;
6
7        while(mid <= right){
8            if(nums[mid] == 0){
9                swap(nums, left, mid);
10                left++;
11                mid++;
12            }
13            else if(nums[mid] == 1){
14                mid++;
15            }
16            else {
17                swap(nums, mid, right);
18                right--;
19            }
20        }
21    }
22    public void swap(int[] nums, int left, int right){
23        int temp = nums[left];
24        nums[left] = nums[right];
25        nums[right] = temp;
26    }
27}