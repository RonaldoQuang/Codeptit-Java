package J07004;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("DATA.in"));
        int[] a=new int[1000];
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            a[n]++;
        }
        for(int i=0;i<1000;i++){
            if(a[i]>0) System.out.println(i+" "+a[i]);
        }
    }
}
