import java.util.*;
class Main {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
         //List<Integer> l = new LinkedList<Integer>();
         if(nums.length==1) return false;
         for(int i=1; i<nums.length; i++){
            if( nums[i]==nums[i-1]){
                 return true;
             }
             else
                 continue;
         }
        return false;
    }

    public static void main(String args[]){
        int[] a= {1,2,3,1};
        Main m = new Main();
        System.out.println(m.containsDuplicate(a));
    }
}
