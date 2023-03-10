package com.mycompany.mid_term_preparation;
import static java.lang.System.out;

class father{
    void car(){
        out.println("I am from father class.");
    }
}
    
class son extends father{
    @Override
    void car(){
        out.println("I am from son class");
    }
}

public class binding {
    public static void main(String[] args){
        father f = new father();
        son s = new son();
        
        f.car();
        s.car();
    }
}

