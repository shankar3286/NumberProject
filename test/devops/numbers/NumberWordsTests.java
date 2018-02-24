package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		final String words = numberWords.toWords ( -1 );
		Assert.assertEquals( "Error", "Number out of range", words ) ;
	}

}
