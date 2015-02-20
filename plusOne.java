public class Solution {
    public int[] plusOne(int[] digits) {
    
        if (digits == null) return digits;    
        int carry = 1;
        int i = digits.length - 1;
        while(i >= 0)
        {
            //Necessary to set a temp variable, we need both digits[i] and carry in the following two sentenses
            //If we change one first, it would affect the other one.
            int temp = (digits[i]+carry)%10; //9+1 = 10, 10%10 = 0  
            carry = (digits[i]+carry)/10;  
            digits[i] = temp;  
            i--;
        }
        //No overflow
        if(carry == 0){
            return digits; 
        }
        //Overflow
        else{
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            return newDigits;
        }
        
    }
}