package com.company;

public class Solution {
    public int search(int[] nums, int target) {
        int leftBound = 0;
        int rightBound = nums.length - 1;
        int searchIndex =  leftBound + (rightBound - leftBound) / 2;
        int lastTwo = 0;

        do {
            if (nums[searchIndex] > target) {
                rightBound = searchIndex;
            } else if (nums[searchIndex] < target) {
                leftBound = searchIndex;
            } else {
                return searchIndex;
            }
            searchIndex =  leftBound + (rightBound - leftBound) / 2;
            if (rightBound - leftBound == 1){
                if (lastTwo == 1){
                    searchIndex = rightBound;
                }else if(lastTwo == 2){
                    leftBound = rightBound;
                }
                lastTwo++;

            }

        }while (leftBound < rightBound);

        return -1;
    }
}
