package K2dz3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    Map<Integer,String> map = new HashMap<>();

    public void add(String lastName, int numberPhone){
        map.put(numberPhone,lastName);
    }

    public ArrayList get(String lastName){
        List<Integer> list = new ArrayList<>();
       for (Integer key : map.keySet()){
           if(map.get(key) == lastName){
             list.add(key);
           }
       }
       return (ArrayList) list;
    }

}
