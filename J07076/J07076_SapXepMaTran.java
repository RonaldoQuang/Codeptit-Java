package J07076;

import java.util.*;
import java.io.*;

public class J07076_SapXepMaTran {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("MATRIX.in"));
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int[][] a=new int[n+1][m+1];
            int[] b=new int[n+1];
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    a[i][j]=sc.nextInt();
                    if(j==k) b[i]=a[i][j];
                }
            }
            Arrays.sort(b);
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    if(j==k) System.out.print(b[i]+" ");
                    else System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
