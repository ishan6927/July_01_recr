class fact{
    
    public static void main(String[] args) {
      System.out.println( "=" + facto(5));  
    }    


    static int facto(int num){
        if(num<=1){
            return 1;
        }
        System.out.print(num+"*");

        return num * facto(num-1);

    }
    } 