// LeetCode 2114 - Maximum Number Of Words Found In Sentences
// Solved on: 8 January 2026
// Approach: Count spaces in each sentence
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 1;
        for(int i=0; i<sentences.length; i++){
            int count = 1;
            for(int j=0; j<sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    count++;
                }
            }
            if(max<count){
            max = count;
            }
        }
        return max;
    }
}
