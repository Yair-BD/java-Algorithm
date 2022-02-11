class maxMountain{
    public static int maxMountain(int[] list) {
        int begin = 0, end = list.length - 1, big = list[0];
        boolean found = false;
        while (begin <= end && !found) {
            int middle = (begin + end) / 2;
            if (list[middle] >= Math.max(list[middle - 1], list[middle + 1])) {
                big = list[middle];
                found = true;
            } else if (list[middle] < list[middle - 1])
                end = middle - 1;

            else
                begin = middle + 1;

        }
        return big;
    }
}