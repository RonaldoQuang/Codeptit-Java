package J07045;

import java.util.*;
import java.io.*;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String loai, ten, gia, phi;
    public LoaiPhong(String s){
        String[] a=s.trim().split("\\s+");
        this.loai=a[0];
        this.ten=a[1];
        this.gia=a[2];
        this.phi=a[3];
    }
    @Override
    public int compareTo(LoaiPhong a){
        return this.ten.compareTo(a.ten);
    }
    public String toString(){
        return loai+" "+ten+" "+gia+" "+phi;
    }
}

public class J07045_LoaiPhong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
