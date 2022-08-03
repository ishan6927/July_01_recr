import javax.naming.spi.DirStateFactory.Result;

class avg_arr {
    public static void main(String[] args){
        int [] arr = {45, 46, 47, 48, 49, 50, 51};
        int result=0, Avg=0, max=0;
                for(int i=1; i<=arr.length-1; i++)
        {
        
           Avg  = Avg + arr[i];
           int num = arr.length;
           result = Avg/num;
            if (max < arr[i]){
                max = arr[i];
            }
           
           
        }
        System.out.println("ishan"+ result+"maximum"+max);

    }    
}
