package J02102;

import java.util.*;

public class J02102_MaTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        int[][] b=new int[n][n];
        int[][] c=new int[n][n];
        int[]d=new int[n*n];
        int cnt=1,h1=0,h2=n-1,c1=0,c2=n-1;
        while(h1<=h2&&c1<=c2){
            for(int i=c1;i<=c2;i++){
                a[h1][i]=cnt;
                ++cnt;
            }
            ++h1;
            for(int i=h1;i<=h2;i++){
                a[i][c2]=cnt;
                ++cnt;
            }
            --c2;
            if(c1<=c2){
                for(int i=c2;i>=c1;i--){
                    a[h2][i]=cnt;
                    ++cnt;
                }
                --h2;
            }
            if(h1<=h2){
                for(int i=h2;i>=h1;i--){
                    a[i][c1]=cnt;
                    ++cnt;
                }
                ++c1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                d[a[i][j]-1]=b[i][j];
            }
        }
        Arrays.sort(d,0,n*n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=d[a[i][j]-1];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
