package com.ms.corejava.passwordgenerator;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 3, 4, 7, 8 };
        System.out.println(removeElement(arr, 1));

    }

    static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                nums[i] = 0;
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return (k);

    }

}
