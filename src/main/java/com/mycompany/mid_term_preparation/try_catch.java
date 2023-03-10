package com.mycompany.mid_term_preparation;
import static java.lang.System.out;

public class try_catch {
    static void sum(){
        try{
            int res = 10 / 0;
            out.println(res);
        }
        catch(Exception e){
            out.println(e);
        }
        try{
            int[] numbers = {1,2,3,4,5,6};
            out.println(numbers[6]);
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            out.println("Invalid index: " + e);
        }
        catch(Exception e){
            out.println(e);
        }
    }
    
    public static void main(String[] args){
        sum();
    }
}
