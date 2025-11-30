package J05052;

import java.util.*;

class mh{
    private String ten, ma, stt;
    private long giam, tien;
    public mh(String ten, String ma, long sl, long gia){
        this.ten=ten;
        this.ma=ma;
        this.stt=ma.substring(1,4);
        if(ma.charAt(ma.length()-1)=='1') this.giam=gia*sl*50/100;
        else this.giam=gia*sl*30/100;
        this.tien=gia*sl-this.giam;
    }
    public void kq(){
        System.out.printf("%s %s %s %d %d\n",ten,ma,stt,giam,tien);
    }
}

public class J05052_TraCuuDonHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<mh> a=new ArrayList<>();
        while(n-->0){
            sc.nextLine();
            String ten=sc.nextLine();
            String ma=sc.next();
            long gia=sc.nextLong();
            long sl=sc.nextLong();
            a.add(new mh(ten,ma,sl,gia));
        }
        for(mh x:a) x.kq();
    }
}
