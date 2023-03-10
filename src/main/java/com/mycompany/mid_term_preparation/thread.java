package com.mycompany.mid_term_preparation;
import static java.lang.System.out;

public class thread extends Thread {
    public void run(){
        out.println("Thread started running...");
    }
    
    public static void main(String[] args){
        thread t = new thread();
        t.start();
    }
}
