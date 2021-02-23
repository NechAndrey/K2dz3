package K2dz3;

import java.util.List;

public class main {
    public static void main(String[] args) {
        StartApp();
    }

    public static void StartApp(){
        UniqueArr arr = new UniqueArr();
        String[] rr = new String[5];
        rr[0] = "car";
        rr[1] = "cat";
        rr[2] = "car";
        rr[3] = "sql";
        rr[4] = "cat";
        arr.uniqueArr(rr);


        Phonebook phonebook = new Phonebook();
        phonebook.add("Nechaev",911);
        phonebook.add("Kozlov",898);
        phonebook.add("Nechaev",777);
        List<Integer> list =  phonebook.get("Nechaev");
        for (int x : list){
            System.out.println(x);
        }
    }
}
