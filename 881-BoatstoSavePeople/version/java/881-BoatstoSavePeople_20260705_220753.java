// Last updated: 7/5/2026, 10:07:53 PM
1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        
4        Arrays.sort(people);
5
6        int minBoats = 0;
7        int left = 0, right = people.length - 1;
8
9        while(left <= right){
10            if(people[left] + people[right] <= limit){
11                left++;
12            }
13            right--;
14            minBoats++;
15        }
16        return minBoats;
17    }
18}