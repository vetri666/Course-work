package Test;

class Elders{
String name,relation;
int age;

}
class Person {
	// instance variables
	String name;
	int age;
	public String relation;

//classes
	// 1.data
	// 2.methods - subroutines
	// 3.

	static void family() {

		System.out.println("Good morning");
		
	}

}

class People {

	String role;
	int value;

}

class Relations {
	String relation;
	int number;
	
	
	static void hi() {
		int h = 5;
		System.out.println("hello");

	}
}

public class Jan {

	public static void main(String[] args) {

		Person person1 = new Person();
		
		person1.name = "max";
		
		person1.age = 56;
		
		person1.relation = "brother";
		
		Relations.hi();

		Person person2 = new Person();
		
		Person.family();
		
		Person person3 = new Person();
		person3.relation = "cousin";

		People grandfather = new People();
		grandfather.role = "elder";
		grandfather.value = 85;

		Elders uncle = new Elders();
		uncle.name= "Sam";
		uncle.relation="test";
		
		System.out.println(uncle.name);
		System.out.println("how're you doing");
		
int num;

        System.out.println(num);
    }

		
	}

}
