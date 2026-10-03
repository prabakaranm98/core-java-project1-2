package javaclass;

public class string_method_day2 {

	public static void main(String[] args) {
		
		String str = "Hello Java World";
		
		String str2 = "hello java world";
		
		// 1. length()
		System.out.println("1. Length : " + str.length());
		
		// 2. charAt()
		System.out.println("2. charAt : " + str.charAt(1));
		
		// 3. toUpperCase()
		System.out.println("3. Uppercase : " + str.toUpperCase());
		
		// 4. toLowerCase()
		System.out.println("4. Lowercase : " + str.toLowerCase());
		
		// 5. equals()
		System.out.println("5. equals : " + str.equals(str2));
		
		// 6. equalsIgnoreCase()
		System.out.println("6. equalsIgnoreCase: " + str.equalsIgnoreCase(str2));
		
		// 7. contains()
		System.out.println("7. contains : " + str.contains("Java"));
		
		// 8. startsWith()
		System.out.println("8. startsWith : " + str.startsWith("Hello"));
		
		// 9. endsWith()
		System.out.println("9. endsWith : " + str.endsWith("World"));
		
		// 10. substring()
		System.out.println("10. substring : " + str.substring(6, 10));
		
		// 11. replace()
		System.out.println("11. replace : " + str.replace("Java", "Python"));
		
		// 12. trim()
		String name = "Prabakaran";
		
		System.out.println("12. trim : " + name.trim()); 
		
	}
		
		
	}


