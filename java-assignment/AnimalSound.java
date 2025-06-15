class Animal {


    public void makeSound(){
        System.out.println("Animals Makes Sound!");  //Original method of Animal
    }

}
class Dog extends Animal {  //It extends the property of Animal
    @Override                  //It override the makeSound method
    public void makeSound(){
        System.out.println("Bhow Bhow!");  
    }
}
 class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Meow Meow!");
    }

 }

 class Cow extends Animal {
    @Override
     public void makeSound(){
        System.out.println("Baaaaa!");
     }
 }
 public class AnimalSound {
    public static void main(String[] args) {
        Animal[] animal ={new Dog(),new Cat(),new Cow()};   //Using an array to access all
        for(int i=0; i<animal.length;i++){
            animal[i].makeSound();
        }
    }}
