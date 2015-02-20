public class Solution {
    public int removeDuplicates(int[] A) {
        //This problem is not that easy as it appears. 
        //Once an arry is created, we can't change its size.
        //In order to change array A, we have to create a new array.
        
        //Corner case
        if(A.length < 2) return A.length;
        
        //Create two variables to iterate the array
        int i = 1;
        int j = 0;
        while(i<A.length){
            //if A[i] == A[j], move i to next position
            if(A[i] == A[j]){
                i++;
            }
            //if A[i] != A[j], fist move j to next position, then copy A[i] to A[j]
            //Put all the unique elements in the head of the array.
            else{
                j++;
                A[j] = A[i];
                i++;
            }
        }
        
        //Copy all the front part of A to newly created array B
        int[] B = Arrays.copyOf(A,j+1);
        return B.length;
        
    }
}