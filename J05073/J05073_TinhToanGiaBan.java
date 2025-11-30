package J05073;

import java.util.*;

class mh{
    String ma;
    double tien;
    public mh(String ma, double tien){
        this.ma=ma;
        this.tien=tien;
    }
    public void kq(){
        System.out.printf("%s %.2f\n",ma,tien);
    }
}

public class J05073_TinhToanGiaBan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<mh> a=new ArrayList<>();
        int n= sc.nextInt();
        while(n-->0){
            String ma=sc.next();
            long gia=sc.nextLong(), sl=sc.nextLong();
            long tong=gia*sl;
            double vat=thue(ma,tong), ship=pvc(ma,tong);
            if(ma.charAt(ma.length()-1)=='C') vat=vat*0.95;
            double tien=(tong*1.0+vat+ship)*1.2/(sl*1.0);
            a.add(new mh(ma,tien));
        }
        for(mh x:a) x.kq();
    }
    public static double thue(String ma, long tong){
        char c=ma.charAt(0);
        if(c=='T') return tong*0.29;
        else if(c=='C') return tong*0.1;
        else if(c=='D') return tong*0.08;
        else return tong*0.02;
    }
    public static double pvc(String ma, long tong){
        char c=ma.charAt(0);
        if(c=='T') return tong*0.04;
        else if(c=='C') return tong*0.03;
        else if(c=='D') return tong*0.025;
        else return tong*0.005;
    }
}