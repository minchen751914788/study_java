package com.minchen.august23;

//给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//子数组 是数组中的一个连续部分。

public class BiggestArray {
    public static void main(String[] args) {
        int num[] ={-2,1,-3,4,-1,2,1,-5,4};
        BiggestArray b = new BiggestArray();
        int result=b.getBiggest(num);
        System.out.println(result);

    }

    public int getBiggest(int[] num){
        //用来存放当前的最大值
        int maxSum = num[0];

        //用来存放当前之和
        int prefixSum = num[0];
        for(int i =0;i<=num.length-1;i++){
            if(prefixSum <= 0){
                prefixSum = num[i];
            }
            else {
                prefixSum = prefixSum + num[i];
            }

            if(prefixSum > maxSum){
                maxSum = prefixSum;
            }
        }

        return maxSum;
    }

}


//在看到这个题的时候，由于我们求的是连续字串的最大和，所以当我们在遍历求和的过程中，我们会发现，有一个关键值就是当前遍历数字的之前的数字之和。
//        1、当之前数字之和小于等于0时，就说明前面的和无增益效果，我们就应当舍弃掉，所以就是将整个字符串舍弃掉，就直接将我们当前遍历的数字赋值到之前的和。
//        2、当之前数字之和大于0时，就说明前面的和有增益效果，我们就应该将当前遍历的数字与之前的字串的和相加。
//        最后：我们需要比较历史的最大和值与当前正在遍历的最大和值，如果超过历史的最大值，则更改历史的最大值
//        ————————————————
//        版权声明：本文为CSDN博主「小乐乐的天台」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/qq_41931364/article/details/124923509