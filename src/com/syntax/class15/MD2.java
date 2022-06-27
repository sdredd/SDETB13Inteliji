package com.syntax.class15;

public class MD2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        ArrayUtils array = new ArrayUtils();
        array.printArray(arr);

        int sum=array.sunArray(arr);
        System.out.println(sum);
    }
}
