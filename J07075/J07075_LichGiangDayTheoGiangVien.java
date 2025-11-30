package J07075;

import java.util.*;
import java.io.*;

class Kip implements Comparable<Kip>{
    private String ma, gv, phong, mon;
    private int thu, kip;
    public Kip(String ma, int thu, int kip, String gv, String phong, String mon){
        this.ma=ma;
        this.thu=thu;
        this.kip=kip;
        this.gv=gv;
        this.phong=phong;
        this.mon=mon;
    }
    public String getGv() {
        return gv;
    }

    @Override
    public int compareTo(Kip a){
        if(this.thu!=a.thu) return this.thu-a.thu;
        if(this.kip!=a.kip) return this.kip-a.kip;
        return this.gv.compareTo(a.gv);
    }
    public void kq(){
        System.out.printf("%s %s %d %d %s\n",ma,mon,thu,kip,phong);
    }
}

public class J07075_LichGiangDayTheoGiangVien {
    public static void main(String[] args) throws Exception{
        List<Kip> a=new ArrayList<>();
        Map<String,String> mp=new HashMap<>();
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int t=sc.nextInt();
        while(t-->0){
            String ma=sc.next();
            sc.nextLine();
            String ten=sc.nextLine();
            int tin=sc.nextInt();
            mp.put(ma,ten);
        }
        Scanner sc1=new Scanner(new File("LICHGD.in"));
        int n=sc1.nextInt();
        for(int i=1;i<=n;i++){
            String ma="HP"+String.format("%03d",i);
            String mon=sc1.next();
            int thu=sc1.nextInt();
            int kip=sc1.nextInt();
            sc1.nextLine();
            String gv=sc1.nextLine();
            String phong=sc1.nextLine();
            a.add(new Kip(ma,thu,kip,gv,phong,mp.get(mon)));
        }
        String mau=sc1.nextLine();
        Collections.sort(a);
        System.out.println("LICH GIANG DAY GIANG VIEN "+mau+":");
        for(Kip x:a){
            if(x.getGv().equals(mau)) x.kq();
        }
    }
}