package _01_TestMatchingBrackets;

import java.util.Stack;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
	public static boolean doBracketsMatch(String b) {
    	Stack<String> b1 = new Stack<String>();
    	for (int i = 0; i < b.length(); i++) {
    		System.out.println(b.length());
    		String b2 = b.substring(i,i+1);
			if(b2.equals("{")) {
				b1.push("{");
			}else if(b2.equals("}")) {
				if (b1.isEmpty()){
					return false;
				}
				b1.pop();
				}
				
				}
		if(b1.isEmpty()) {
			return true;
		}
    	System.out.println(b1);
		return false;
		
		
		
			
		
    	
		
    	
    	
    	
    	
    	
        
    }
}