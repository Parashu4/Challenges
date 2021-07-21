package Challenge;

public class Time {
	public static String getDurationString(int minute,int Second) {
		int Hour=0;
		if(minute>=0 && Second>=0 && Second<=59) {
			Hour=minute/60;
			minute=minute%60;
			return "Hour :"+Hour+" "+"Minutes :"+minute+" "+" Seconds :"+Second;

			
		}else {
			return "Invalid Value " ;
		}

	}
	public static String getDurationString(int Seconds) {
		int Minutes=0;
		if(Seconds>=0) {
			Minutes=Seconds/60;
			Seconds=Seconds%60;
			return "Minutes:"+Minutes+" Seconds:"+Seconds;
		}else {
			return "Invalid";
		}
	}
	public static void main(String[] args) {
		System.out.println(getDurationString(200,59));
		System.out.println(getDurationString(200));
	}

}
