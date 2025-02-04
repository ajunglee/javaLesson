package cls;

public class FirstClass {
    public static void main(String[] args) {
        // 클래스(class) => 설계도
        // 객체(object) => 설계도를 통해 만들어진 것, 내 코드 상에서만 존재하는 것(실행x) 실체하지 않음
        // = 인스턴스(instance) : 객체를 실체화한 것(실행되고 있는 것)
        // 클래스 모델링(=객체모델링)
        // ex) Person / 속성(Attribute, data) - 이름, 나이, 성별 / 행위(Method, function) - 숨쉰다, 밥먹는다 등..

        // person 이라는 class로부터 p1, p2, p3라는 객체를 생성함.
        // 클래스이름 객체이름 = new 생성자;
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person(1,"홍길동",20);

        p2.introduce();
        p3.introduce();
        String gender = p3.getGender();
        System.out.printf("%s의 성별은 %s입니다\n", p3.getName(), gender);


//        p1.name = "홍길동";
//        p1.age = 20;
//        p1.gender = 1;
//
//        p2.name = "강호동";
//        p2.age = 30;
//        p2.gender = 1;
//
//        p3.name = "아이유";
//        p3.age = 21;
//        p3.gender = 2;
    }

}
