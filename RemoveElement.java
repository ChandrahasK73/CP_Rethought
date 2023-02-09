import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k =0;
        List<Integer> list = new LinkedList<Integer>();
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==val) continue;
            list.add(nums[i]);
        }
        Iterator ltr = list.iterator();
        int i=0;
        while(ltr.hasNext()){
            nums[i++] = (int)ltr.next();
        }
        return list.size();
    }
} 
    

