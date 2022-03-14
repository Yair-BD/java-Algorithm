public class Domino {

    /**
     * 
     * @param n Number of columns
     * @param m Number of rows 
     * @return The sum of ways we can order dominos 
     * מה שבעצם עשינו כאן זה להבין איך אנחנו מחשבים את הבעיה : 
     * רצים על : מגרש הדומינו, יש לי אפשרות לשים אחד לאורך - יורד 1 לשים לרוחב, ויורד 2 
     * תנאי עצירה : הרוחב == 2 
     * הרוחב == 1 
     * בעצ םאומר שיש לי את האפשרויות האחרונות לשים שנשאר 1 יש לי רק אפשרות 1 לשים ושנשאר 2 יש לי או לשים 1 של 2 או בעצם לשים 2 של 1
     * מה אני מחזיר : או 2 או 1 
     */
    public static int run(int n, int m ){
        if (n == 1) return 1;
        if (n == 2) return 2;
        return run(n - 1, m) + run(n - 2, m);        
    }
    
    public static void main(String[] args) {
        System.out.println(run(6, 2));
    }
}
