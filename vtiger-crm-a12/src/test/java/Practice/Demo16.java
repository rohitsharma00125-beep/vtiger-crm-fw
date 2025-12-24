package Practice;


public class Demo16
{
	

	

	    // Method declaring more than one exception
	    static void check(String text, int number) throws ArithmeticException, NullPointerException {
	        
	        // ArithmeticException
	        int result = 10 / number;

	        // NullPointerException
	      
	        System.out.println(text.length());
	    }

	    public static void main(String[] args) {

	        try {
	            check(null, 0);
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception occurred: " + e);
	        }
	        catch (NullPointerException e) {
	            System.out.println("Null Pointer Exception occurred: " + e);
	        }

	        System.out.println("Program continues...");
	    }
	}

