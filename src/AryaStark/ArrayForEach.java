package AryaStark;

public class ArrayForEach {

	public static void main(String[] args) {
		int a[][] = {{0,1,2},{2,1,4},{2,2,2}};
		for(int i[] : a) {
			for (int j:i) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
