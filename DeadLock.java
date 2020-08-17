package JavaCodePractice;

public class DeadLock {
	public void method() { 
		synchronized (String.class) { 
			System.out.println("Aquired lock on String.class object"); 
			synchronized (Integer.class) { 
			System.out.println("Aquired lock on Integer.class object");
			}
		}
   }
}
