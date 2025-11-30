package J05037;

import java.util.*;

class mh implements Comparable<mh>{
    private String ma, ten, dv;
    private long gia, nhap, pvc, tien, gb;
    public mh(String ma, String ten, String dv, long gia, long nhap){
        this.ma=ma;
        this.ten=ten;
        this.dv=dv;
        this.pvc=Math.round(gia*nhap*0.05);
        this.tien=Math.round(this.pvc+gia*nhap);
        this.gb=(long)Math.ceil((this.tien*1.02/nhap)/100.0)*100;
    }
    @Override
    public int compareTo(mh a){
        return Long.compare(a.gb,this.gb);
    }
    public void kq(){
        System.out.printf("%s %s %s %d %d %d\n",ma,ten,dv,pvc,tien,gb);
    }
}

public class J05037_TinhGiaBan2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<mh> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String ma="";
            if(i<10) ma="MH0"+String.valueOf(i);
            else ma="MH"+String.valueOf(i);
            String ten=sc.nextLine();
            String dv=sc.nextLine();
            long gia=sc.nextLong(), nhap=sc.nextLong();
            a.add(new mh(ma,ten,dv,gia,nhap));
        }
        Collections.sort(a);
        for(mh x:a) x.kq();
    }
}

