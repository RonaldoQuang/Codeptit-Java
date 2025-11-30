package J07077;

import java.util.*;
import java.io.*;

public class J07077_TinhGiaTriBieuThuc {
    static int price(char c) {
        if(c=='*'||c=='/') return 2;
        if(c=='+'||c=='-') return 1;
        return 0;
    }
    static long tinh(long a, long b, char c) {
        if(c=='+') return a+b;
        if(c=='-') return a - b;
        if(c=='*') return a * b;
        if(c=='/') return a / b;
        return 0;
    }
    static long kq(String s){
        Stack<Long> st=new Stack<>();
        int i=0;
        while(i<s.length()) {
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                long a=0;
                while(i<s.length()&&Character.isDigit(s.charAt(i))){
                    a=a*10+(s.charAt(i)-'0');
                    i++;
                }
                st.push(a);
                i--;
            }
            else if(ch=='*'||ch=='/'||ch=='+'||ch=='-'){
                long b=st.pop();
                long a=st.pop();
                st.push(tinh(a,b,ch));
            }
            i++;
        }
        return st.peek();
    }

    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("BIEUTHUC.in"));
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine().trim();
            StringBuilder w=new StringBuilder();
            Stack<Character> st=new Stack<>();
            int i=0;
            while(i<s.length()){
                char ch=s.charAt(i);
                if(ch=='('){
                    st.push(ch);
                }
                else if(ch==')'){
                    while(!st.isEmpty()&&st.peek()!='('){
                        w.append(st.pop());
                    }
                    st.pop();
                }
                else if(ch=='*'||ch=='/'||ch=='+'||ch=='-'){
                    while(!st.isEmpty()&& price(st.peek())>=price(ch)){
                        w.append(st.pop());
                    }
                    st.push(ch);
                }
                else if(Character.isDigit(ch)){
                    while(i<s.length()&& Character.isDigit(s.charAt(i))){
                        w.append(s.charAt(i));
                        i++;
                    }
                    i--;
                    w.append(' ');
                }
                i++;
            }
            while(!st.isEmpty()){
                if(st.peek()!='(') w.append(st.pop());
                else st.pop();
            }
            System.out.println(kq(w.toString()));
        }
    }
}