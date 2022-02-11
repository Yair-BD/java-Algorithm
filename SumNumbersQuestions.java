public class SumNumbersQuestions {
    /*The func get two sorted arrays and a number
    * The mission is to find two numbers that their sum is the givven number */

    public static boolean findSumNumber(int[] list1, int[] list2, int num) {
        int index2 = list2.length - 1, index1 = 0;
        while (index2 >= 0 && index1 < list1.length) {

            if (list1[index1] + list2[index2] > num)
                index2--;
            else if (list1[index1] + list2[index2] < num)
                index1++;
            else
                return true;
        }
        return false;
    }

    /*The func get an array and number the represent the size of the subarray
    * The missin is to find thay subarray with the min sum of numbers */

    public static String f(int[] list, int subList){
        int i = 0, j = 1, ej = 0, si = 0, sum = 0, minSum = Integer.MAX_VALUE;
        sum = list[i] + list[j];
        while(i< list.length - subList && j <  list.length - 1){
            if (j < i + subList){
                j ++ ;
                sum += list[j];
            }else {
                if (sum < minSum) {
                    minSum = sum;
                    si = i;
                    ej = j-1;
                }
                i++;
                j = i +1;
                sum = list[i] + list[j];
            }
        }
        return si+","+ ej;
    }

    /*The func get an array and a number
    * The mission is to find thhrre number tha their sum is under the number */
    public static int sumOfThreeUnderNum(int[] list, int num) {
        int count = 0, i = 0, j = 1, c = 2;
        while (i <= list.length - 3) {
            if (list[i] + list[j] + list[c] < num) {
                if (c < list.length - 1) {
                    c += 1;
                    count++;
                } else if (j < list.length - 2) {
                    j += 1;
                    count++;
                }
                i++;
                count++;
            }else
                break;
        }
        return count;
    }

}