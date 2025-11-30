package J05012;

import java.util.*;

class mh implements Comparable<mh>{
    private String ma, ten;
    long sl, gia, ck, tien;
    public mh(String ma, String ten, long sl, long gia, long ck){
        this.ma=ma;
        this.ten=ten;
        this.sl=sl;
        this.gia=gia;
        this.ck=ck;
        this.tien=gia*sl-ck;
    }
    @Override
    public int compareTo(mh a){
        return Long.compare(a.tien,this.tien);
    }
    public void kq(){
        System.out.printf("%s %s %d %d %d %d\n",ma,ten,sl,gia,ck,tien);
    }
}

public class J05012_TinhTien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<mh> a=new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            sc.nextLine();
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            long sl=sc.nextLong();
            long gia=sc.nextLong();
            long ck=sc.nextLong();
            a.add(new mh(ma,ten,sl,gia,ck));
        }
        Collections.sort(a);
        for(mh x:a) x.kq();
    }
}
