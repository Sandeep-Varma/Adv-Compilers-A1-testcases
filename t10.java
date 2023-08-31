// Credits: Poorna Teja

class t10 {
    public static void main(String[] args) {
        System.out.println(5);
    }
}
class A {
    public int foo(int x, int y, int z) {
        int a;
        a = x + y;
        a = a + z;
        return a;
    }
    public int bar(int p) {
        return p;
    }
}

class B extends A {}

class C extends B {}

class D extends C {
    public int bar(int p) {
        boolean x;
        int y;
        y = new C().foo(p, new B().foo(p, new A().foo(p, p, p), p), p); // 0 errors
        y = new C().foo(x, new B().foo(p, new A().foo(p, p, p), p), x); // 1 error
        y = new C().foo(x, new B().foo(p, new A().foo(p, p, x), p), x); // 2 errors
        y = new C().foo(x, new B().foo(x, new A().foo(p, x, p), p), x); // 3 error
        return new C().foo(x, new B().foo(p, new A().foo(p, p, x), p), p); // 2 errors
    }
}
