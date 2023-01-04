import java.util.*;
public class MyClass {
public static void newfunc(int [][] array,int col) { 
        for(int j=0;j<array.length;j++)
        for(int i=0;i<array.length-1-j;i++) {
            if(array[i][col]>array[i+1][col]) {
                int temp=array[i][col];
                array[i][col]=array[i+1][col];
                array[i+1][col]=temp;
                
            }       
        }
    }
}