package SortingAndSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Solution02 {
	public static ArrayList<String> groupAnagrams(String[] strs) {
		ArrayList<String> res = new ArrayList<String>();
        
        if(strs==null||strs.length==0){
            ArrayList<String> s = new ArrayList<String>();
            s.add("");
            return s;
        }
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();  
        //Initialize the map
        for(int i = 0; i < strs.length; i++){
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String str = new String(charArr);
            if(map.containsKey(str)){
                map.get(str).add(strs[i]);
            }else{
                ArrayList<String> tmp = new ArrayList<String>();
                tmp.add(strs[i]);
                map.put(str,tmp);
            }
        }
        
        //Add the values in the map to the res;
        Iterator iter = map.values().iterator();  
        while(iter.hasNext()){
            ArrayList<String> item = (ArrayList<String>) iter.next();
            for(int i = 0; i <item.size(); i++){
            	res.add(item.get(i));
            }            
        }
        
        return res;
    }
	
	public static void main(String[] args){
		String[] test= {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(test));
	}
}
