class t4 {
    public static void main(String[] args) {
        System.out.println(new A().func(1));
    }
}

class A{
    int x;
    boolean y;
    public int func(int p) {
        int q;
        return p+(q+(x+y)); // 4 Errors - 3 (1 for each + operator) + 1 (for return type)
    }
}