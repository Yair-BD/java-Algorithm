class smallEqualIndex {
    public static int def(int[] list1, int[] list2) {
        int len = Math.min(list1.length, list2.length), index = Integer.MAX_VALUE;
        int begin = 0, end = len - 1, mid;
        while (begin <= end) {
            mid = (begin + end) / 2;
            if (list1[mid] > list2[mid]) {
                begin = mid + 1;
            } else if ((list1[mid] < list2[mid])) {
                end = mid - 1;
            } else {
                index = Math.min(index, mid);
                end = mid - 1; // If there is another one i want him if he is smaller then the current
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] e = new int[]{10, 4, 0, 5, 6, 3, 8, 1, 5, 9, 3};

        int[] c = new int[]{-1, 1, 0};

        System.out.println(def(c, e));

    }

}