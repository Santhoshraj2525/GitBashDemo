package AryaStark;

public class MultiDimensional {

	public static void main(String[] args) {
		int c[][][] = new int[4][4][4];
		int count =1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<4;k++) {
					c[i][j][k]=count++;
				}
			}
		}
		
		for(int i[][] : c) {
			for(int j[] : i) {
				for(int k:j) {
					System.out.print(k+ " ");
				}
			}System.out.println();
		}

	}

}
