public class Solution {
    public int firstMissingPositive(int[] A) {
        /*
        //Method 1: sort the array first
        //move the pointer to the first positive integer
        //Do remember put a array length limition in the while loop condition
        //Then set a res beginning as 0, check if the current integer minus the former intger is equal to 1
        //If not, return res+1.
        //Watch the corner case, when there are two equal elements there
        Arrays.sort(A);
        int i = 0;
        int res = 0;
        while(i < A.length && A[i] <= 0) i++;
        for (;i<A.length;i++){
            //if there are integers equal to each other, like[0,1,1,1,3]
            if(i>0 && A[i] == A[i-1]) continue;
            if(A[i] - res !=1) return res+1;
            else res = A[i];
        }
    return res+1;
    */
        
        //Method 2:Put the element to its corresponding position
        //扫描数组两遍，第一遍 附属物是，扫描到的正数 且 小于A.length 就放到对应的位置上，e.g 1 放到num[0], 2放num[1]
        //换好后 从1扫描数组，第一个下标加一 不等于 值的就是 first missing possible
        //如果都match 上，如1 2 3 4 5，返回A.length+1
        //为什么1 不放到num[1]上，如果A={0},那么返回长度等于2，但应该返回的是1
        
        if(A.length == 0 || A == null) return 1;
        for (int i = 0;i< A.length;i++){
            //Ignore all the negative integers and 0
            //A[i] is smaller than A.length,过大没有地方换
            //A[i]不等于i+1就换
            while(A[i]>0 && A[i]<A.length && A[i] != (i+1)){
                int temp = A[A[i]-1]; //设置的temp是要换到位置的老元素
                if(temp == A[i]){
                    //这么换要小心，比如A[1]是3，A[2]也是3，A[1] 和 A[2]就会一直换，陷入死循环
                    break;
                }
                
                A[A[i]-1] = A[i];
                A[i] = temp;
                
            } //while loop
        } //for loop
        
        //Scan the array second time, find the first integer not equal to position + 1
        for (int i = 0;i < A.length; i++){
            if(A[i] != (i+1)){
                return i+1;
            }//if
        }//for loop
        
        return A.length + 1;
    }
}