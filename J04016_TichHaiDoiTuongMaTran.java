package J04016;

import java.util.*;
import java.io.*;

class Matrix{
    private long[][] a;
    private int n, m;
    public Matrix(int n, int m){
        this.a=new long[n][m];
        this.n=n;
        this.m=m;
    }
    public void nextMatrix(Scanner sc){
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.m;j++){
                this.a[i][j]=sc.nextLong();
            }
        }
    }
    public Matrix mul(Matrix b){
        Matrix c=new Matrix(this.n,b.m);
        for(int i=0;i<this.n;i++){
            for(int j=0;j<b.m;j++){
                long sum=0;
                for(int k=0;k<this.m;k++){
                    sum+=this.a[i][k]*b.a[k][j];
                }
                c.a[i][j]=sum;
            }
        }
        return c;
    }
    public String toString(){
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]="";
            for(int j=0;j<m;j++) {
                s[i]+=a[i][j]+" ";
            }
        }
        return String.join("\n",s);
    }
}

public class J04016_TichHaiDoiTuongMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
