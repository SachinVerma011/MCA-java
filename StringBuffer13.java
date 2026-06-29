//Stringbuffer method like append(), ,reverse ,insert , delete,replace method
class StringBuffer13{
    public static void main (String[]args){

         StringBuffer name = new StringBuffer("Bisanjeet Mahapatra");

        System.out.println(name.append(" MCA "));
        
        System.out.println(name.insert(20,"Student of "));
        System.out.println(name.replace(0, 9, "Mr. Bisu"));
        System.out.println(name.delete(20,25));

        System.out.println(name.reverse());
       
    }
}