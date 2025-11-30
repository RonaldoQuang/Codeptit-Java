package J07012;

import java.util.*;
import java.io.*;

class Tu implements Comparable<Tu>{
    private String tu;
    private int hz;
    public Tu(String tu, int hz){
        this.tu=tu;
        this.hz=hz;
    }
    @Override
    public int compareTo(Tu a){
        if(this.hz!=a.hz) return a.hz-this.hz;
        return this.tu.compareTo(a.tu);
    }
    public void kq(){
        System.out.printf("%s %d\n",tu,hz);
    }
}

public class J07012_ThongKeTuKhacNhauTrongFileNhiPhan {
    public static void main(String[] args) throws Exception{
        Map<String,Integer> mp=new HashMap<>();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        List<Tu> b=new ArrayList<>();
        for(String x:a){
            String[] s=x.toLowerCase().trim().split("[^a-z0-9]");
            for(int i=0;i<s.length;i++){
                if(!s[i].isEmpty()) mp.put(s[i],mp.getOrDefault(s[i],0)+1);
            }
        }
        for(Map.Entry<String,Integer> x:mp.entrySet()){
            b.add(new Tu(x.getKey(),x.getValue()));
        }
        Collections.sort(b);
        for(Tu x:b){
            x.kq();
        }
    }
}
