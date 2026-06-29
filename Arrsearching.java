
class Demo 
{
    int method()
    {
        int [] arr={1,32,4,2,5,3,2,6,2,8};
        int n=2;
        int ans =-1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==n)
            {
                ans=i;
                break;
            }    
        }
         System.out.println("searching : "+ans);
         return 0;
    }
}

class Arrsearching {
    public static void main(String[] args) {
        Demo kb =new Demo();
        kb.method();
    }
}