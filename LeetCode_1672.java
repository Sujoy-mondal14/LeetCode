// Q: https://leetcode.com/problems/richest-customer-wealth/description/?envType=problem-list-v2&envId=array

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for(int[] row : accounts){
            int sum = 0;
            for(int col : row){
                sum+=col;
            }
            if(sum > maxWealth) maxWealth = sum;
        }

        return maxWealth;
    }
}