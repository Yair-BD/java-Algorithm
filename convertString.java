public class convertString {
    public static int convert(String str1, String str2){
        return convert(str1, str2, 0);
    }
    private static int convert(String str1,String str2, int sum){
        if(0 == str1.length() || 0 == str2.length()) 
            return sum + Math.abs(str2.length() - str1.length() );
        if(str1.charAt(0)!=str2.charAt(0))
            return Math.min(convert(str1.substring(1), str2, sum + 1), convert(str1, str2.substring(1), sum + 1));
        return  convert(str1.substring(1), str2.substring(1), sum );


    }
    
}
