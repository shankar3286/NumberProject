package devops.numbers;

public class NumberWords{
	
	public String pw(int n, String ch)
	{
		String one[]={" "," One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"," Ten"," Eleven"," Twelve"," Thirteen"," Fourteen"," Fifteen"," Sixteen"," Seventeen"," Eighteen"," Nineteen"};
		String ten[]={" "," "," Twenty"," Thirty"," Fourty"," Fifty"," Sixty"," Seventy"," Eighty"," Ninety"};
		String resStr="";
		if(n>19){
			resStr +=(ten[n/10]+one[n%10]);
			}
		
		else {
			resStr=(one[n]);
			System.out.print(one[n]);
		}
		if(n<100 && n>19){
			resStr+=ch;
			System.out.print(ch);
		}
		else if(n>0 && n<19){
			resStr=ch;
			System.out.print(ch);
		}
		else {
			resStr=ch;
			System.out.print(ch);
		}
		return resStr;
	}

	public String toWords(int number ) {
		if(number>99 && number<=999){
			 NumberWords b= new NumberWords();	
			 String result=" ";
			result =b.pw((number/100 )," Hunderd");
			result =b.pw((number%100)," ");
					
		return result.trim() ;	
			}
		
		else if(number>0 && number<100){
		NumberWords b = new NumberWords();
		String result=" ";
		result +=b.pw((number)," ");
		//System.out.print("");
		
		return result.trim() ;
		}
	 
		
		else if(number==0)
			return "";
		else if(number <0){
			return "Number out of range";
		}
		return "Number out of range";
	}

}
