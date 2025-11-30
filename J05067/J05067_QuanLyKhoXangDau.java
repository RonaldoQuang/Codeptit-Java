package J05067;

import java.util.*;

class mh{
    private String ma, hang;
    private long gia, thue, tien;
    public mh(String ma, String hang, long sl){
        this.ma=ma;
        this.hang=hang;
        if(ma.charAt(0)=='X'){
            this.gia=128000;
            this.thue=this.gia*sl*3/100;
        }
        else if(ma.charAt(0)=='D'){
            this.gia=11200;
            this.thue=this.gia*sl*35/1000;
        }
        else{
            this.gia=9700;
            this.thue=this.gia*sl*2/100;
        }
        if(ma.substring(ma.length()-2,ma.length()).equals("TN")) this.thue=0;
        this.tien=this.gia*sl+this.thue;
    }
    public void kq(){
        System.out.printf("%s %s %d %d %d\n",ma,hang,gia,thue,tien);
    }
}

public class J05067_QuanLyKhoXangDau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,String> mp=new HashMap<>();
        mp.put("BP","British Petro");
        mp.put("ES","Esso");
        mp.put("SH","Shell");
        mp.put("CA","Castrol");
        mp.put("MO","Mobil");
        mp.put("TN","Trong Nuoc");
        List<mh> a=new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            String ma=sc.next();
            long sl=sc.nextLong();
            a.add(new mh(ma,mp.get(ma.substring(ma.length()-2,ma.length())),sl));
        }
        for(mh x:a) x.kq();
    }
}