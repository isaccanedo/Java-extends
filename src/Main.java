
public class Main {
	
	/*
	 * What is the result of this code?
	 * Qual � o resultado deste c�digo?
	 * 
	 * 1 - It will not compile because of line 7
	 * 2 - It will not compile because of line 11
	 * 3 - Hello!Hello!
	 * 4 - Hello!World" ==> correct
	 * 
	 * 
	 * 
	 */
	
	Object message() {
		return "Hello!";
	}

	public static void main(String[] args) {		
		
		System.out.println(new Main().message() + " " + new Main2().message());	

	}
}
	
	class Main2 extends Main  {
		
		String message() {
			return "World!";
		}
	}


