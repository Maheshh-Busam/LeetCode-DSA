// Last updated: 7/5/2026, 10:43:17 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        
4        int[] result = new int[2];
5
6        int left = 0, right = numbers.length - 1;
7
8        while(left <= right){
9            int sum = numbers[left] + numbers[right];
10
11            if(sum == target){
12                result[0] = left + 1;
13                result[1] = right + 1;
14                break;
15            }
16            else if(sum < target){
17                left++;
18            }
19            else {
20                right--;
21            }
22        }
23
24        return result;
25    }
26}