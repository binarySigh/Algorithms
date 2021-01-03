package com.mjscode.algorithms.sort;

public class QuickSort {

    /**
     *
     * 实现思路：递归
     * 时间复杂度 O（N^2）
     * 初始数组中选最后一个数做基准，小于的放右边，等于的放中间，大于的放左边，然后去左右两个子数组中递归
     * 递归时传入的是
     */
    public static void quickSortV1(){


    }

    /**
     *
     * 实现思路：递归
     * 时间复杂度 O（N^2）
     * 初始数组中选最后一个数做基准，小于的放右边，等于的放中间，大于的放左边，然后去左右两个子数组中递归
     * 子数组递归处理逻辑跟主数组一样，子数组内选最右元素做划分基准
     * 递归时，传入等于区域的左右边界值
     */
    public static void quickSortV2(){


    }

    /**
     * 随机快排，即常规情况下提到的快排。上述快排方案仅为演化过程中的中间方案
     * 时间复杂度 O（NlogN）
     * 初始数组中随机选一个数与数组最右数做交换，并作为划分基准，小于的放右边，等于的放中间，大于的放左边，然后去左右两个子数组中递归
     * 子数组递归处理逻辑跟主数组一样，子数组内随机选一个数与数组最右数做交换，并作为划分基准
     * 递归时，传入等于区域的左右边界值
     */
    public static void quickSortV3(){


    }

}
