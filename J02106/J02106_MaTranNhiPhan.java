package J02106;

import java.util.*;

public class J02106_MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        //while(t-->0){
        int n=sc.nextInt(), dem=0;
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==1){
                    ++cnt;
                }
            }
            if(cnt>3-cnt){
                ++dem;
            }
        }
        System.out.println(dem);
        //}
    }
}
