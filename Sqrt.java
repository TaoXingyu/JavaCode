package JavaCodePractice;

public class Sqrt {
	public static double sqrt(double c){
		  if(c<0) return Double.NaN;
		  double err = 1e-15;
		  double t = c ;
		  while (Math.abs(t - c / t) > err * t){
		    t = (c/t + t) / 2.0;
		  }
		  return t;
		}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print(sqrt(81.0));

	}

}
