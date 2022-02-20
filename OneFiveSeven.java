public class OneFiveSeven {
    /**The function get a number check the minimum sum of number 1/5/7
     * @param num
     * @return The minimum sum of number 1/5/7
     */
    public static int oneFiveSeven(int num){
        return oneFiveSeven(num, 0);
    }
    private static int oneFiveSeven(int num,int sum){
        if(num==0)
            return sum;
        if(num < 0)
            return Integer.MAX_VALUE;
        int five = oneFiveSeven(num - 5, sum + 1);
        int one = oneFiveSeven(num - 1, sum + 1);
        int seven = oneFiveSeven(num - 7, sum + 1);

        return Math.min(Math.min(five, one), seven);
    }

    public static void main(String[] args) {
        System.out.println(oneFiveSeven(7));
    }
}