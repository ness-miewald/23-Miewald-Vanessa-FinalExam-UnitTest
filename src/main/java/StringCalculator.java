public class StringCalculator{
    //this is the stringcalculator file
    public static int add(final String numbers){
        String[] numbersArray = numbers.split(",|\n");
        int returnValue = 0;
        if(numbersArray.length<0){
            throw new RuntimeException("Negatives not allowed.");
        }
        else{
            for(String number: numbersArray){
                if(!number.trim().isEmpty()){
                   if(Integer.parseInt(number.trim())<0 || Integer.parseInt(number.trim())>1000);
                   throw new IndexOutOfBoundsException();
                }
                else{
                    returnValue += Integer.parseInt(numbers.trim());
                }
            }
            return returnValue;
        }
    }
}