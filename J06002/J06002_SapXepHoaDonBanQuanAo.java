package J06002;

import java.util.*;

class MatHang{
    private String ma, ten;
    private long gia1, gia2;
    public MatHang(String ma, String ten, long gia1, long gia2){
        this.ma=ma;
        this.ten=ten;
        this.gia1=gia1;
        this.gia2=gia2;
    }
    public String getTen(){
        return this.ten;
    }
    public long getGia1(){
        return this.gia1;
    }
    public long getGia2(){
        return this.gia2;
    }
}

class HoaDon implements Comparable<HoaDon>{
    private MatHang mh;
    private String ma;
    private long giam, tien;
    public HoaDon(String ma, MatHang mh, long sl){
        this.ma=ma;
        this.mh=mh;
        if(sl>=150){
            int c=ma.charAt(2)-'0';
            if(c==1) this.giam=mh.getGia1()*sl/100*50;
            else this.giam=mh.getGia2()*sl/100*50;
        }
        else if(sl>=100){
            int c=ma.charAt(2)-'0';
            if(c==1) this.giam=mh.getGia1()*sl/100*30;
            else this.giam=mh.getGia2()*sl/100*30;
        }
        else if(sl>=50){
            int c=ma.charAt(2)-'0';
            if(c==1) this.giam=mh.getGia1()*sl/100*15;
            else this.giam=mh.getGia2()*sl/100*15;
        }
        int c=ma.charAt(2)-'0';
        if(c==1) this.tien=mh.getGia1()*sl-this.giam;
        else this.tien=mh.getGia2()*sl-this.giam;
    }
    @Override
    public int compareTo(HoaDon a){
        return Long.compare(a.tien,this.tien);
    }
    public void kq(){
        System.out.printf("%s %s %d %d\n",ma,mh.getTen(),giam,tien);
    }
}

public class J06002_SapXepHoaDonBanQuanAo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<HoaDon> a=new ArrayList<>();
        Map<String, MatHang> mp=new HashMap<>();
        int t=sc.nextInt();
        while(t-->0){
            String ma= sc.next();
            sc.nextLine();
            String ten=sc.nextLine();
            long gia1=sc.nextLong();
            long gia2=sc.nextLong();
            mp.put(ma,new MatHang(ma,ten,gia1,gia2));
        }
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            String s=sc.next();
            long sl=sc.nextLong();
            String ma=s+"-"+String.format("%03d",i);
            a.add(new HoaDon(ma,mp.get(ma.substring(0,2)),sl));
        }
        Collections.sort(a);
        for(HoaDon x:a) x.kq();
    }
}
