/**
 * 
 * @author aiko0703ff
 * Date 20180823 8:00~
 */
public class KitaJavaQ8 {
	public static void main(String []args) {
		Animal animal = new Animal();
		
		//　Q８−４途中
		String Animal[] = {"にゃん", "わん", "1", "2"};
		Cat cat = new Cat();
		cat.Name = Animal[0];
		cat.Age = Integer.parseInt(Animal[2]);
		cat.ShowProfile();
//		cat.Sleep();
		cat.Speak();
		
		Dog dog = new Dog();
		dog.Name = Animal[1];
		dog.Age = Integer.parseInt(Animal[3]);
		dog.ShowProfile();
//		dog.Run();
		dog.Speak();
	}

}

class Animal
{
    public String Name;
    public int Age;
    String Animal[] = new String[4];

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }
    
	
	public void Speak()
	{
	    System.out.println( "......" );
	}
}

class Cat extends Animal {
	public void Sleep() {
		System.out.println("スースー");	
	}
	@Override
	//再定義
	public void Speak() {
		System.out.println( "ニャーニャー" );
	}
}

class Dog extends Animal {
	public void Run() {
		System.out.println("トコトコ");	
	}
	@Override
	public void Speak() {
		System.out.println( "わんわん" );
	}
}