class FibonachiRecursion {
    public static int Fibonachi(int index){
        if(index <= 2) return 1;
        return Fibonachi(index - 1) + Fibonachi(index -2);
    }
    public static void main(String[] args) {
        System.out.println(Fibonachi(7));
    }
}