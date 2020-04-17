public class matrixoperations 
{
    matrixoperations(int[][] a,int[][] b,int[][] c)
    {
     System.out.println("Addition of two matrices is");
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.print(a[i][j]+b[i][j]+" ");
           }
           System.out.println();
       }
        for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               for(int k=0;k<3;k++)
               {
             c[i][j]=c[i][j]+a[i][k]*b[k][j];
           }
               
           }
           
       }
         System.out.println("Muliplication of two matrices is");
            for( int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
     
              System.out.print(c[i][j]+" ");
           }
           System.out.println();
           
       }
    }
    public static void main(String[] args)
    {
       int[][] a={{1,3,4},{2,4,3},{3,4,5}};
        int[][] b={{1,3,4},{2,4,3},{1,2,4}};
       int [][] c = new int[a.length][b.length];
     matrixoperations m=new matrixoperations(a,b,c);
//as constructors while creating an object itself it will call its particular constructor depending upon the parameters list
    }
}
