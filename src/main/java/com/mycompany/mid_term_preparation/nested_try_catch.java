package com.mycompany.mid_term_preparation;
import static java.lang.System.out;

public class nested_try_catch {
    public static void main(String[] args){
        try
        {
            out.println(10/0);
            try
            {
                int[] numbers = {1,2,3,4,5,6};
                int index = 5;
                out.println(numbers[index]);
            }catch(ArrayIndexOutOfBoundsException e)
            {
                out.println(e);
            }
        }catch(Exception e)
        {
            out.print(e);
        }
    }
}
