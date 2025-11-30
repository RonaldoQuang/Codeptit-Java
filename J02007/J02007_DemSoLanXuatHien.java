package J02007;

import java.util.*;

public class J02007_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1;k<=t;k++){
            int n=sc.nextInt();
            int[] a=new int[n];
            System.out.println("Test "+k+":");
            Map<Integer,Integer> mp=new LinkedHashMap<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                mp.put(a[i],mp.getOrDefault(a[i],0)+1);
            }
            for(Map.Entry<Integer,Integer> x:mp.entrySet()){
                System.out.println(x.getKey()+" xuat hien "+x.getValue()+" lan");
            }
        }

    }
}
