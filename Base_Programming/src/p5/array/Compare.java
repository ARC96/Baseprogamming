package p5.array;

import java.util.Arrays;

public class Compare
{
    public static void main(String[] args) {
        //compare two array..(inbuilt)
         //1D
        System.out.println("1D");
        int a[]={'1','2','3','4','5'};
        int b[]=a.clone();
        System.out.println(Arrays.equals(a,b));
         b[4]=6;
         System.out.println(Arrays.equals(a,b));

         //2D
        System.out.println("2D");
        int c[][]={{1,2,3,4},{5,6}};
        int d[][]=c.clone();
        System.out.println(Arrays.equals(c,d));
         d[0][d.length-1]=3;
         System.out.println(Arrays.equals(c,d));


    }
}