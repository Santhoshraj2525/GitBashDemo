package AryaStark;

public class MultiplicationofArray {

	public static void main(String[] args) {
		int a[][] = {{0,1,2},{2,1,4},{2,2,2}};
		int b[][] = {{0,1},{2,3},{4,5}};
		int c[][] = new int[3][2];
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+ " ");
			}System.out.println();
		}
		

	}

}
