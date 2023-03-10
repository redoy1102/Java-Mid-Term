package com.mycompany.mid_term_preparation;
import static java.lang.System.out;

public class finallyBlock {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        try{
            out.println(nums[5]);
        }
        finally{
            out.println("Database connecting...");
        }
    }
}
