import java.util.HashMap;
 class Hashmap1{
    public static void main (String[]args){
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Banana",11);
        items.put("orange",12);
        items.put("cherry",13);
        items.put("Dates",14);
        System.out.println(items);
        System.out.println(items.get("Dates"));
        items.remove("Banana");
        System.out.println(items.containsKey("Banana"));
        System.out.println(items.containsValue(10));
       System.out.println(items.keySet());

       System.out.println(items.size());

       for (HashMap.Entry<String, Integer> entry : items.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
       ....}
        System.out.println(items);

        
    }
    
 }