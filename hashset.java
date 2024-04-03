import java.util.*;
public class hashset{
    public static void main(String args[]){
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        System.out.println(set);
        if(set.contains(69)){
            System.out.println("Set Contain");
        }
        set.remove(3);
        System.out.println(set);
    }
}