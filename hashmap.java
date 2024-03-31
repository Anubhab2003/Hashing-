import java.util.*;
public class hashmap{
    public static void main(String args[]){
        //Create
        HashMap<String,Integer>hm=new HashMap<>();
        //Insert
        hm.put("India",1000);
        hm.put("USA",750);
        hm.put("Australia",500);
        System.out.println(hm);
        //get
        int India_Population=hm.get("India");
        System.out.println(India_Population);
        System.out.println(hm.containsKey("Nepal"));
        System.out.println(hm.remove("USA"));
        System.out.println(hm);
        System.out.println(hm.size());

    }
}