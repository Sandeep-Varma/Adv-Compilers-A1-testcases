// Inheritance

class t11 {
    public static void main(String[] args) {
        System.out.println(11);
    }
}

class W{
}

class X extends W{
}

class Y extends X{
}

class Z extends Y{
}

class A{
    X x;
    public Y func1(X x){
        return new W(); // 1 error
    }
    public Y func2(X x){
        return new X(); // 1 error
    }
    public Y func3(X x){
        return new Y(); // 0 errors
    }
    public Y func4(X x){
        return new Z(); // 0 errors
    }
}

class B extends A{
    public int func5(){
        X var1;
        Y var2;
        Z var3;
        A a;
        B b;
        b.x = this.func1(new W()); // 1 error
        a.x = new A().func1(new X()); // 0 errors
        a.x = new B().func1(new Y()); // 0 errors
        b.x = this.func1(new Z()); // 0 errors
        var1 = this.func1(new X()); // 0 errors
        var2 = this.func1(new Y()); // 0 errors
        var3 = this.func1(new Z()); // 1 error
        return 0;
    }
}
