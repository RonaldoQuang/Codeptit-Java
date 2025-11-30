package J05023;

import java.util.*;
import java.util.ArrayList;

class sv{
    private String ma, ten, lop, email;
    public sv(String ma, String ten, String lop, String email){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.email=email;
    }
    public String getKhoa(){
        return lop.substring(1,3);
    }
    public void kq(){
        System.out.printf("%s %s %s %s\n",ma,ten,lop,email);
    }
}

public class J05023_LietKeSinhVienTheoKhoa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<sv> a=new ArrayList<>();
        sc.nextLine();
        while(n-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String email=sc.nextLine();
            a.add(new sv(ma,ten,lop,email));
        }
        int q=sc.nextInt();
        while(q-->0){
            String mau=sc.next();
            String khoa = mau.substring(2);
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n",mau);
            for(sv x:a){
                if(x.getKhoa().equals(khoa)) x.kq();
            }
        }
    }
}