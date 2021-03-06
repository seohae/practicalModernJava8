package ch2.인터페이스와클래스;

public class interfaceBasic {
    /**
     자바에서 인터페이스는 특정 기능에 접근하기 위한 인터페이스의 역할을 한다.
     통일성 확보, 다형성, 캡슐화

     인터페이스의 문제점 : 한번 배포된 인터페이스는 수정이 어렵다.

     - 최초 자바 버전의 인터페이스
     1) 상수를 선언할 수 있다.
        해당 상수는 반드시 값이 할당되어 있어야 하며, 값을 변경할 수 없다.
        이는 명시적으로 final을 선언하지 않더라도 final로 인식된다.
     2) 메서드는 반드시 추상메서드어야 한다. (구현체가 없고 메서드 명세만 정의되어있는 메서드)
     3) 인터페이스를 구현한 클래스는 인터페이스에서 정의한 메서드를 구현하지 않았다면 반드시 추상클래스로 선언되어야 한다.
     4) 인터페이스에 선언된 상수와 메서드에 public을 선언하지 않더라도 public으로 인식한다.

     - java 1.2 버전의 인터페이스
     1) 중첩 클래스를 선언할 수 있다.
        선언은 내부 클래스 같지만, 실제로는 중첩 클래스로 인식한다.
     2) 중첩 인터페이스를 선언할 수 있다.


     - java5 버전의 인터페이스
     1) 중첩 열거형(Enum)을 선언할 수 있다.
     2) 중첩 어노테이션을 선언할 수 있다.

     중첩 열거형과 중첩 어노테이션은 모두 public, static이어야 하며 생략할 수 있다.

     - java8 버전의 인터페이스
     1) 실제 코드가 완성되어있는 static 메서드를 선언할 수 있다.
     2) 실제 코드가 완성되어있는 default 메서드를 선언할 수 있다.

     위 static 메서드, default 메서드는 모두 public 메서드로 인식하며 public 선언은 생략할 수 있다.

     -> 인터페이스의 메서드에 실제 구현된 코드를 정의할 수 있게되었다.
     -> 이전 버전의 인터페이스는 정의되어 있는 메서드를 반드시 클래스에 추가하고 구현해야 하지만, 자바 8부터는
         default, static 메서드의 경우 구현 작업을 하지 않아도 컴파일 에러가 발생하지 않는다.

     - java9 버전의 인터페이스
     1) private 메서드를 선언할 수 있다.

     -> 외부에서 접근 불가능한 private 메서드를 사용할 수 있게한 이유는,
        내부의 static 메서드와 default 메서드의 로직을 공통화하고 재사용하는데 유용하기 때문이다.
     -> 단, 인터페이스의 private 메서드는 메서드 규격만 정의해서는 안되고, 실제 동작하는 소스 코드까지 작성해야한다.

     - 현재까지 인터페이스에 선언 가능한 항목
     1) 상수
     2) 추상 메서드
     3) 중첩 클래스
     4) 중첩 인터페이스
     5) 중첩 열거형
     6) 중첩 어노테이션
     7) static 메서드
     8) default 메서드
     9) private 메서드
     */

}
