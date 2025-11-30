package J05032;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class nguoi implements Comparable<nguoi>{
    private String ten, dob;
    private int d, m, y;
    public nguoi(String ten, String dob){
        this.ten=ten;
        this.dob=dob;
        String[] a=this.dob.split("/");
        this.d=Integer.parseInt(a[0]);
        this.m=Integer.parseInt(a[1]);
        this.y=Integer.parseInt(a[2]);
    }
    @Override
    public int compareTo(nguoi a){
        if(this.y!=a.y) return a.y-this.y;
        if(this.m!=a.m) return a.m-this.m;
        return a.d-this.d;
    }
    public void kq(){
        System.out.println(this.ten);
    }
}

public class J05032_TreNhat_GiaNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<nguoi> a=new ArrayList<>();
        while(t-->0){
            String ten=sc.next();
            String dob=sc.next();
            nguoi x=new nguoi(ten,dob);
            a.add(x);
        }
        Collections.sort(a);
        a.get(0).kq();
        a.get(a.size()-1).kq();
    }
}
