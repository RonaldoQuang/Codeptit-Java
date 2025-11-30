package J07037;

import java.util.*;
import java.io.*;

class dn implements Comparable<dn>{
    private String ma, ten;
    private int sl;
    public dn(String ma, String ten, int sl){
        this.ma=ma;
        this.ten=ten;
        this.sl=sl;
    }
    @Override
    public int compareTo(dn a){
        return this.ma.compareTo(a.ma);
    }
    public void kq(){
        System.out.printf("%s %s %d\n",ma,ten,sl);
    }
}

public class J07037_DanhSachDoanhNghiep {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("DN.in"));
        int n=sc.nextInt();
        List<dn> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int sl=sc.nextInt();
            a.add(new dn(ma,ten,sl));
        }
        Collections.sort(a);
        for(dn x:a) x.kq();
    }
}

