public class MaxEqualChar {//28
   /**
    * This totutial is about how to we can return max amount we keep all the way of our etaration
    * @param s A string
    * @return The max count of chars  that next to the other.
    */
    public static int run(String s){
        return run(s, 0, 0);
    } 
    private static int run(String s, int index, int sum){
        if(s.length() == index) return sum;
        int newSum = 0;
        if(index == 0) {
            sum = 1;
            newSum = sum;
        } 
        else if(s.charAt(index) == s.charAt(index - 1) || index == 0){
            sum += 1;
            newSum = sum;
        }
        else newSum = 1;
        return Math.max(sum,  run(s, index + 1, newSum));

    }
    public static void main(String[] args) {
        System.out.println(run("rttt6666666666666ty"));
    }
}
