package J04002;

import java.util.*;

class Retange{
    private int x;
    private int y;
    private String z;
    public Retange(int x, int y, String z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void getColor(){
        String s=this.z;
        String w=s.substring(0,1).toUpperCase()+s.substring(1,s.length()).toLowerCase();
        System.out.print(w);
    }
    public int findArea(){
        return (this.x+this.y)*2;
    }
    public int findPerimeter(){
        return this.x*this.y;
    }
}

public class J04002_KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        //while(t-->0){
        int x=sc.nextInt(), y=sc.nextInt();
        String s=sc.next();
        Retange a=new Retange(x,y,s);
        if(x<=0||y<=0) System.out.println("INVALID");
        else{
            System.out.print(a.findArea()+" "+a.findPerimeter()+" ");
            a.getColor();
        }
        //}
    }
}
