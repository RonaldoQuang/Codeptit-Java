package J07050;

import java.util.*;
import java.io.File;

class mh implements Comparable<mh>{
    private String ma, ten, nhom;
    private double ln;
    public mh(String ma, String ten, String loai, double mua, double ban){
        this.ma=ma;
        this.ten=ten;
        this.nhom=loai;
        this.ln=ban-mua;
    }
    @Override
    public int compareTo(mh a){
        return Double.compare(a.ln,this.ln);
    }
    public void kq(){
        System.out.printf("%s %s %s %.2f\n",ma,ten,nhom,ln);
    }
}

public class J07050_SapXepMatHang {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("MATHANG.in"));
        List<mh> a=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String ma="MH"+String.format("%02d",i);
            String ten=sc.nextLine();
            String nhom=sc.nextLine();
            double mua=sc.nextDouble();
            double ban=sc.nextDouble();
            a.add(new mh(ma,ten,nhom,mua,ban));
        }
        Collections.sort(a);
        for(mh x:a) x.kq();
    }
}
