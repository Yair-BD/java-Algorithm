public class LongOrdNumber { // 26
    
    public static int run(String s){
        return run(s, 0, '0', 0);

    }
    private static int run(String s, int index, char prevNum, int sum){
        int newsum;
        if(index == s.length()) return sum;
        if(s.charAt(index) >= '0' && s.charAt(index) <= '9')
            if(index == 0 || s.charAt(index) > prevNum){ 
                sum +=1;
                newsum = sum;} // This variable her to catch the former amount of oreder numbers.
            else newsum = 1; // Starting the count from the start
        else newsum = 0;
        return Math.max(sum, run(s, index + 1, s.charAt(index), newsum)); //Her we take to the next etaration the "newsum" variable to continue the count.
        // What biggger, the sum i have now or the one i will have next iteration? now they equal but next iteration they may not. 

    }
    public static void main(String[] args) {
     
        System.out.println(run("0123456789234dfdssg67896ffgnfn01234578"));
    }
}
