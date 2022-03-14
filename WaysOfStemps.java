public class WaysOfStemps {
    
    public static int run(int target, int steps){
        return run(target, steps, 0);
    }
    private static int run(int target, int steps, int now){
        if(steps < 0 || (steps == 0 && target == 0)) return 0;
        if(steps == 0 && now == target) return 1;
        int backWord = run(target, steps -1, now - 1);
        int forWord = run(target, steps -1, now +1);
        return backWord + forWord;
    }
    public static void main(String[] args) {
        System.out.println(run(3,4));
    }
}
