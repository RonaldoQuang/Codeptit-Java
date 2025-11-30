package J02023;

import java.util.*;

public class J02023_LuaChonThamLam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(), s=sc.nextInt();
        int a=s/9;
        if(s>9*m||s==0){
            System.out.print("-1 -1");
        }
        else{
            if(s%9==0){
                if(m==a){
                    int t=2;
                    while(t-->0){
                        for(int i=1;i<=a;i++){
                            System.out.print("9");
                        }
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print("1");
                    for(int i=1;i<=m-(a-1)-2;i++){
                        System.out.print("0");
                    }
                    System.out.print("8");
                    for(int i=1;i<a;i++){
                        System.out.print("9");
                    }
                    System.out.print(" ");
                    for(int i=1;i<=a;i++){
                        System.out.print("9");
                    }
                    for(int i=1;i<=m-a;i++){
                        System.out.print("0");
                    }
                }
            }
            else{
                if(m>a+1){
                    System.out.print("1");
                    for(int i=1;i<=m-2-a;i++){
                        System.out.print("0");
                    }
                    System.out.print(s-a*9-1);
                    for(int i=1;i<=a;i++){
                        System.out.print("9");
                    }
                    System.out.print(" ");
                    for(int i=1;i<=a;i++){
                        System.out.print("9");
                    }
                    System.out.print(s-a*9);
                    for(int i=1;i<=m-a-1;i++){
                        System.out.print("0");
                    }
                }
                else{
                    System.out.print(s-a*9);
                    for(int i=1;i<=a;i++){
                        System.out.print("9");
                    }
                    System.out.print(" ");
                    for(int i=1;i<=a;i++){
                        System.out.print("9");
                    }
                    System.out.println(s-a*9);
                }
            }
        }
    }
}
