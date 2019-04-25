
public class StringCapitaliser {
	
	public static void main(String[] args) {
		
		String input = "this is the input string";
		String output = "";
		
		String[] inputArray = input.split(" ");
		
		for (String s: inputArray) {
			output = output + s.substring(0,1).toUpperCase() + s.substring(1) + " ";
		}
		
		System.out.println(output);
		
	}

}
