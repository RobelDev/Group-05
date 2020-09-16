public class Conversion
{
    
    // for final storage of characteristic after testing
    int characteristic;
    // for final storage of numerator after testing
    int numerator;
     // for final storage of denominator after testing
    int denominator; 
    
    // for interum storage after testing
    String characteristicString = "";
    String numeratorString = "";
    String denominatorString = "1";  
    
    String number = "123.456";
    /*At the bequest of of the commentors a char array is diffrent than a string in java.
     * However it is possible to cast a string to a char array
     */
    char[] number = {number.toCharArray()};

    
    
    /*Breaks the passed char array into the characteristic string
     * and mantissa stored as (numerator and denominator)
     */
   private void breakForConversion(char numString[]) 
    {
       
       //to iterate thru the char array
        int i = 0;
  
        // while not '.' concatenate the char to string characteristic
        while (numString[i] != '.') 
        {
          characteristicString = characteristicString + numString[i] ; 
          i++;
        }
        
        // while not '.' concatenate the char to string characteristic
        while (numString[i] < numString.length) 
        {
          numeratorString = numeratorString + numString[i] ; 
          i++;
        }
        
        // places after the decimal to get denominator
        int places = numeratorString.length(); 
        
        while(places !=0)
        {
            denominatorString = denominatorString + '0';
            
            places--;
        }
    }
   
    
   
    
    /* uses breakForConversion to break up a given char[] 
     * tests if the  String characteristic is correct format(able to cast as int)
     * stores String characteristic as int c and returns true if it is
     * Returns false if it is not
     */
    public boolean characteristic(char numString[], int charateristic)
    {
        breakForConversion(numString);
        int parsed = Integer.parseInt(characteristicString);
        if( parsed == charateristic)
        {
             characteristic = parsed;
            return true;
        }
        return false;
    }

    /* uses breakForConversion to break up a given char[] 
     * tests if the  String numerator is correct format(able to cast as int)
     * stores String numerator as int n  and String denominator as int d  
     * returns true if valid format
     * Returns false if it is not
     */
    public boolean mantissa(char numString[], int numerator, int denominator)
    {
        breakForConversion(numString);
        int parNum = Integer.parseInt(numeratorString);
        int parDen = Integer.parseInt(denominatorString);
        
        if(parNum == numerator && parDen == denominator)
        {
            numerator = parNum;
            denominator = parDen;
            return true;
        }
        return false;
    }
}
