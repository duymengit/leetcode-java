package com.menes.leetcode;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int res =(int) (dividend/divisor);
        return res;
    }
}
