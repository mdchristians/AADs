package hw3p4;

public class Datatype {

	public static void main(String[] args) {

				/* Manipulates strings and numbers using
				 * order of operations and parenthesis
				 */
				System.out.println(2 + "bc");									//prints 2bc 
				System.out.println(2 + 3 + "bc");								//prints 5bc because of order of operations
				System.out.println((2+3) + "bc");								//prints 5bc because of parenthesis
				System.out.println("bc" + (2+3));								//prints bc5 because of parenthesis
				System.out.println("bc" + 2 + 3);								//prints bc23 because of concatenation 
				
				System.out.println("-------------------------------");			//prints -------------------------------
				
				/* Manipulates characters with literal values 
				 * and ASCII values with mathematical operations
				 */
				System.out.println('b');										//prints b character
				System.out.println('b' + 'c');									//prints 197 (adds ASCII values of characters (98 and 99))
				System.out.println((char) ('a' + 4));							//prints e (ASCII value of 'a' = 97 => 97 + 4 = 101)
				
				System.out.println("-------------------------------");			//prints -------------------------------
				
				/* Manipulates int a with modulo and
				 * other mathematical operations
				 */
				int a = 2147483647;												//assigns a the value of 2147483647 (MAXIMUM int value possible (2^32))
				System.out.println(a);											//prints 2147483647
				System.out.println(a + 1);										//prints -2147483648 due to modulo (2147483647 + 1 => -2147483648)
				System.out.println(2 - a);										//prints -2147483645 (subtracts 2147483647 from 2)
				System.out.println(-2 - a);										//prints 2147483647 due to modulo (-2-2147483647 = -2147483649 => 214748367)
				System.out.println(2 * a);										//prints -2 (2 * 2147483647 = -4294967294 / 2147483647 => -2) 
				System.out.println(4 * a);										//prints -4 (4 * 2147483647 = -4294967294 / 2147483647 => -4)
				
				System.out.println("-------------------------------");			//prints -------------------------------
				
				/* Manipulates double p with type casting
				 * other mathematical operations
				 */
				double p = 3.14159;												//assigns p the value of 3.14159
				System.out.println(p);											//prints out 3.14159
				System.out.println(p + 1);										//prints out 4.14159
				System.out.println(8 / (int) p);								//prints 2 (p typecasted so it becomes 3, 8/3 = 2.66667 => truncated = 2)
				System.out.println(8 / p);										//prints 2.5464812403910124 (8 / 3.14159)
				System.out.println((int) (8 / p));								//prints 2 (2.546481240391012 typecasted and truncated to 2)

			}

	}

