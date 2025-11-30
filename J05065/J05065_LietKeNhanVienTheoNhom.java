package J05065;

import java.util.*;

class nv implements Comparable<nv>{
    private String ten, cv, hieu, bac;
    public nv(String ten, String ma){
        this.ten=ten;
        this.cv=ma.substring(0,2);
        this.hieu=ma.substring(4,7);
        this.bac=ma.substring(2,4);
    }
    public String getCv(){
        return this.cv;
    }
    public void sua(){
        this.cv="NV";
    }
    @Override
    public int compareTo(nv a){
        if(!this.bac.equals(a.bac)) return a.bac.compareTo(this.bac);
        return this.hieu.compareTo(a.hieu);
    }
    public void kq(){
        System.out.printf("%s%s %s %s\n",ten,cv,hieu,bac);
    }
}

public class J05065_LietKeNhanVienTheoNhom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<nv> a=new ArrayList<>();
        Map<String,Integer> dem=new HashMap<>();
        dem.put("GD",0);
        dem.put("TP",0);
        dem.put("PP",0);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String w=sc.nextLine();
            String[] s=w.split("\\s+");
            String ma=s[0];
            String ten="";
            for(int i=1;i<s.length;i++){
                ten+=s[i]+" ";
            }
            nv x=new nv(ten,ma);
            String cv=x.getCv();
            if(cv.equals("GD")){
                if(dem.get("GD")>=1) x.sua();
                else dem.put("GD", dem.get("GD")+1);
            }
            else if(cv.equals("TP")){
                if(dem.get("TP")>=3) x.sua();
                else dem.put("TP", dem.get("TP")+1);
            }
            else if(cv.equals("PP")){
                if(dem.get("PP")>=3) x.sua();
                else dem.put("PP", dem.get("PP")+1);
            }
            a.add(x);
        }
        Collections.sort(a);
        int q=sc.nextInt();
        while(q-->0){
            String mau=sc.next();
            for(nv x:a){
                if(x.getCv().equals(mau)) x.kq();
            }
            System.out.println();
        }
    }
}
