package conditionalAndBooleanOperators;

public class ConditionalAndLogicalOperatorTest {

	public static void main(String[] args) {

		System.out.println("CONDITIONAL AND : ");
		System.out.printf("%s : %b  \n%s : %b  \n%s : %b  \n%s : %b  ",
				"false && false", (false && false),
				"false && true", (false && true),
				"true && false", (true && false),
				"true && true" , (true && true));

		System.out.println();
		System.out.println("CONDITIONAL OR : ");
		System.out.printf("%s : %b  \n%s : %b  \n%s : %b  \n%s : %b  ",
				"false || false", (false || false),
				"false || true", (false || true),
				"true || false", (true || false),
				"true || true" , (true || true));

		System.out.println();
		System.out.println("BOOLEAN AND : ");
		System.out.printf("%s : %b  \n%s : %b  \n%s : %b  \n%s : %b  ",
				"false & false", (false & false),
				"false & true", (false & true),
				"true & false", (true & false),
				"true & true" , (true & true));

		System.out.println();
		System.out.println("BOOLEAN OR : ");
		System.out.printf("%s : %b  \n%s : %b  \n%s : %b  \n%s : %b  ",
				"false | false", (false | false),
				"false | true", (false | true),
				"true | false", (true | false),
				"true | true" , (true | true));
		
		

		System.out.println();
		System.out.println("EXCLUSIVE OR : ");
		System.out.printf("%s : %b  \n%s : %b  \n%s : %b  \n%s : %b  ",
				"false ^ false", (false ^ false),
				"false ^ true", (false ^ true),
				"true ^ false", (true ^ false),
				"true ^ true" , (true ^ true));
		

		System.out.println();
		System.out.println("LOGICAL NOT : ");
		System.out.printf("\n%s : %b \n%s : %b", "!(true)", !(true) , "!(false)", !(false));
	}

}
