package J02013;

import java.util.*;

public class J02013_SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int x=dem(a,n), cnt=1;
        while(x==0){
            for(int i=0;i<n-1;i++){
                if(a[i]>a[i+1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            System.out.print("Buoc "+cnt+": ");
            for(int i=0;i<n;i++) System.out.print(a[i]+" ");
            System.out.println();
            ++cnt;
            x=dem(a,n);
        }
    }
    public static int dem(int[] a, int n){
        int cnt=0;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                ++cnt;
                break;
            }
        }
        if(cnt==0) return 1;
        else return 0;
    }
}
