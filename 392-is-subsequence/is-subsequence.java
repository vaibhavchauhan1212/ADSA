class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;   //because an empty string is always a SubSequence
        }

        //initialize both strings indexes
        int s_index=0;
        int t_index=0;

        //use while loop because it runs till the elements are present
        while(s_index < s.length() && t_index < t.length()){
            if(s.charAt(s_index) == t.charAt(t_index)){               //compare both strings, equal or not
                s_index++;                                          //if its true increment the s string
            }
            t_index++;                                              // it increments t string
        }
        return s_index ==s .length();
    }
}