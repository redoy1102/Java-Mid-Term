package com.mycompany.mid_term_preparation;

public class Cat_implementing_interface implements animal {
    @Override
    public void eat(){
        System.out.println("I am eat");
    }
    
    @Override
    public void sleep(){
        System.out.println("I am sleep");
    }
    
    public static void main(String[] args) {
        Cat_implementing_interface obj = new Cat_implementing_interface();
        obj.eat();
        obj.sleep();
    }
}
