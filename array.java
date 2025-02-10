public class array {
     public static void main(String[] args)   
        {
            // int arr[] ={ 1,2,3,4};
          // System.out.println(arr[2]);
        
        
        //   int arr[] = new int[4];
        //   arr[0]=53;
        //   arr[1]=213;
        //   arr[2]=323;
        //   arr[3]=32;
        //   System.out.println(arr[0]);
        //   System.out.println(arr[1]);
        //   System.out.println(arr[2]);
        
        // for(int i=0;i<4;i++){
            //   System.out.println(arr[i]);

        // }

        // multi-dimensional array
        
        int arr[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {   
                arr[i][j]=(int)(Math.random()*10);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }




    }
    }
