package section1;

public class grade {

	public static void main(String[] args) {

		int grade= 89;
		int finalGrade = grade/10;
				 switch (finalGrade)
				 {
				    case 10: case 9:
				         System.out.println(grade +" " + "A");
				         break;        
				     case 8:
				         System.out.println(grade +" " + "B");
				         break;
				     case 7:
				         System.out.println(grade +" " + "C");
				         break;
				     default:
				    	 System.out.println(grade +" " + "YOU FAILED");
				 }		
	}
	
}
