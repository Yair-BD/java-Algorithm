public class Recursion {
    public static int howManyPath(int[][] list) {
        return howManyPath(list, 0, 0);
    }
    private static int howManyPath(int[][] list, int i, int j){
        if (list.length -1 == i && list[i].length -1 == j)
            return 1;           
        if (i < 0 || j < 0 ||list.length -1 > i || list[i].length -1 > j || list[i][j] <= 0)
            return 0;

        int temp = list[i][j];
        list[i][j] = -1; // Marking the number to void duplicates
        int count = howManyPath(list, i + temp, j) + howManyPath(list, i - temp, j) + 
                    howManyPath(list, i, j + temp) + howManyPath(list, i, j - temp) ;
        list[i][j] = temp;
        return count;
    }

    public static boolean isSubstring(String s1, String s2) {
        return isSubstring(s1, s2, false);
        
    }
    private static boolean isSubstring(String s1, String s2, boolean con) {
        if(0 == s1.length())
            return true;
        if(0 == s2.length())
            return false;
        if(s1.charAt(0) == s2.charAt(0))
            return true  && isSubstring(s1.substring(1), s2.substring(1) , true);
        if(s1.charAt(0) != s2.charAt(0) && con == false)
            return isSubstring(s1, s2.substring(1), false);
        return false;  
    }
    private static boolean iisSubstring(String s1, String s2, int index1, int index2, boolean con) {
        if(index1 >= s1.length())
            return true;
        if(index2 >= s2.length())
            return false;
        if(s1.charAt(index1) == s2.charAt(index2))
            return true  && iisSubstring(s1, s2, index1+1, index2+1 , true);
        if(s1.charAt(index1) != s2.charAt(index2) && con == false)
            return iisSubstring(s1, s2, index1, index2+1, false);
        return false;  
    }

    public static int minChanges(String s1, String s2){
        return check(s1, s2, 0);
    }
    private static int check(String s1, String s2, int count){
        if(s1.length() == 0)
            return s2.length() + count;
        else if( s2.length() == 0)
            return s1.length() + count;

        if (s1.charAt(0) != s2.charAt(0))
            return Math.min(check(s1, s2.substring(1) , 1+count), check(s1.substring(1), s2 , 1+ count));
        return check(s1.substring(1), s2.substring(1), count);

    }
    public static int kindOfSum(int[] s1, int k, int num){
        return culculate(s1, k, num, -1);
    }
    private static int culculate(int[] s1, int finalLenOfNeck, int timeOfUse, int index ){
        if ( finalLenOfNeck == 0 && timeOfUse >=0 )
            return 1;
        if ((timeOfUse <= 0 )|| (finalLenOfNeck < 0 )|| (s1.length == index))
            return 0 ;
        else
            return culculate(s1, finalLenOfNeck - s1[index+1], timeOfUse +1, index +1 ) +
                    culculate(s1 ,finalLenOfNeck - s1[index], timeOfUse +1, index);
    }

    public static boolean threePower(int num){
        return threePower(num, 0);
    }
    private static boolean threePower(int num, int pow){
        if(num < 0 || num < Math.pow(3, pow))// Bad if
            return false;
        if(num == 0)
            return true;
  
        return threePower(num - (int)Math.pow(3, pow), pow + 1) || threePower(num, pow +1);

    }

    public static void main(String[] args) {
    System.out.println(threePower(10));
    }
}

/**
 * יאיר יאיר
 * צעד הרקורסיה שאיתו אני ממשיך הלאה 
 * 
 */
