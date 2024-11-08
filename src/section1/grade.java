package section1;

public class grade {

	public static void main(String[] args) {
		int [] grade= {89, 100, 96,79, 92};
		
		System.out.println("maximum:" + maximum(grade));
		
		for (int i = 0; i< grade.length; i++) {
		int finalGrade = grade[i]/10;
				 switch (finalGrade)
				 {
				    case 10: case 9:
				         System.out.println(grade[i] +" " + "A");
				         break;        
				     case 8:
				         System.out.println(grade[i] +" " + "B");
				         break;
				     case 7:
				         System.out.println(grade[i] +" " + "C");
				         break;
				     default:
				    	 System.out.println(grade[i] +" " + "YOU FAILED");
				 }		
	      }
	}

	private static int maximum(int[] grade) {
		int max=grade[0];
		for (int j = 0; j< grade.length; j++) {
			if(grade[j]>max)
				max= grade[j];	
		}
		return max;
	}
}
