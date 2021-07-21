package Challenge;

public class Equals {
	public static void printEqual(int a,int b,int c) {
		if(a==b && a==c && b==c) {
			System.out.println("All numbers are equal");
			
		}else if(a==b || a==c || b==c) {
			System.out.println("Niether All are equals or Different");
		}else {
			System.out.println("All numbers are Differnt");
		}
	}
	public static void main(String[] args) {
		printEqual(20,30,40);
	}

}
