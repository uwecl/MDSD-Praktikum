package repository;

public class Helper {
	
	public static void assertNull(Object o) {
		if(o != null) {
			System.out.println("[AssertNull] Test failed! Element is not null!");
		}
	}
	
	public static void assertNotNull(Object o) {
		if(o == null) {
			System.out.println("[AssertNotNull] Test failed! Element is null!");
		}
	}
}

