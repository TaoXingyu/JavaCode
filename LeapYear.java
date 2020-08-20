package JavaCodePractice;

public class LeapYear {
	public static void main(String[] args) {

		//boolean check
        int year = 2000;
        boolean b1 = year%4==0;
        boolean b2 = year%100!=0;
        boolean b3 = year%400==0;
        if(b1&&b2||b3){
        	System.out.println("leapYear");
        	}
        else{
        	System.out.println("not leapYear");
        	}
		
	    //if statement check
        int year2=2018;
        if(year2 % 4 == 0 && year2 % 100 != 0 || year2 % 400 == 0){
        	System.out.println("leapYear");
        	}
        else{
        	System.out.println("not leapYear");
        	}

		}

}
