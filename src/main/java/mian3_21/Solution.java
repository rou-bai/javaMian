package mian3_21;
/*
题目：给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

你可以按任意顺序返回答案。

 

示例 1：

输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
示例 2：

输入：nums = [3,2,4], target = 6
输出：[1,2]
示例 3：

输入：nums = [3,3], target = 6
输出：[0,1]

 */
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] list = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j = 1+1; j < nums.length; j ++){
                if(nums[i] + nums[j] == target){
                    list[0] = i;
                    list[1] = j;
                    break;
                }
            }
        }
        return list;

    }
    public static void main(String[] args){
        int[] a = twoSum(new int[]{3, 3}, 6);
        System.out.printf(a.toString());

    }
}
