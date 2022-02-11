class equalsSumOfEverySide{
    public static boolean equalsSumOfEverySide(int[] list) {
        int sumOfAll = 0, prev = 0;
        for (int i = 0; i <= list.length - 1; i++) {
            sumOfAll += list[i];
        }
        for (int j = 0; j <= list.length - 1; j++) {
            if (prev + list[j] == sumOfAll - (prev + list[j]))
                return true;
            prev += list[j];
        }
        return false;
    }
}