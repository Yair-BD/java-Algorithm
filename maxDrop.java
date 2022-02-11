class maxDrop{
    public static Integer maxDrop(int[] list) {
        int max = list[0], min = list[0], maxD = -1;
        for (int i = 1; i < list.length; i++) {
            int num = list[i];
            if (num < min) {
                min = list[i];
                maxD = Math.max(max - min, maxD);
            } else if (num > max) {
                max = list[i];
                min = list[i];
            }
        }
        return maxD;
    }
}