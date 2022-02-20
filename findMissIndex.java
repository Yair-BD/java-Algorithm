/**2022א מועד א
 * שאלה 2
 * מקבלים מערך שבתוכו יש סדרה חשבונית וצריך להחזיר את המיקום של האיבר הראשון החסר בסדרה החשבונית
 * סיבוכיות זמן O(log n)
 * סיבוכיות מקום O(1)
 */

public class findMissIndex {
    public static int bestTimeComplexy(int[] list){
        int start = 0, end = list.length-1;
        int dis = Math.min(list[start +1 ] - list[start], list[end] - list[end -1]);

        // לולאה שעוברת על הקצוות של המערך ובודקת האם ישנו הפרש שונה מההפרש שמצאנו
        while (start < end &&  dis == list[end] - list[end -1] && dis == list[start +1 ] - list[start]){
            start +=1 ;
            end -= 1 ;
        }// כל סיבוב מצמצמים את המערך ב 

        // שיצאנו מהלולאה אנחנו בודקים איזה קצה היה עם הפרש גדול מההפרש האמיתי שמצאנו 
        if(list[end] - list[end -1] > dis ) return end ;
        if(dis < list[start +1 ] - list[start]) return start +1;
        return list.length;

    }

    public static void main(String[] args) {
        System.out.println(bestTimeComplexy(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18}));
    }
}
