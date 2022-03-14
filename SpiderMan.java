public class SpiderMan {
    /**
     * We colculate for spiderman how many jump of 2/1 floors he needs to jump to ger the floor n
     * @param n A number that represent the floor spiderman want to get
     * @return the numpers of jumps
     */

    public static int jump(int n){
    //     if(n < 0) return 0;
    //     if(n <= 2) return n;
    //     return jump(n-1)+ jump(n-2);
    return jumpp(n);
    }

    private static int jumpp(int n){
        if(n == 0) return 1;
        if(n < 0) return 0;
        return jumpp(n-1) + jumpp(n-2);
    }


    
    public static void main(String[] args) {
        System.out.println(jump(0));
    }

}
