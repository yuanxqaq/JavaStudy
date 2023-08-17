package polymorphism.apply;

/**
 * ClassName: AnimalTest
 * Package: polymorphism.apply
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/30 11:26
 * @Version 1.0
 */
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();

        test.adopt(new Dog());
        test.adopt(new Cat());
    }

    public void adopt(Animal animal){
        animal.eat();
        animal.jump();
    }
//    public void adopt(Dog dog){
//        dog.eat();
//        dog.jump();
//    }
//    public void adopt(Cat cat){
//        cat.eat();
//        cat.jump();
//    }

}

class Animal{
    public void eat(){
        System.out.println("动物进食");
    }

    public void jump(){
        System.out.println("动物跳");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void jump(){
        System.out.println("狗急跳墙");
    }

    public void watchDoor(){
        System.out.println("狗能看家");
    }
}


class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void jump(){
        System.out.println("猫跳...");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}