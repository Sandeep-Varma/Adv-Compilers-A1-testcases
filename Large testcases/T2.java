// Total: 41 errors

class Test {
    public static void main(String[] args) {
        System.out.println(1);
    }
}

class GrandParent{
    int ancient;
}

class Parent extends GrandParent{
    int y;
    public int bar(int a,int b, int c){
        return 0;
    }
    public int m1(Parent p){
        return 0; 
    }
    public int m2(Child c){
        return 0;
    }
}

class Array_Assign{
    public int foo(){
        int[] a;
        boolean b;
        int c;
        a[b]=c; // 2 errors
        return 0;
    }
    public int foo1(){
        int a;
        boolean b;
        int c;
        a[b]=c; // 3 errors
        return 0;
    }
    public int foo2(){
        int a;
        boolean b;
        a[b]=b; // 3 errors
        return 0;
    }
    public int foo3(){
        int[] a;
        int c;
        c[c]=c; // 2 errors
        return 0;
    }
    public int foo4(){
        int[] a;
        int c;
        a=new int[5];
        c=0;
        a[c]=c; // 0 errors
        return 0;
    }
}

class Field_Store extends Parent{ // 5 errors
    int x;
    public int foo(){
        Field_Store f;
        int g;
        f=new Field_Store();
        f.x=0;
        f.x=false;
        f.y=g;
        f.z=0;
        g.x=0;
        return 0;
    }
}

class Println{
    public int foo(){
        System.out.println(0 && false); // 1 error
        return 0;
    }
}

class Inequality extends Parent{
    public int foo(){
        if(new Inequality()!=new Parent()){

        }
        if(new Parent()!=new Inequality()){
            
        }
        if(new Parent() != new NotChild()){ // 2 errors

        }
        if(new NotChild() != new Parent()){ // 2 errors
            
        }
        return 0;
    }
}

class FieldLookup extends Parent{
    int x;
    public int foo(int k){
        FieldLookup f;
        f=new FieldLookup();
        k=f.x;
        k=f.y;
        k=f.z; // 2 errors
        return 0;
    }
}

class ArrayLookup{
    public int foo(){
        int [] a;
        int b;
        boolean c;
        a=new int[10];
        b=0;
        b=a[0];
        System.out.println(a[b]);
        System.out.println(b[b]); // 1 error
        System.out.println(a[c]); // 1 error
        System.out.println(b[c]); // 2 errors
        return 0;
    }
}

class MessageSend extends Parent{ // 13 errors
    public int foo(){
        int x;
        System.out.println(new MessageSend().bar(0,0,0));
        System.out.println(new MessageSend().foo());
        System.out.println(new MessageSend().food(0<=false));
        System.out.println(new MessageSend().who(0<=false,0<=false));
        System.out.println(new MessageSend().bar());
        System.out.println(new MessageSend().m1(new Parent()));
        System.out.println(new MessageSend().m1(new Child()));
        System.out.println(new MessageSend().m2(new Parent()));
        System.out.println(new MessageSend().m2(new Child()));


        System.out.println(new MessageSend().food(0<=false,0<=false));
        System.out.println(new MessageSend().bar(false,false));
        System.out.println(new MessageSend().who(0<=false));
        return 0;
    }
    public int food(int x){
        return 0;
    }
}

class Identifier_type extends Parent{
    int x;
    public int foo(int p){
        int c;
        c=0;
        p=c;
        p=x;
        p=y;
        c=p;
        x=p;
        y=p;
        p=ancient;
        ancient=p;
        return 0;    
    }
}

class ArrayAllocationExpression{
    public int foo(){
        int []a;
        a=new int[10];
        a=new int[false]; // 2 errors
        return 0;
    }
}

class Child extends Parent{

}

class NotChild{

}
