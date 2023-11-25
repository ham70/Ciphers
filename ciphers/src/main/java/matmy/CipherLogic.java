package matmy;

//this class contains logical methods 
public class CipherLogic
{
    
    public static String encrpyt(String message)
    {
        String output = "";
        String messNum = strToStrnum(message);
        
        for(int i = 0; i < messNum.length()/3; i++)
        {
            String character = messNum.substring(i*3, (i*3)+3);//we grab every 3 numbers to represent one char
            int charNum = Integer.parseInt(character);//converting string to int
            
            charNum++;//we add one to the ascii value as our encpyttion algorithm
            
            char c = (char)charNum;//converting int to char
            output = output + c;
        }
        
        return output;
    }
    
    public static String decrpyt(String message)
    {
        String output = "";
        
        String messNum = strToStrnum(message);
        
        for(int i = 0; i < messNum.length()/3; i++)
        {
            String character = messNum.substring(i*3, (i*3)+3);//we grab every 3 numbers to represent one char
            int charNum = Integer.parseInt(character);//converting string to int
            
            charNum--;//we subtract one from the ascii value as our decoding algorithm
            
            char c = (char)charNum;//converting int to char
            output = output + c;
        }
        
        return output;
    }
    
    public static String strToStrnum(String message)//this method changes the chars in a string to their ascii equals
    {
        String output = "";
        
        for(int i = 0; i < message.length(); i++)
        {
            int num = message.charAt(i);//getting each cahr
            String numstr = "" + num;// converting to int
            output = output + addZeros(numstr);
        }
        
        return output;
    }
    
    public static String strNumToStr(String nums)//this method will convert ascii number within a string to their char equals
    {
        String output = "";
        
        for(int i = 0; i < nums.length()/3; i++)
        {
            String character = nums.substring(i*3, (i*3)+3);//we grab every 3 numbers to represent one char
            int charNum = Integer.parseInt(character);//converting string to int
            char c = (char)charNum;//converting int to char
            output = output + c;
        }
        
        return output;
    }
    
    public static String addZeros(String num)//this method will ensure all the ascii numbers are in terms of 3 digits
    {
        String output = num;
        while(output.length() < 3)
        {
            output = "0" + output;
        }
        
        return output;
    }

}