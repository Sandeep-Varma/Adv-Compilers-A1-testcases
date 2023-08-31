class t8 {
    public static void main(String[] args) {
        System.out.println(1);
    }
}

class E{
    int x;
    public int func(){
        D a;
        boolean b;
        int c;
        a.x = c; // 0 errors
        c = a.x; // 0 errors
        a.x = b; // 1 error
        b = a.x; // 1 error
        a.y = c; // 2 errors
        c = a.y; // 2 errors
        a.y = b; // 2 errors
        b = a.y; // 2 errors

        b.x = c; // 2 errors
        c = b.x; // 2 errors
        
        // Total: 14 errors
        return c;
    }
}

class D{
    int x;
}