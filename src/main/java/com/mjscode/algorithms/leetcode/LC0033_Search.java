package com.mjscode.algorithms.leetcode;

/**
 * //升序排列的整数数组 nums 在预先未知的某个点上进行了旋转（例如， [0,1,2,4,5,6,7] 经旋转后可能变为 [4,5,6,7,0,1,2] ）。
 * //
 * //
 * // 请你在数组中搜索 target ，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * //
 * // 示例 1：
 * //
 * //输入：nums = [4,5,6,7,0,1,2], target = 0
 * //输出：4
 * //
 * // 示例 2：
 * //
 * //输入：nums = [4,5,6,7,0,1,2], target = 3
 * //输出：-1
 * //
 * // 示例 3：
 * //
 * //输入：nums = [1], target = 0
 * //输出：-1
 * //
 * // 提示：
 * //
 * // 1 <= nums.length <= 5000
 * // -10^4 <= nums[i] <= 10^4
 * // nums 中的每个值都 独一无二
 * // nums 肯定会在某个点上旋转
 * // -10^4 <= target <= 10^4
 * //
 * // Related Topics 数组 二分查找
 * @author binarySigh
 */
public class LC0033_Search {

    public static void main(String[] args){
        int[] nums = {15, 16, 17, 18, 20, -5, -3, 2, 5, 6, 8, 9, 10, 11};
        //int target = -5;
        int target = 15;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if(nums == null || nums.length < 1){
            return -1;
        }
        if(nums.length == 1){
            return nums[0] == target ? 0 : -1;
        }
        int mid = 0;
        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            mid = l + ((r - l) >> 1);
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        //l == r时跳出循环，那么此时判断l位置元素与目标元素是否相等即可得到答案
        return nums[l] == target ? l : -1;
    }

    /**
     * 官方的二分解法
     * @param nums
     * @param target
     * @return
     */
    public int searchByLeetCode(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
