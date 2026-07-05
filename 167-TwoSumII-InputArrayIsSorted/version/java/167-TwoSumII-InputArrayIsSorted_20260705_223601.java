// Last updated: 7/5/2026, 10:36:01 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        Map<Integer, Integer> map = new HashMap<>();
4        int[] result = new int[2];
5
6        for(int i = 0; i < numbers.length; i++){
7            int diff = target - numbers[i];
8
9            if(map.containsKey(diff)){
10                result[0] = map.get(diff) + 1;
11                result[1] = i + 1;
12            }
13            map.put(numbers[i], i);
14        }
15
16        return result;
17    }
18}