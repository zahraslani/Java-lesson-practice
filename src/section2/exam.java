package section2;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] list1 = {"zara", "sara", "mohammad", "hana"};
		String [] list2 = {"ali", "sara", "mohammad", "kian"};
		for (int i=0;i<list1.length;i++){
			for (int j=0;j<list2.length;j++) {
				if(list1[i]==list2[j]) {
					System.out.println("duplicate name:" + " " + list1[i]);
				}
			}
		}
	}

}
