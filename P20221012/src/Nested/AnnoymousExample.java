package Nested;


class People{
	int height;
	int weight;
	
	void showInfo() {
		System.out.println("showInfo");
	}
}


class Student extends People{
	int studNo;
}

public class AnnoymousExample {
	public static void main(String[] args) {
		// 익명구
		People people = new People() {
			
			String color;
			
			@Override
			void showInfo() {
				System.out.println("익명 showInfo");
				showColor();
			}
			
			void showColor() {
				System.out.println(this.color);
			}
		};
		
	}
}
