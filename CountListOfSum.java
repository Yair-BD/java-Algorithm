
public class CountListOfSum { 
    /**
     * We get a nuber and return the numbers 
     * of lists that the sum of numbers is the number we get .
     */
    public static int run(int number){
         return run(number, 1);
    } 
     private static int run(int number, int index){
        if(number == 0) return 1;
        if(index > number) return 0;
        int continueSubtract = run(number - index, index + 1);
        int justContinue = run(number , index + 1);
        return justContinue + continueSubtract ;
    }   // Becuse the list is always up we need to continue every eteration
    

    public static void main(String[] args) {
        System.out.println(run(200));
    }
 }