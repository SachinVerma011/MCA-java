import java.util.LinkedList;
class CharLinkedlist{
    public static void main(String[]args){
        LinkedList<Character> list =new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        
         System.out.println(list);
         for(Character c : list){
            System.out.print(c+"--->");
         }
        System.out.print("null"); 
        
    }
}

///access method
//System.out.print(list.get(2));     output = B 
//System.out.print(list.getFirst());     output = A
//System.out.print(list.getpeek());     output = A
//System.out.print(list.getpeekFirst());     output = last element 


//searching method 
// System.out.print(list.contain('D'));     output = true
//System.out.print(list.indexOf('D'));     output = 4
//System.out.print(list.lastIndexOf('C'));     output = 
//System.out.print(list.size());     output = 4
//System.out.print(list.isEmpty());     output = flase


//sorting
//Collectin.sort(list);
//Collectin.shuffle(list)