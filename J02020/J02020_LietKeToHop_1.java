package J02020;

import java.util.*;

public class J02020_LietKeToHop_1 {
    public static int cnt=0;
    public static int [] a=new int[11];
    public static void kq(int k){
        for(int i=1;i<=k;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void Try(int i, int n, int k){
        for(int j=a[i-1]+1;j<=n-k+i;j++){
            a[i]=j;
            if(i==k){
                ++cnt;
                kq(k);
            }
            else{
                Try(i+1,n,k);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        a[0]=0;
        Try(1,n,k);
        System.out.println("Tong cong co "+cnt+" to hop");
    }
}
