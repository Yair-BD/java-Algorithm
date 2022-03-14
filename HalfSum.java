public class HalfSum {
    /**
     * @param list Of numbers
     * @return the index that the sum of numbers up to him is equal to the sum from him, if there isnt return -1
     * Time complexity O(n)
     * Space complexity O(1)
     * 
     */
    public static int run(int[] list){
        int sum1 = 0, sum2 = 0;
        for (int k = 0; k < list.length; k++) {
            sum1 += list[k];
        }
        for (int k = 0; k < list.length; k++) {
            sum2 += list[k];
            sum1 -= list[k];
            if(sum1 == sum2) return k;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(run(new int []{2, 4, 1, 2, 3, 5}));
    }
}
