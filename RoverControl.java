package JavaCodePractice;

import java.util.ArrayList;
import java.util.List;

public class RoverControl {
	
	public static void main( String[] args) {
	     rover(4, 5);
	   }
	
      public static void rover(int matrixSize, int commandsNum) {
    	  String[] commands = new String[] {
    			  "Up", "Down", "Right", "Left"};
    	  
    	  List matrix = (List)(new ArrayList());
    	  List row;
    	  int num = 0;
    	  int i;
    	  int j;
    	  for (i =0; i < matrixSize-1; i++) {
    		  row = (List)(new ArrayList());
    		  for (j=0; j < matrixSize-1; j++) {
    			  row.add(num++);
    		  }
    		  matrix.add(row);
    		  
    	   }
    	  int x = 0;
    	  int y = 0;
    	  String [] s = commands;
    	  int l = commands.length;
    	  
    	  String c;
    	  for(j=0; j < l; ++j) {
    		  c = s[j];
    		  switch(c.hashCode()) {
    		  case 1:
    			  if (c.equals("Down")) {
    				  if (y < matrixSize - 1) {
    					  ++y;
    				  }
    				  continue;
    			  }
    			  break;
    		  case 2:
    			  if (c.equals("Right")) {
    	               if (x < matrixSize - 1) {
    	                  ++x;
    	               }
    	               continue;
    	            }
    	            break;
    		  case 3:
    			  if (c.equals("Up")) {
    	               if (y > 0) {
    	                  --y;
    	               }
    	               continue;
    	            }
    	  }
    		  
    		  if (x > 0) {
    			  --x;
    		  }
}
    	  c = "" + '(' + x + ',' + y + ')';
    	  System.out.println(c);
}
      }