package Arrays;

public class Array3Dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][][] a=new int[2][3][4];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				
				for(int k=0;k<a[i][j].length;k++)
				{
					a[i][j][k]=(int)(Math.random()*1000);
					
					System.out.print(a[i][j][k]+"  ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
