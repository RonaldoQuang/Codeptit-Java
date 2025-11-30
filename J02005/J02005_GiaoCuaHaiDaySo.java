package J02005;

import java.util.*;

public class J02005_GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        HashMap<Integer,Integer> mp=new HashMap<>();
        TreeSet<Integer> se=new TreeSet<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(mp.getOrDefault(a[i],0)==0){
                mp.put(a[i],1);
            }
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            if(mp.getOrDefault(b[i],0)==1){
                mp.put(b[i],2);
            }
        }
        for(Map.Entry<Integer,Integer> x: mp.entrySet()){
            if(x.getValue()==2) se.add(x.getKey());
        }
        for(int x:se){
            System.out.print(x+" ");
        }
    }
}
