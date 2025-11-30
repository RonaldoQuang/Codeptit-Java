package J07011;

import java.util.*;
import java.io.*;

class chu implements Comparable<chu>{
    private String tu;
    private int hz;
    public chu(String tu, int hz){
        this.tu=tu;
        this.hz=hz;
    }
    @Override
    public int compareTo(chu a){
        if(this.hz!=a.hz) return a.hz-this.hz;
        return this.tu.compareTo(a.tu);
    }
    public void kq(){
        System.out.printf("%s %d\n",tu,hz);
    }
}

public class J07011_ThongKeTuKhacNhauTrongFileVanBan {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("VANBAN.in"));
        Map<String,Integer> mp=new HashMap<>();
        List<chu> a=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String s=sc.nextLine().toLowerCase();
            String[] b=s.split("\\W+");
            for(String w:b) {
                if(!w.isEmpty()) {
                    mp.put(w,mp.getOrDefault(w,0)+1);
                }
            }
        }
        for(Map.Entry<String,Integer> x:mp.entrySet()){
            a.add(new chu(x.getKey(),x.getValue()));
        }
        Collections.sort(a);
        for(chu x:a) x.kq();
    }
}
