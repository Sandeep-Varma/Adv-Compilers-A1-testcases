class t5 {
    public static void main(String[] args) {
        System.out.println(1);
    }
}

class A{
    int x;
}

class B extends A{
    int y;
    public int func(){
        return x+y;
    }
}