public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //建立一个新数组result[]来存返回结果
        //用Hashptable， key来存数组内容，value来存index
        //检验 target-result[i] 是否是Hashtable的key，不是就存进去，是就返回结果
        //返回的index是从1开始的
        
        int[] result = new int[2];
        if(numbers == null || numbers. length < 2)
        return null;
        
        //Create a hashtable
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0;i < numbers.length; i++){
            if(map.containsKey(target - numbers[i])){
                result[1] = i+1;
                result[0] = map.get(target - numbers[i]) + 1;
                return result;
            }
            else{
                map.put(numbers[i], i);
            }
            
        //for loop
        }
        
        return null;
        
    }
}