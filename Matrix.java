
public class Matrix {

	public static void main(String[] args) {
		int matrix1[][]={{1,2,3},{4,5,6},{7,8,9}};
		int matrix2[][]={{9,8,7},{6,5,4},{3,2,1}};
		int matrix3[][]=new int [3][3];
				int i,j;
		System.out.println("element of the matrix1 is : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.println(matrix1[i][j]+ "  ");
				System.out.println();
				
		}
			System.out.println("element of the matrix2 is : ");
		for(i=0;i<3;i++)
		{
				for(j=0;j<3;j++)
				System.out.println(matrix2[i][j]+ " ");
				System.out.println();
		}
		for(i=0;i<3;i++)
		{
			//addition two matrix.
			for(j=0;j<3;j++)
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
		}
		System.out.println("addition of the  matrix is :");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
		
			System.out.println(matrix3[i][j]+ " ");
		    System.out.println();
		}
	}

}
