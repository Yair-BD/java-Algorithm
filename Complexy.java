public class Complexy {

    public static int countNeg(int[][] list) {
        int count = 0, array = 0, i = list[0].length - 1;

        while (array <= list.length - 1 && i >= 0) {
            if (list[array][i] < 0) {
                count += i + 1;
                array++;
            } else {
                i--;
            }
        }
        return count;
    }


    public static Integer count(int[] list, int num) {
        int before = binaryR(list, num - 0.5, 0, list.length - 1);
        int after = binaryR(list, num + 0.5, 0, list.length - 1);
        return (before != after) ? after - before : 0;
    }

    private static int binaryR(int[] list, double num, int lo, int hi) {
        if (hi < lo)
            return lo;
        int mid = (lo + hi) / 2;

        if (list[mid] < num)
            return binaryR(list, num, mid + 1, hi);
        else
            return binaryR(list, num, lo, mid - 1);

    }

    public static void main(String[] args) {

        int[] e = new int[] {10, 4, 0, 5 ,6, 3, 8, 1, 5, 9, 3};

        int[] c = new int[] {-1,1,0};

        System.out.println((c));
    }
}
