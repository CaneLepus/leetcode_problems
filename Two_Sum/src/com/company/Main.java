package com.company;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,7,11,15};
        int[] answer = solution.twoSum(nums, 9);

        for (int index: answer) {
            System.out.println(index);
        }
    }
}
