public class StringInString {// 24
   
    public static int run(String s, String t) {
        return run(s, t, 0, 0);        
    }
    private static int run(String s, String t, int indexS, int indexT){
        if(s.length() == indexS || t.length() == indexT) return 0;
        int a = 0;
        if(s.charAt(indexS) == t.charAt(indexT)) a = 1 + run(s, t, indexS + 1, indexT + 1);
        int takeT = run(s, t, indexS, indexT + 1);
        int takeS = run(s, t, indexS + 1, indexT);

        return Math.max(a ,Math.max(takeT, takeS));
    }

    public static void main(String[] args) {
        System.out.println(run("yairnurit", ""));
    }
}
