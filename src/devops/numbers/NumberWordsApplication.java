package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class NumberWordsApplication {
	@SuppressWarnings("unused")
	private final NumberWords numberWords ;
	private final BufferedReader reader ;
	
	public NumberWordsApplication() {
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public void execute() {
		while( true ) {
			try {
				
				System.out.println("Enter number(0 to exit):") ;
				final String value = reader.readLine() ;
				final int number = Integer.parseInt( value) ;
			    if(number >0 && number <=999)
				{
					NumberWords numWords = new NumberWords();
					String resStr = numWords.toWords(number);
					System.out.print(resStr+"\n");
				}
				else if(number==0)
					break;
				else 
					System.out.println("Number out of range");
			
			} catch ( NumberFormatException | IOException e ) {
				System.out.println( "Number out of range" ) ;
			}
			
		}
	}

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
	}

}
