public class TheOneMatriza { 
    /**2022א מועד א
     * שאלה 2
     */

    /**בדיקה האם בגודל שמועבר ישנה מטריצת יחידה המערך דו ממדי שהועבר
     * 
     * תנאי עצירה : רע - אם אנחנו במצב שאורך שווה לרוחב והערך שבפנים != 1
     *           רע - אם האורך לא שווה לרוחב והערך בפנים != 0
     *                            טוב - אם הגענו לסוף בלי בעיה
     * 
     * החזרה : רע - שקר
     * טוב - אמת 
     * 
     * צעד הבא : כל עוד לא סיימנו את כל השורה אנחנו לא נעבור לשורה הבאה 
     * שנסיים אותה נעבור לשורה הבאה ונאפס את התור לערך התור ההתחלתי 
     * 
     */
    public static boolean isIdentity(int[][] mat , int x, int size){
        return isIdentity(mat, x, size, x, x, x + size - 1);
    }
    private static boolean isIdentity(int[][] mat , int x, int size, int l, int r, int end){
        // במטריצה אם אנחנו במקום שהשורה == לתור והערך לא שווה אחד או שהתור != לשורה והערך לא שווה 0 
        if((l == r && mat[l][r] != 1)||(l != r && mat[l][r] != 0)) return false;
        
        // אם הגענו לסוף בלי בעיה 
        if((l == r && l == end)) return true;
        
        // במקרה שהגענו לתור האחרון שאנחנו רוצים לבדוק אנחנו עוברים לשורה הבאה ומאפסים את הערך של התור לערך ההתחלתי שלו 
        if(r == end) return isIdentity(mat, x, size, l+1, x, end);
        return isIdentity(mat, x, size, l, r+1, end); 
    }

    public static int maxMatrix(int[][] mat){
        return maxMatrix(mat, 0, mat.length);
    }
    /**ריצה רקורסיבית על מערך דו ממדי כדי למצוא מרטריצת יחידה 
     * תנאי עצירה :טוב : אם מצאנו שהגודל שאנחנו רוצים מחזיר אמת וישנה מטריצה 
     *רע : אם הגענו למצב שאנחנו יודעים שאין מטריצת יחידה במערך גודל המצופה הוא <=1 
     * 
     * נחזיר : טוב : גודל המצופה שהעברנו 
     * רע : 0
     * 
     * צעדים קטנים : מעבירים לפנקציית הווידוי את המערך עם גודל מצופה חדש ועם השורה הבאה לבדיקה 
     */
    private static int maxMatrix(int[][] mat , int x, int size){
        // אם הפונקציה שבודקת האם ישנו מטריצה בגודל הועבר מחזירה אמת אני מחזיר את הגודל שהועבר כי זה הגודל המקסימלי
        if (isIdentity(mat, x, size)) return size;
        // נתון בשאלה שהגדלים של המערכים יהיו רק אי זוגיים כל שהגודל לא יכול להגיע == 0 כך שהבדיקה היא תמיד >=1 
        // וכך אם הגענו למצב שבו אין שום מטריצה אנחנו מחזירים 0 
        if(size <= 1) return 0;
        // הצד הרקורסיבי הבא מחסירים 2 מהגודל שמצופה כי אנחנו רוצים שהמטריצה תשמר במרכז המערך 
        else return maxMatrix(mat, x+1, size - 2);
    }



    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 0, 0, 0, 0},
                                  {0, 1, 0, 0, 0},
                                  {0, 0, 1, 0, 0},
                                  {0, 0, 0, 1, 0},
                                  {0, 0, 0, 0, 1}};
        System.out.println(maxMatrix(mat));
    }

    
}