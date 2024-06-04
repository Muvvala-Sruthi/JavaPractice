class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm =new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))==null){
                hm.put(s.charAt(i),1);
            }
            else{
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        boolean odd=false;
        for(Character key:hm.keySet()){
            if(hm.get(key)%2==0){
                count+=hm.get(key);
            }      
            else{
                 count+=hm.get(key);
                if(!odd)
               odd=true;
                else{
                    count-=1;
                }
            }      
        }
       
return count;
    }
}
        
