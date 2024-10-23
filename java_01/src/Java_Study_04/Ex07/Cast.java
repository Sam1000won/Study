package Java_Study_04.Ex07;

public class Cast {
    public static void main(String[] args) {
        
        Mammal m = new Mammal();
        Mammal c = new Cat();
        Mammal d = new Dog();

        Mammal mal = null;

        // 부모형태로 묵시적 형 변황

        mal = new Dog();
        mal.birth();
        mal.eat();
        // mal.bark() 개의 고유 특성은 사용할 수 없다.

        // 나의 특성을 살리고싶으면
        // 나의 집으로 돌아가야한다.
        // 이것이 명시적형변환이라고한다 Casting
        Dog dog = (Dog)mal;
        dog.bark();
        /* 
        캐스팅시 본인의 원형이 아닌 형태로 돌아가려고하면
        classcalstexcption을 만나게 된다
        Cat cat = (cat)mal;
        cat.mew();
        */

        // 상속받은 자식객체가 캐스팅시 헷갈리는 경우가 많다.
        // 이럴경우 아래와 같이 확인가능

        if(mal instanceof Cat){
            Cat cat = (Cat)mal;
        }else{
            System.out.println("돌아가 너희 집 아녀");
        }

    }
}
