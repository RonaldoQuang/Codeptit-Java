package J02012;

import java.util.*;

public class J02012_SapXepChen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.print("Buoc "+i+": ");
            Arrays.sort(a,0,i+1);
            for(int j=0;j<=i;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}
