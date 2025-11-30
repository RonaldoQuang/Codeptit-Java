package J07028;

import java.util.*;
import java.io.*;

class DanhSach{
    private String gv;
    private float gio;
    public DanhSach(String gv, float gio){
        this.gv=gv;
        this.gio=gio;
    }
    public void kq(){
        System.out.printf("%s%.2f\n",gv,gio);
    }
}

public class J07028_TinhGioChuan {
    public static void main(String[] args) throws Exception{
        List<DanhSach> a=new ArrayList<>();
        Map<String,String> mp=new LinkedHashMap<>();
        Map<String,Float> mp1=new HashMap<>();
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
        }
        Scanner sc1=new Scanner(new File("GIANGVIEN.in"));
        int n=sc1.nextInt();
        sc1.nextLine();
        while(n-->0){
            String w=sc1.nextLine();
            String[] s=w.split("\\s+");
            String ma=s[0];
            StringBuilder ten=new StringBuilder();
            for(int i=1;i<s.length;i++) ten.append(s[i]).append(" ");
            mp.put(ma,ten.toString());
            mp1.put(ma,0f);
        }
        Scanner sc2=new Scanner(new File("GIOCHUAN.in"));
        int m=sc2.nextInt();
        while(m-->0){
            String ma=sc2.next();
            String ma1=sc2.next();
            float gio=sc2.nextFloat();
            mp1.put(ma,mp1.get(ma)+gio);
        }
        for(Map.Entry<String,String> x: mp.entrySet()){
            a.add(new DanhSach(x.getValue(),mp1.get(x.getKey())));
        }
        for(DanhSach x:a) x.kq();
    }
}

