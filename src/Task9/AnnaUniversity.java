package Task9;

public class AnnaUniversity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

			
				int marks[] = { 100, 95, 86, 78, 68, 55  };

				int max_marks = marks.length * 100;


				int total = 0;

		
				char grade = 'F';

	
				for (int i = 0; i < marks.length; i++) {
					total += marks[i];
				}

			
				double percentage
					= ((double)(total) / max_marks) * 100;

	
				if (percentage >= 100) {
					grade = 'S';
				}
				else {
					if (percentage >= 90 && percentage <= 99) {
						grade = 'A';
					}
					else {
						if (percentage >= 80 && percentage <= 89) {
							grade = 'B';
						}
						else {
							if (percentage >= 70 && percentage <= 79) {
								grade = 'C';
							}
							if (percentage >= 60 && percentage <= 69) {
								grade = 'D';
							}
							if (percentage >= 50 && percentage <= 59) {
								grade = 'E';
							}
							else {
								grade = 'F';
							}
						}
					}
				}

				System.out.println(grade);
			}
		

	}
	


