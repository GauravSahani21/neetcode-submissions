class Solution {
    public String longestCommonPrefix(String[] strs) {
        String sb = strs[0];

        for(int i=1; i<strs.length; i++){
            while(!strs[i].startsWith(sb)){
                sb = sb.substring(0, sb.length()-1);
            }
        }
        return sb;
    }
}