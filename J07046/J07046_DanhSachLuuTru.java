package J07046;

import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class kh implements Comparable<kh>{
    private String ma, ten, phong;
    private int ngay;
    public kh(String ma, String ten, String phong, String bd, String kt){
        this.ma=ma;
        this.ten=ten;
        this.phong=phong;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(bd, fmt);
        LocalDate d2 = LocalDate.parse(kt, fmt);
        Period diff = Period.between(d1, d2);
        this.ngay= diff.getDays();
    }
    @Override
    public int compareTo(kh a){
        return a.ngay-this.ngay;
    }
    public void kq(){
        System.out.printf("%s %s %s %d\n",ma,ten,phong,ngay);
    }
}

public class J07046_DanhSachLuuTru {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("KHACH.in"));
        List<kh> a=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String ma="KH"+String.format("%02d",i);
            String ten=sc.nextLine();
            String phong=sc.nextLine();
            String bd=sc.nextLine();
            String kt=sc.nextLine();
            a.add(new kh(ma,ten,phong,bd,kt));
        }
        Collections.sort(a);
        for(kh x:a) x.kq();
    }
}
