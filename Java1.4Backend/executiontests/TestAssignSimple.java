public class TestAssignSimple {
	static int stat;
	int inst;
	public static void main(String[] args) {
		int local;
		local = 1;
		System.out.println(local);
		stat = 2;
		System.out.println(stat);
		TestAssignSimple.stat = 3;
		System.out.println(TestAssignSimple.stat);
		TestAssignSimple s = new TestAssignSimple();
		TestAssignSimple t = new TestAssignSimple();
		s.inst = 4;
		t.inst = 5;
		System.out.println(s.inst);
		System.out.println(t.inst);
	}
}		
