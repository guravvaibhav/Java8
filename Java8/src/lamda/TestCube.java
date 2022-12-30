package lamda;

public class TestCube {
	public static void main(String[] args) {
		Cube c=(i)->System.out.println(i*i*i);
		c.cube(3);
		Add addition=(i,j)->System.out.println(i+j);
		addition.add(10, 20);
	}

}
