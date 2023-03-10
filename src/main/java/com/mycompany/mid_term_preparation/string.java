package com.mycompany.mid_term_preparation;
import static java.lang.System.out;

public class string {
    
    static void makeUpper(){
        String s = "Code With Redoy";
        String upper = s.toUpperCase();
        out.println(upper);
    }
    
    static void iterate(){
        char[] ch = {'a', 'b', 'c', 'd'};
        
        for(int i = 0; i < 4; i++){
            out.println(ch[i]);
        }
    }
    static void concate(){
        String s1 = "Code With ";
        String s2 = "Redoy";
//        String res = s1 + s2;
        String res = s1.concat(s2);
        out.println(res);
    }
    static void convert(){
        char[] ch = {'a', 'b', 'c', 'd'};
        String s = new String(ch);
        out.println(s);
    }
    
    static void compare(){
        String s = "Fuad";
        String s1 = "fuad";
        if(s.equals(s1)){
            out.println("s == s1");
        }
        else{
            out.println("s != s1");
        }
    }
    
    static void checkIndex(String s){
        int index = s.indexOf("W");
        out.println(index);
        out.println(s.indexOf("With"));
    }
    
    static void checkChar(String s){
        char ch = s.charAt(3);
        out.println(ch);
    }
    
    public static void main(String[] args){
        String s = "Code With Redoy";
        
        checkIndex(s);
        makeUpper();
        iterate();
        convert();
        compare();
        concate();
        checkChar(s);
    }
}
