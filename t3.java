class t3 {
    public static void main(String[] args) {
        System.out.println((1+2)*3);
    }
}

class A{
    int x;
    boolean y;
    public int func(int p, int q, A a) {
        int r;
        if (x <= y){ // 2 Errors - x and y are not of same type and if condition expects boolean
            System.out.println(p);
        }
        if (q != r){
            System.out.println((a.z)+(p+(q+r))); //  2 Errors - z field doesn't exist in A and plus operator expects int
        }
        return r;
    }
}