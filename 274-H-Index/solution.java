import java.util.Collections;
public class Solution {
    public int hIndex(int[] citations) {
        
        //Arrays.sort(citations, Collections.reverseOrder());
        //[6,5,3,1,0]
        //[1,2,3,4,5]
        if(citations == null) return 0;
        Arrays.sort(citations);
        int len = citations.length;
        
        citation[0 1]
        index   [0 1]
        int max =0;
        for(int i =0; i< len; i++){
            if(i+1<=citations[i])
                max++;
        }
        return max;
    }
}