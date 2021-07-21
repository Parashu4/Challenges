package Challenge;

public class Area {
	
	public static double area(Double radius) {
		double areaOfCircle=0;
		final double pi=3.14;
		if(radius>=0.0) {
			areaOfCircle=(radius*radius)*pi;
			return areaOfCircle;
		}else {
			return -1.0;
		}

		
	}
	public static double area(double x,double y) {
		double areaOfRectangle=0;
		if(x>=0.0 && y>=0.0) {
			areaOfRectangle=x*y;
			return areaOfRectangle ;
		}else {
			return -1.0;
			
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println(area(2.3));
		System.out.println(area(2.5,4.5));
		
	}

}
