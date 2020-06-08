import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	static String str1;

//		str1 = "niveditabhushan28@wellsfargo.in";
//		System.out.println(str1.matches("^[a-zA-Z0-9.\\.]+(@[a-zA-Z]{1,}\\.[a-zA-Z]{2,})$"));
//		//System.out.println("abbc" + 10 + 20);
//		//System.out.println(10 + 20 + "abbc");
//		reverseAnInteger();

	public static void reverseAStringUsingForLoop() {
		str1 = "Hello";
		int len = str1.length();
		String reverse = "";
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + str1.charAt(i);
		}

		System.out.println("reverse is " + reverse);
	}

	public static void reverseAStringUsingStringBuffer() {
		str1 = "hello world";
		StringBuffer sb = new StringBuffer(str1);
		StringBuffer reverse = sb.reverse();
		System.out.println("reverse is " + reverse);
	}

	public static void replaceSpecialCharFromAString() {
		str1 = "hello#$%^world";
		String replacement = str1.replaceAll("[^a-zA-Z]", "");
		System.out.println(replacement);
	}

	public static void chechValidEmailID() {
		str1 = "hello#$%^world";
		// Pattern p = p.compile("[a-zA-Z0-9@]");
		// Matcher m = p.matcher(str1);
		// ^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"
		System.out.println(str1.matches("[a-zA-Z0-9.!#$%&'*]+"));

	}

	public static int reverseAnInteger(int num) {

		int temp = num;
		int reverse = 0;
		int r;
		while (num > 0) {
			r = num % 10;
			reverse = (reverse * 10) + r;
			num = num / 10;
		}
		return reverse;
	}

	public static void findDuplicateWords() {
		str1 = "apple banana apple orange banana apple";
		String[] str = str1.split(" ");
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		for (String st : str) {
			if (m.containsKey(st)) {
				m.put(st, m.get(st) + 1);
			} else {
				m.put(st, 1);
			}
		}
		System.out.println(m);
	}

	public static void chkIfStringContainsOnlyNumbers() {
		str1 = "12564568978";
		System.out.println(str1.matches("\\d{1,}"));

	}

	public static int factorialOfANumber(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--)
			fact = fact * i;
		return fact;
	}

	public static void armstrongNumber(int n) {

		int temp = n;
		int lastDigit;
		int cube = 0;
		while (n > 0) {
			lastDigit = n % 10;
			n = n / 10;
			cube = cube + (lastDigit * lastDigit * lastDigit);
		}
		if (temp == cube) {
			System.out.println(temp + " is an armstrong number");
		} else {
			System.out.println(temp + " is not an armstrong number");
		}
	}

	public static void palindromNumber(int num) {

		int temp = num;
		int reverse = 0;
		while (num > 0) {
			int r = num % 10;
			reverse = (reverse * 10) + r;
			num = num / 10;

		}
		if (temp == reverse)
			System.out.println("given number is palindrom");
		else
			System.out.println("given number is not palindrom");
	}

	public static boolean primeNumber(int num) {
		int remainder;
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num / 2; i++) {
			remainder = num % i;
			if (remainder == 0) {
				return false;
			}
		}
		return true;
	}

	public static void arrayOperation() {
		int[][] arr = { { 1, 4 }, { 3, 5, 4 } };
//
//		int numberOfRows = arr.length;
//		int numberOfCol = arr[0].length;
//		System.out.println(numberOfRows);
//		System.out.println(numberOfCol);
		for (int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				rowSum = rowSum + arr[i][j];
			}
			System.out.println("sum of" + i + " rows " + rowSum);
		}

		for (int i = 0; i < arr.length; i++) {
			int colSum = 0;
			// colSum = colSum + arr[i][j];
			for (int j = i; j < 3; j++) {

			}
			System.out.println("sum of" + i + " col " + colSum);
		}
	}

	public static void duplicateElementInArray() {
		char[] dup;
		String[] arr = { "apple", "orange", "banana", "apple" };
		HashSet<String> set = new HashSet<String>();
		for (String str : arr) {
			if (set.add(str) == false) {
				System.out.println("duplicate element is " + str);
				dup = str.toCharArray();
				HashSet<Character> letterSet = new HashSet<Character>();
				for (Character letter : dup) {
					if (letterSet.add(letter) == false) {
						System.out.println("duplicate element is " + letter);
					}
				}
			}
		}

	}

	public static void test() {
		Set ts = new TreeSet();
		HashMap<Object, Object> sortedMap = new HashMap<Object, Object>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Pyton", 5);
		map.put("java", 6);
		map.put("C++", 3);
		map.put("Ruby", 4);
		Set s = map.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry m = (Map.Entry) itr.next();
			System.out.println(m.getKey() + " " + m.getValue());
			ts.add(m.getValue());
			Iterator itrTs = ts.iterator();
			while (itrTs.hasNext()) {
				itrTs.next();
				sortedMap.put(m.getKey(), m.getValue());
			}
		}
		System.out.println(ts);
		System.out.println(sortedMap);
	}

	public static void collectionMethods() {
		ArrayList al = new ArrayList();
		al.add("Nivedita");
		al.add("Gaurav");
		al.add("Atharv");
		al.add("Shilpi");
		al.add("Simran");
		al.add("Nivedita");
		System.out.println(al);
		Collections.sort(al);// returns boolean
		System.out.println(al);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.reverse(al);//returns boolean
		Iterator itrt = al.iterator();
		while (itrt.hasNext()) {
			System.out.println(itrt.next());
		}
		System.out.println(al);
		al.add(0, "shi");//adding element at perticular index
		//al.remove(0);//removing element at perticular index

		// Converting HashSet to Array using toArray() method
		String[] arr = new String[al.size()];
		al.toArray(arr);
		//Object[] arr = al.toArray();// listToArray
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		if (al.contains("shilpi")) {// ifElementExistsInCollection
			System.out.println("Present");
		} else {
			System.out.println("not present");
		}
		System.out.println(al.isEmpty());
	}

	public static void arraysMethods() {
		String[] arr = { "apple", "banana", "apple", "orange", "banana", "apple" };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// Method 1: To Print Array
		System.out.println(Arrays.toString(arr));
		// Method 2
		Arrays.asList(arr);// convert array to list
		System.out.println(Arrays.asList(arr));
		// Method 3: Check if an array contains a certain value
		Arrays.asList(arr).contains("apple");
		// Concatenate two arrays
		// ArrayUtils.addAll(arr, arr);
		
	}
  
	public static void sortHashMap() {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Pyton", 5);
		hm.put("java", 6);
		hm.put("C++", 6);
		hm.put("Ruby", 4);
		System.out.println("before sorting by Keys" + hm);
		TreeMap tm = new TreeMap(hm);
		System.out.println("After sorting by Keys" + tm);
		System.out.println("==========Sort By Values==========");

		// List list =
		List list = new LinkedList(hm.entrySet());
		//System.out.println(list);
		Collections.sort(list, new SubClass());
		LinkedHashMap sortedMap = new LinkedHashMap();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println(sortedMap);
	}

}
