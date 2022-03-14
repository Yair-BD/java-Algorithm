public class DoItYourSelf {
    /**
     * 
     * @param length
     * @param k
     * @param num
     * @return
    */
    public static int run(int[] length, int k, int num){
        return run(length, k, num, 0);
    }
    private static int run(int[] length, int k, int num, int index){
        if( k == 0 && num >= 0) return 1 ;  
        if( num == 0 || k < 0 || index == length.length) return 0;
        int take = run(length, k - length[index], num -1, index );
        int notTake = run(length, k , num, index+=1);
        
        return take + notTake; // take and not
    }
public static void main(String[] args) {
    System.out.println(run(new int[]{2, 5, 10, 20, 50}, 40, 4));
}}
