package Challenge;

public class Cat {
	public static boolean isCatPlaying(Boolean summer,int Temperature) {
		if(summer==true  && Temperature>=25 && Temperature<=45 ) {
			return true;
		}
		else if(summer==false && Temperature>=25 && Temperature<=35 ) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(isCatPlaying(false,25));
		
	}

}
