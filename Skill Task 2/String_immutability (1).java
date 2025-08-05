package practicaltask2;

public class String_immutability {

		    public static void main(String[] args) {
		        String s1 = "Forecast";

		       
		        s1.concat(" AI");

		       
		        System.out.println("After concat (without reassignment): " + s1);

		 
		        s1 = s1.concat(" AI");
		        System.out.println("After concat (with reassignment): " + s1);
		    }
		}


