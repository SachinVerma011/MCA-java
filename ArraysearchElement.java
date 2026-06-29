class ArraysearchElement {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int n=5;
        boolean ans=false;
       for(int i=0; i<arr.length; i++){
          if( n==arr[i]){
              ans=true;
              break;
          }
       }
        if(ans){  
            System.out.println("yes");
           }
           else{
               System.out.println("no");
           }
    }
}