import java.util.ArrayList;

class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // 1️⃣ add(element)
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("After add(): " + list);

        // 2️⃣ add(index, element)
        list.add(1, "Orange");
        System.out.println("After add(index, element): " + list);

        // 3️⃣ get(index)
        String item = list.get(2);
        System.out.println("Element at index 2: " + item);

        // 4️⃣ set(index, element)
        list.set(0, "Grapes");
        System.out.println("After set(): " + list);

        // 5️⃣ remove(index)
        list.remove(3);
        System.out.println("After remove(index): " + list);

        // 6️⃣ remove(object)
        list.remove("Orange");
        System.out.println("After remove(object): " + list);

        // 7️⃣ size()
        System.out.println("Size of list: " + list.size());

        // 8️⃣ contains(element)
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // 9️⃣ clear()
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
