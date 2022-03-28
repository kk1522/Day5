package test;

class samePackageDifferentFile extends A {
    
	int defaultsamePackageDifferentFile = defaultA;
	int publicsamePackageDifferentFile = publicA;
	// not visible int privatesamePackageDifferentFile = privateA;
	int protectedsamePackageDifferentFile = protectedA;
	
}

class C{
	A a = new A();
	int defaultC = a.defaultA;
	int publicC= a.publicA;
	int protectedC = a.protectedA;
	// not visible int privateC = a.privateA;
	
	
}
