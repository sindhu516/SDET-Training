package JavaActivity2_4;

public class Activity2_4 {
	
	static void exceptionTest(String str) throws CustomException {
		if (str == null) {
			throw new CustomException("String value is null");
		}
		else {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		try {
			Activity2_4.exceptionTest("This will be printed.");
			Activity2_4.exceptionTest(null);
			Activity2_4.exceptionTest("Won't execute");
		}
		catch(CustomException exp) {
			System.out.println("Custom Error: " + exp.getMessage());
		}
	}

}