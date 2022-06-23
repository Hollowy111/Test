package OOP;

public class OOP {

	public static void main(String[] args) {
		
		car car1 = new car();
		
		car1.carBrand = "Audi";
		car1.color =  "schwarz";
		car1.horsePower = 270;
		car1.yearofconstruction = 2019;
		car1.xPosition = 100;
		car1.yPosition = 100;
		
		
		/*System.out.println(car1.carBrand);
		System.out.println(car1.color);*/
		
		car car2 = new car();
		car2.carBrand = "BMW";
		car2.color =  "rot";
		car2.horsePower = 300;
		car2.yearofconstruction = 2020;
		car2.xPosition = 100;
		car2.yPosition = 150;
		
		
		/*System.out.println(car2.carBrand);
		System.out.println(car2.color);
		
		System.out.println("Aktuelle Position von Car 1 = "+car1.xPosition + " / " + car1.yPosition);
		System.out.println("Aktuelle Position von Car 2 = "+car2.xPosition + " / " + car2.yPosition);
		System.out.println("________________________________________"+"\n");*/
		
		/*car1.drive(10, 20);
		car2.drive(30, 20);*/
		
		/*System.out.println("Aktuelle Position von Car 1 = "+car1.xPosition + " / " + car1.yPosition);
		System.out.println("Aktuelle Position von Car 2 = "+car2.xPosition + " / " + car2.yPosition);*/
		
		people peoples1 = new people();
		peoples1.Age = 42;
		peoples1.Name = "Daniel";
		peoples1.Haircolor = "Brown";
		peoples1.Skincolor = "Caucasian";
		peoples1.Weight = 90;
		peoples1.Height = 175;
		peoples1.Hobbies = "Playing Soccer";
		
		
		people peoples2 = new people();
		peoples2.Age = 34;
		peoples2.Name = "Niklas";
		peoples2.Haircolor = "Brown";
		peoples2.Skincolor = "Caucasian";
		peoples2.Weight = 110;
		peoples2.Height = 185;
		peoples2.Hobbies = "Playing Video Games";
	
		
		people peoples3 = new people();
		peoples3.Age = 20;
		peoples3.Name = "Jon";
		peoples3.Haircolor = "Black";
		peoples3.Skincolor = "Black";
		peoples3.Weight = 85;
		peoples3.Height = 200;
		peoples3.Hobbies = "Playing Basketball";
	
		
		peoples1.print();
		peoples2.print();
		peoples3.print();
		
	}

}
