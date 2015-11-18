
import java.util.Scanner;

public class Square{


public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a new side of a square between 1 and 20: ");
int side = input.nextInt();
if (side > 20 || side< 1){
	System.out.println(" Try again the values are incorrect: ");
	}else if(side==1){

		System.out.println("*");
	}else{

		for(int k =0; k<side;k++){
	    System.out.print("* ");
	    
	    //System.out.print("* ");
	    //System.out.println();
	    
	  }
	  System.out.println();
	  for(int s = 0; s<side-2;s++){
	    System.out.print("* ");
	  	  for(int j= 0;j< side-2;j++){ 
	  	    System.out.print("  "); 
	  	    }
  	   System.out.print("* ");
  	   System.out.println();
	  }
	  
	  for(int t = 0;t<side;t++){
	   System.out.print("* ");
	
	  }
	  System.out.println();
	  
	}//end of if


}



}