import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SubClass extends Demo implements Comparator {

	public static void replaceSpecialCharFromAString() {
		String str1 = "hello#$%^world";
		String replacement = str1.replaceAll("[^a-zA-Z]", "");
		System.out.println(replacement + " from overridden method");
	}

	public static void reverseAStringUsingStringBuffer() {
		str1 = "hello world";
		StringBuffer sb = new StringBuffer(str1);
		StringBuffer reverse = sb.reverse();
		System.out.println("from overridden method======reverse is " + reverse);
	}

	public int compare(Object o1, Object o2) {
		Map.Entry obj1 = (Map.Entry) o1;
		Map.Entry obj2 = (Map.Entry) o2;
		Integer i1 = (Integer) obj1.getValue();
		Integer i2 = (Integer) obj2.getValue();

		return i2.compareTo(i1);
		// TypeCast (o1) to (Map.Entry) and get the value
		// return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry)
		// (o2)).getValue());
	}

	public static void printUserEnteredData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter data");
		// int num = scan.nextInt();
		System.out.println(scan.next());
	}

	public static void leapYear() {

		int year = 2010;
		int isCenturyYear = year % 100;
		if (isCenturyYear == 0) {
			if (year % 400 == 0) {
				System.out.println("leap");
			} else
				System.out.println("not leap");
		}
		else if (year % 4 == 0) {
			System.out.println("leap");
		} else
			System.out.println("not leap");
	}

	public static void chkAlphabet() {
		String str = "12";
		// str.matches("\\w");
		System.out.println(str.matches("\\w{1,}"));
	}

	public static void fibonacciSeries() {
		int num = 7;
		int series = 0;
		int temp = 0;
		int temp2 = 1;
		for(int i = 0;i<num;i++) {
			System.out.print(series);
			series = temp + temp2;
			temp = temp2;
			temp2 = series;
		}
	}
	
	public static void noOfDigits() {
		int num = 10;
		int counter = 0;
		while(num != 0) {
			num= num/10;
			counter++;
		}
		System.out.println(counter);
	}
	
	public static void charA2Z() {
		for(char c = 'A'; c<='Z';c++)
			System.out.print(c+" ");
	}
	
	public static void calculatePowerOfNumbers() {
		int base = 12;
		int exponent = 2;
		long result = 1;
		while(exponent !=0) {
			result = result*base;
			--exponent;
		}
		System.out.println(result);
		System.out.println("=========OR=======");
		System.out.println(Math.pow(base, exponent));
		System.out.println("Sqare root of base is  "+ Math.sqrt(base));
	}
	
	public static void anagramWord() {
		String word = "Mary";
		word.toLowerCase();//for case sensitive
		String anagram = "army";
		char[] charFromWord = word.toCharArray(); 
		char[] charFromAnagram = anagram.toCharArray(); 
		
		//This IF block is optional
		if(word.length() != anagram.length()){
			System.out.println("Not Anagram");
        }
		Arrays.sort(charFromWord); 
		Arrays.sort(charFromAnagram); 
		if(Arrays.equals(charFromWord, charFromAnagram)){
			System.out.println("anagram");
		}
		else
			System.out.println("Not Anagram");

	}

	public static void designVendingMachine() {
		
	}
//	public static void firstNonRepeatedCharOfString() {
//		HashMap<Character,Integer> scoreboard = new HashMap<Character, Integer>(); 
//		// build table [char -> count] 
//		for (int i = 0; i < word.length(); i++) { 
//			char c = word.charAt(i); 
//			if (scoreboard.containsKey(c)) { 
//				scoreboard.put(c, scoreboard.get(c) + 1);
//			} 
//			else
//			{ 
//				scoreboard.put(c, 1);
//			} 
//		}
//		for (Entry<Character,Integer> entry : counts.entrySet()) {
//			if (entry.getValue() == 1) { 
//				System.out.println(entry.getKey());
//			} 
//		}
//
//	}
}
