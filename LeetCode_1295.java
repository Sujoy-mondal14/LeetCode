// Q: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/?envType=problem-list-v2&envId=array

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)) count++;
        }

        return count;
    }

    int digits(int num){
        int count = 0;

        if(num < 0) num = num * -1;
        if(num == 0) return 1;
        
        while(num > 0){
            count++;
            num/=10;
        }
        return count;
    }
    boolean even(int num){
        int numDigites = digits(num);

        return numDigites % 2 == 0;
    }
}