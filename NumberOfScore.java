public class NumberOfScore {
    /**
     * The fumction gets a score and returns the number of orders of goals to get this score.
     * @param g1 goals of team one 
     * @param g2 goals of team two
     * @return
     * תנאי עצירה : שיש 0 לאחד הצדדים אנחנו נחזיר 1 - כי משם יש באמת דרך אחת להגיע אל התוצאה 
     * צעדים קטנים : מורידים גול לקבוצה א 
     * מורידים גול לקבוצה ב 
     * 
     * הצעדים הקטנים כאן נותנים לי להתייחס לבעיה קטנהי ותר כל פעם בזה שאני מוריד כל איטרציה גול לקבוצה אחרת זה נותן לי להגיע לתואצה אפשרים 
     * ותנאי עצירה הוא זה שנותן לי את האינדיקציה להבין שהגעתי לתמצית האפשרות
     * במקרה שלנו שמגיעים לתוצאה 0 של אחת הקבוצות אין יותר אפשרויות לשחק איתן הלאה לכן אנחנו פשוט נספור אותה בכך שאנחנו נחזיר את הספרה 1 
     */

    public static int run(int g1, int g2){
        if(g1 == 0 || g2 == 0) return 1;
        return run(g1-1, g2) + run(g1, g2-1);
    }

public static void main(String[] args) {
    System.out.println(run(2,3));
}
}
