
import java.util.List;
import java.util.Arrays;
import java.util.*;


public class N1613{

	public static void main(String[]args){

/*
	Scanner input = new Scanner(System.in);
	
	int count = 1;
	while(count < 10){
		System.out.println("Enter a name: ");
		String name = nextLine();
*/
		System.out.println("qui");
		String[] names  = {"guido", "ciro","andrea" , "ciro", "giorgio","francesco", "marco", "giovanni","matteo",
									"giorgio","simone", "andrea"};

		List<String> list = Arrays.asList(names);
		System.out.printf("list:  %s\n", list);


		printNonduplicates(list);
		//System.out.println(list);

		
		

	}//end main

	private static void printNonduplicates(Collection<String> values){

			Set<String> setNames = new HashSet<>(values);
			
			System.out.printf("set values: %s", setNames);

			

		}



	}



