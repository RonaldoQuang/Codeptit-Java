package J01005;

import java.util.*;

public class J01005_ChiaTamGiac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            double h=sc.nextDouble();
            for(int i=1;i<n;i++){
                System.out.printf("%.6f",Math.sqrt(h*h*((double)i/n)));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
