import java.util.*;
public class Iteration{
    public static void main(String args[]){
        //Create
        HashMap<String,Integer>hm=new HashMap<>();
        //Insert
        hm.put("India",1000);
        hm.put("USA",750);
        hm.put("Australia",500);
        hm.put("Bangladesh",450);
        Set<String>key=hm.keySet();
        System.out.println(key);
        for(String k:key){
            System.out.println("key "+k+",value= "+hm.get(k));
        }
    }
}
