class Array{
    public static void main (String[]args){
        int [] Array={45,5,4,66,11,22,28,78,99,54};
        int max = Array[0];
        int min =Array[0];
        for(int i = 1; i<Array.length; i++)
        {
            if(max<Array[i])
            {
                max=Array[i];
            }
           
            if(min>Array[i])
            {
                min=Array[i];
            }
               
        }
         System.out.println(max);
         System.out.println(min);
    }
}