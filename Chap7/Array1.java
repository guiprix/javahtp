import java.util.Arrays;

public class Array1{

//ex.7.8
public static void main(String[] args){
/*array f [];
//f[6];

int [] g = new int[5];

Arrays.fill(g,7);

for(int value: g){
System.out.printf("valore di array g is : %d%n", value);

	}


//--------------------------

float[] c = new float[100];
Arrays.fill(c, 5.0f);
float total=0.0f;

//for(int)

/*
for(int i =0;i<c.length;i++){

	total +=c[i];

	}



	for(float i : c){

		total +=i; //error conversion loss why??




	}

System.out.printf("Total: %f%n", total);
*/
//-----------------------


float[] a = new float[11];
Arrays.fill(a, 5f);

float[] b = new float[34];
Arrays.fill(b, 8f);

System.arraycopy(a,0,b,0,a.length);


//displayArray(a, "array a");
displayArray(b, "array b");
getMin(b);
getMax(b);

}//end of main

public static void displayArray(float[] array, String note){

	for(float i : array){

		System.out.printf(" %s : %f%n ", note, i);
	}


}



public static void getMin(float [] array){
	float min = array[0];

	for(float i : array){

		if(i < min){
			min=1;
		}

		
	}
System.out.printf("the min is : %f%n", min);
	

}//end getMin()

public static void getMax(float[] array){

	float max = array[0];

	for(float value : array){

		if(value> max){
			max = value;
		}
		
	}
	System.out.printf("max value is : %f%n", max);	
}//end max
















}//end class