class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        ArrayList <Integer> result = new ArrayList<>();
        int[] pcount = new int[26];
        int[] window = new int[26];
        int left = 0;

        for(int i = 0;i<p.length();i++){
            pcount[p.charAt(i) - 'a']++;
        }

        for(int right = 0;right<s.length();right++){

            window[s.charAt(right)-'a']++;
            if(right - left + 1 > p.length()){
                window[s.charAt(left) - 'a']--;
                left++;
            }
            

            if(right - left + 1 == p.length()){
                if(Arrays.equals(pcount,window)){
                    result.add(left);
                }
            }
        }
        return result;
    }
}