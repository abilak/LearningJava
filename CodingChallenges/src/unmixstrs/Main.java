package unmixstrs;

import java.util.Arrays;

public class Main {
	
	public static char[] unmix(String sentence) { 
		
		char[] sent_even = sentence.toCharArray();
		
		char last_char = sent_even[sent_even.length - 1];
		
		char[] sent_odd = Arrays.copyOfRange(sent_even, 0, sent_even.length-1);
		
		
		if(sent_even.length % 2 == 0) { 
			for(int x = 0; x < sent_even.length; x+=2) { 
				char curr_char = sent_even[x];
				char next_char = sent_even[x+1];
				
				sent_even[x] = next_char;
				sent_even[x+1] = curr_char;
			}
		}
		
		
		else { 
			for(int x = 0; x < sent_odd.length; x+=2) { 
				char curr_char = sent_odd[x];
				char next_char = sent_odd[x+1];
				
				sent_odd[x] = next_char;
				sent_odd[x+1] = curr_char;
			}
		}
		
		if(sentence.length() % 2 == 0) { 
			return sent_even;
		}
		
		else { 
			char[] new_char = new char[sent_odd.length + 1];
			for(int i = 0; i < sent_odd.length; i++) { 
				new_char[i] = sent_odd[i];
			}
			
			new_char[new_char.length-1] = last_char;
			return new_char;
		}
		
	}
	
	
	public static void main(String[] args) { 
		System.out.println(unmix("hTsii  s aimex dpus rtni.g"));
	}
}
