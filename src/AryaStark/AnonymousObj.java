package AryaStark;

public class AnonymousObj {

	public static void main(String[] args) {
		//AnonymousDemo TD = new AnonymousDemo(25);   This is reference Object which is creating a memory in stack and heap
			new AnonymousDemo(2525).show(); // This is anonymous object which will not create any stack memory. It is using only heap memory.

		}

	}
	class AnonymousDemo{
		private int R;
		public AnonymousDemo(int R) {
			this.R=R; //THe This keyword seperates the instance variable from Local Variable
		}
		public void show() {
			System.out.println("The value of R is : " +R);
		}

	}

