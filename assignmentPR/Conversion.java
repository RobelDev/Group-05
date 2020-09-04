
public class Conversion
{
    int characteristic;
    int numerator;
    int denominator;  
    
    String number = "123.456";

     
    public void conversion() {
    //if the conversion from C string to integers can take place
    if(characteristic(number, characteristic) && mantissa(number, numerator, denominator))
    {
        //do some math with c, n, and d
    }
    else
    {
        //handle the error on input
    }
    
   
    }
    
    
    
    /* description here*/
    public boolean characteristic(char numString[], int charateristic)
    {
        
    return true;
    }

    /*description here */
    public boolean mantissa(char numString[], int numerator, int denominator)
    {
        
    return true;
    }
}
