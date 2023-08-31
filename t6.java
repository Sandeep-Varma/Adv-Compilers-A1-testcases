class t6 {
    public static void main(String[] args) {
        System.out.println(1);
    }
}

class A{
    int x;
    public int func(){
        int[] a;
        Boolean b;
        int c;
        c[b]=b; // 3 errors
        c[c]=c; // 2 errors
        c[c]=b; // 2 errors
        c[b]=c; // 3 errors
        a[b]=b; // 2 errors
        a[b]=c; // 2 errors
        a[c]=c; // 0 errors
        a[c]=b; // 1 errors
        c=a[b]; // 2 errors
        c=a[c]; // 0 errors
        a=c[b]; // 3 errors
        a=a[c]; // 1 errors
        // Total errors = 21
        return c;
    }
}