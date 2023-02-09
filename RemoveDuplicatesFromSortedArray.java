import java.util.LinkedHashSet;
import java.util.Iterator;
class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for(int i=0;i<nums.length;i++) set.add(nums[i]);
        Iterator ltr = set.iterator();
        int i=0;
        while(ltr.hasNext()) nums[i++] = (int)ltr.next();
        return set.size();
    }
}