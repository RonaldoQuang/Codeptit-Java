package J02006;

import java.util.*;

public class J02006_HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        TreeSet<Integer> se=new TreeSet<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            se.add(a[i]);
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            se.add(b[i]);
        }
        for(int x:se){
            System.out.print(x+" ");
        }
    }
}
