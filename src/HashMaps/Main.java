package HashMaps;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap <>();

        map.put("Lang", "Java");
        map.put("Country", "USA");
        map.put("Company", "Oracle");
        map.put("Year", "1996");

        //contains key method.
        if (map.containsKey("Year")){
            System.out.println("The year is " + map.get("Year"));
        }

        //key set
        Set<String> set = map.keySet();
        System.out.println("All the keys " + set);

        //values method.
        Collection<String> col = map.values();
        System.out.println("All the values " + col );

        //.entry set returns all the keys with their values.
        Set<Map.Entry<String, String>> mapping = map.entrySet();
        System.out.println("Set of keys and values using entrySet " + mapping);
        System.out.println();

        //Default values in case if there are no such keys.
        System.out.println("Using  .getorDefault: " + map.getOrDefault("RandomKey", "I will get that job!"));

        //replace method for replacing keys.
        map.replace("Lang", "C#");
        System.out.println("Let's see how replace works " + mapping);
        System.out.println();

        //put if absent
        map.putIfAbsent("Job", "Blueberry Consulting");
        System.out.println("New key and value " + mapping);

        //Creating an iterator
        System.out.println("use iterator to remove the sets");
        Iterator<Map.Entry<String, String>> map_iterator = map.entrySet().iterator();
        while (map_iterator.hasNext()){
            Map.Entry<String, String> entry = map_iterator.next();
            map_iterator.remove();
            System.out.println("Set of keys and values " + mapping);
        }

        
    }

}
