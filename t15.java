// Credits: Bhuvan Reddy

class Test {
	public static void main(String[] p) {
		System.out.println(false - new int[ false ]); // 2 errors
	}
}
class L {
	L f;
	int x;
	int z;
	C l;

	public C w() {
		L i;
		L v;
		L l;
		return 20 + 0; // 1 error
	}

	public boolean v() {
		boolean w;
		int t;
		if(0) // 1 error
			z[this] = this; // 3 errors
		System.out.println(true.y(28.c(true && 99, (this + new C()) / true))); // 5 errors
		t = false; // 1 error
		return (x); // 1 error
	}

	public L y() {
		L z;
		boolean x;
		return z && new int[ (true) + 92 ]; // 4 errors
	}

}
class C extends L {
	boolean t;
	boolean b;

	public L u() {
		int o;
		int[] b;
		L l;
		C m;
		return b[(o != new C())]; // 3 errors
	}

	public boolean r() {
		int[] h;
		return 3 - false; // 2 errors
	}

	public int f() {
		int e;
		return true; // 1 error
	}

}

//SEED: 2
//EXP_NESTING: 0.001
//BLOCK_NESTING: 0.01
//LIST_SIZE: 4
//SMALL_LIST_SIZE: 2
// ------ THE END ------

