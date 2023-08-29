class t3 {
    public static void main(String[] args) {
        System.out.println((1+2)*3);
    }
}

class A{
    int x;
    boolean y;
    public int func(int p, int q) {
        int r;
        if (x <= y){ // 2 Errors - x and y are not of same type and if condition expects boolean
            System.out.println(p);
        }
        if (q != r){
            System.out.println(z+(p+(q+r))); //  1 Error - z not defined
        }
        return r;
    }
}