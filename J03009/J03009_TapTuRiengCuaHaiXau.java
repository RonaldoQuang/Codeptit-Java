package J03009;

import java.util.*;

public class J03009_TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            String[] a=s1.trim().split("\\s+");
            String[] b=s2.trim().split("\\s+");
            Map<String,Integer> mp=new HashMap<>();
            for(int i=0;i<b.length;i++){
                mp.put(b[i],1);
            }
            for(int i=0;i<a.length;i++){
                if(mp.getOrDefault(a[i],0)==0){
                    mp.put(a[i],0);
                }
            }
            Set<String> se=new TreeSet<>();
            for(Map.Entry<String,Integer> x:mp.entrySet()){
                if(x.getValue()==0) se.add(x.getKey());
            }
            for(String x:se){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
