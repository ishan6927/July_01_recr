class two_d_arr {
    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { {4, 5, 3}, {5, 6, 3} }; 
        int[][] ThirdMatrix = { {0, 0, 0}, {0, 0, 0} }; 
        int[][] sum = new int[rows][columns];  
        for(int i=0; i<=1; i++){011
            for(int j=0; j<=2;j++){
              ThirdMatrix [i][j] = firstMatrix[i][j]+secondMatrix[i][j];
            }
        }
        for(int i=0; i<=1; i++){
            for(int j=0; j<=2;j++){
              System.out.println(ThirdMatrix [i][j]);
            }
        }
    
    }
}
