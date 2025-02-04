package cls;

public class Person {
    // 이름, 나이, 성별
    //public String name;   // 이름
    //public int age;       // 나이
    //public int gender;    // 성별

    //접근제한자 : class, attribute, method 앞에 붙여서 각 속성(기능)의 공개 여부를 결정한다.// 데이터를 캡슐화한다.

    /*
    * public : 모두에게 공개
    * protected : 같은 패키지(클래스 그룹) 안의 클래스들끼리 접근가능, 상속된 클래스에서 접근가능
    * private : 무조건 비공개
    * default : 같은 패키지 안의 클래스들끼리 접근 가능, 상속된 클래스에서 접근 불가능
    * */

    protected String name;   // 이름
    private int age;       // 나이
    private int gender;    // 성별

    // 생성자(Constructor)
    public Person() {
        name = "이름없음";
        age = 1;
        gender = 2;
        //System.out.printf("Person : %s, %d\n", this.name, this.age);
        //System.out.println("person의 생성자가 실행되었습니다.");
    }

    public Person(int gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        //System.out.printf("Person : %s, %d\n", this.name, this.age);
    }

    // method : 행위, 기능을 수행한다.
    // 반환값을 호출한 쪽에 넘겨줄 수 있다. 반환값은 한개만 가능하다.
    // 접근제한자 반환형 메소드이름(매개변수들...) { 메소드 코드들... }


    // 자기 소개
    public void introduce() {
        System.out.printf("안녕하세요, 저는 %s이고, %d살입니다.\n", name, age);
    }

    public String getName(){
        return name;
    }

    // 메소드
    // gender에 따라서 반환값이 "남자" 또는 "여자"를 반환하는 메소드를 작성하세요.
    // 1이면 남자, 2면 여자를 반환하도록 합니다.
    // getGender()

    public String getGender(){
        if(gender==1)
            return "남자";
        else if(gender==2)
            return  "여자";
        return "알 수 없음";
    }
}
