class t1 {
    public static void main(String[] args) {
        System.out.println(new A().foo(10));
    }
}
class A {
    public int foo(int p) {
        int x;
        boolean y;
        int z;
        int w;
        int q;
        x = 10;
        y = true;
        z = 0;
        if (z) {
            z = z + p;
            if (z != false) {
                y = false;
            }
        }
        q = this.bar();
        return z;
    }
    public int bar() {
        int a;
        int b;
        a = 10;
        return a;
    }
}
class B extends A {}
