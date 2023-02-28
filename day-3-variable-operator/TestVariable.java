public class TestVariable {
	int data;
	String orgOfCourse;
	static int no;
	
	public static void main(String[] args) {
		int z = 200;
		
		TestVariable t1 = new TestVariable();
//		t1.data = 20;
		System.out.println("Number of Objects  " + TestVariable.no);
		System.out.println(t1.data);
		System.out.println(t1.orgOfCourse);
		
		TestVariable t2 = new TestVariable();
		t2.data = 30;
		t2.orgOfCourse = "BITM";
		System.out.println("Number of Objects  " + TestVariable.no);
		System.out.println(t2.data);
		System.out.println(t2.orgOfCourse);
		
		TestVariable t3 = new TestVariable();
		t3.data = 40;
		System.out.println("Number of Objects  " + TestVariable.no);
		System.out.println(t3.data);
		System.out.println(t3.orgOfCourse);
	}

	public TestVariable() {
		no++;
		data = 20;
		orgOfCourse = "Test";
	}
	
}
