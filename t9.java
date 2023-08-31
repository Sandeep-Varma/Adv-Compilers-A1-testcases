// Credits: Bhuvan Reddy

class Test {
	public static void main(String[] s) {
		System.out.println(this);
	}
}
class Y {
	N p;
	boolean l;
	boolean q;
	boolean j;

}
class N {
	boolean r;
	int[] j;

}
class B {
	int[] r;
	N l;
	boolean t;

	public B p() {
		int[] b;
		B c;
		b.b = 10; // 2 errors
		return new B().length; // 2 errors
	}

	public int[] z() {
		int p;
		int h;
		int[] w;
		boolean g;
		if(new N()) // 1 error
			l.l = new int[ new int[ true ][false] ] && new int[ true * 28 ]; // 9 errors
		{
		}
		return r;
	}

	public boolean h() {
		int[] o;
		int c;
		Y q;
		int j;
		return new int[ true ] && c; // 3 errors
	}

	public int[] w() {
		boolean k;
		int z;
		int[] o;
		N t;
		return true != true; // 1 error
	}

}