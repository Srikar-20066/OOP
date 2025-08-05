package practicaltask2;

public class String_manipulation {
	    public static void main(String[] args) {
	        String original = "Smart Energy";

	        System.out.println("Original: " + original);

	        
	        System.out.println("Uppercase: " + original.toUpperCase());

	   
	        System.out.println("Lowercase: " + original.toLowerCase());


	        System.out.println("Replace 'Energy' with 'Assistant': " + original.replace("Energy", "Assistant"));

	     
	        System.out.println("Substring (0 to 5): " + original.substring(0, 5));

	        
	        System.out.println("Contains 'Smart'? " + original.contains("Smart"));

	     
	        String[] parts = original.split(" ");
	        System.out.println("Split words:");
	        for (String part : parts) {
	            System.out.println(part);
	        }
	    }
	}

