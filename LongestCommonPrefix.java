import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        boolean isNothingCommon = false;
        int n = strs.length;
        int min = Integer.MAX_VALUE;
        int minStringInd = 0;
        String commonString ="";
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min = strs[i].length();
                minStringInd = i;
            }
        }
        commonString += strs[minStringInd];
        System.out.println(minStringInd);
        System.out.println(commonString);
        if(commonString.length()==0) return "";
        for(int i=0;i<n;i++){
            if(i!= minStringInd){
                int sampleInd = 0;
                if(minStringInd == n-1) sampleInd = 0;
                else sampleInd = n-1;
                if(strs[i].length()==0 || 
                    strs[minStringInd].charAt(0)!= strs[sampleInd].charAt(0)){
                    isNothingCommon = true;
                    break;
                }
                int j=0;
                String dupCommonString = "";
                while(j<commonString.length()){
                    if(commonString.charAt(j)==strs[i].charAt(j)){
                        dupCommonString+=commonString.charAt(j);
                        j++;
                    }
                    else 
                        break;
                }
                commonString = dupCommonString;
                if(dupCommonString.length()==0){
                    isNothingCommon = true;
                    break;
                }
            }
            
        }
        System.out.println(min);
        System.out.println(isNothingCommon);
        if(isNothingCommon) commonString="";
        return commonString;
    }
}