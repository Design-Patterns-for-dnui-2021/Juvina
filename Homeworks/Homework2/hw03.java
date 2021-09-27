public class Client
{
    public static void main (String args[])
    {
        try
        {
            AnimalFactory factory = new AnimalFactory();
            Animal duck = factory.createAnimal("quack");
            duck.display();
			Animal dog = factory.createAnimal("woof");
            dog.display();
			Animal cat = factory.createAnimal("meow");
            cat.display();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

interface Animal {
    public void display();
}

class Duck implements Animal {
    public void display()
    {   
        System.out.println("The duck goes quack quack.");
    }
}

class Dog implements Animal {
    public void display()
    {   
        System.out.println("The dog goes woof woof.");
    }
}

class Cat implements Animal {
    public void display()
    {   
        System.out.println("The cat goes meow meow.");
    }
}

class AnimalFactory {
    public Animal createAnimal (String type)
    {
        Animal animal = null;
        if (type.equals("quack")) {
            animal = new Duck();
        } else if (type.equals("woof")) {
            animal = new Dog();
        } else if (type.equals("meow")) {
            animal = new Cat();
		}
    return animal;
    }
}