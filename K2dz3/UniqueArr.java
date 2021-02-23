package K2dz3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueArr {

    public void uniqueArr(String[] arr){
        Set<String> set = new HashSet<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length ; i++) {
           set.add(arr[i]);
        }
        for (String s: set) {
            System.out.println(s);
        }

        for (String s : arr){
             map.put(s,getCount(arr,s));
        }

        for (String key : map.keySet()){
            System.out.println(key + " встречается " + map.get(key));
        }

    }

    private int getCount(String[] arr, String s){
        int count =0;
        for(String i : arr)
            if(i == s) count++;
        return count;
    }


}
