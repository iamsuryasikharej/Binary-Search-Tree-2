
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomTree ct=new CustomTree();
		ct.add(2);
		ct.add(5);
		ct.add(1);
		ct.add(15);
		ct.add(4);
		ct.add(70);
		
	
		System.out.println(ct.getHeight(ct.rootNode));
	}

}
