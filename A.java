package test;

class A {
	int defaultA;
	public int publicA;
	private int privateA;
	protected int protectedA;
}

class sameFile extends A{
	
	int defaultSameFile = defaultA;
	int publicsSameFile = publicA;
	// not visible int privateSameFile = privateA;
	int protectedSamefile = protectedA;
}


