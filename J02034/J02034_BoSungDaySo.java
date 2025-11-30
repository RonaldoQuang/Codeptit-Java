package J02034;

import java.util.*;

public class J02034_BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int i=0, k=1, ok=1;
        while(i<n){
            if(a[i]!=k){
                ok=0;
                System.out.println(k);
                k++;
            }
            else{
                k++;
                i++;
            }
        }
        if(ok==1) System.out.println("Excellent!");
    }
}
