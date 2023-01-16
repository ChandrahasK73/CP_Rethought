import java.util.TreeMap;
class SortPeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n= names.length;
        TreeMap<Integer,String> map = new TreeMap<Integer,String>();
        for(int i=0;i<n;i++){
            map.put(heights[i], names[i]);
        }int h= n-1;
        for(Integer j: map.keySet()){
            names[h--]=map.get(j);
        }
        return names;
    }
    public static void main(String args[])
    {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        names = sortPeople(names, heights);
        for(int i=0;i<names.length;i++)
            System.out.println(names[i]);
    }
}
