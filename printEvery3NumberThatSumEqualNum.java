class printEvery3NumberThatSumEqualNum{
    public static void printEvery3NumberThatSumEqualNum(int[] list, int num) {
        for (int i = 0; i < list.length; i++) {
            int j = i + 1, k = list.length - 1;
            while (j > k) {
                if (list[i] * list[j] * list[k] == num) {
                    System.out.println(list[i] + "" + list[j] + "" + list[k]);
                    k--;
                    j++;
                } else if (list[i] * list[j] * list[k] > num) {
                    k--;
                } else {
                    j++;
                }
            }
        }
    }
}