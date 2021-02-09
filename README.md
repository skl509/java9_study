# java9_study
## 1.기본 프로그래밍 구조
 * 1.1 첫번째 프로그래밍

자바 : 객체지향 언어
자바는 객체 (object)를 조작해 일을 시킨다. 객체는 특정 클래스 (class)에 속해있다. 그 객체를 클래스의 인스턴스(instance)라고한다.

자바는 모든 코드를 클래스 안에 정의한다.

자바는 몇가지 명령을 빠르게 실행햐려고 사용하는 스크립트 언어가 아니다. 클래스, 패키지, 모듈로 구조화해 대규모 프로그램을 개발하기 좋은 언어이다.

클래스 class
클래스는 객체상태와 할수 있는 일을 정의한다.

메서드 method
메서드는 클래스 안에 선언된 함수이다.

static이 붙어있는 메서드는 객체가 없어도 작동한다.

패키지 package
관련있는 클래스를 모아놓은 집합이다.

클래스를 패키지 안에 넣어 관련있는 클래스를 함께 묶어서 이름이 같은 클래스가 여러개 있어도 서로 중돌하지 않도록한다.

자바 프로그램 컴파일 및 실행
자바 프로그램은 두 단계를 거쳐 실행한다.

javac 명령으로 자바 소스를 특정 기계에 종속되지 않은 중간표현인 바이트코드로 컴파일해서 클래스 파일에 저장한다.
java 명령으로 가상머신을 구동하고 클래스파일을 로드해서 바이트 코드를 실행한다.
바이트코드는 한번 컴파일하면 모든 자바가상머신에서 실행할 수 있다.

write once, run anywhere.
한 번 작성하고, 어디서나 실행한다.

 * 1.2 기본 타입

자바의 정수타입범위는 프로그램을 실행하는 머신과 상관없이 동일하다. 이는 자바를 '한 번 작성하고, 어디서나 실행' 하는 언어로 설계했기 때문이다. (C 나 C++ 에서는 컴파일하는 프로세서에 따라 정수타입이 다르다.)

부동소수점(소수점 부분이 있는 숫자, float이나 double)은 정밀한 계산에는 적합하지 않다.

그 이유는 2진수 체계를 사용하기 때문이다. 10진수에서 1/3 을 정확히 나타낼 수 없듯이 2진수에서는 1/10 을 정확히 나타낼 수 없다.

정확한 숫자계산이 필요할때는 임의의 정밀도를 사용하는 BigDecemal 클래스를 사용해야한다.

* 1.3 변수

자바에서는 변수를 사용하기 직전까지 변수 선언시기를 늦추는 것을 좋은 방식으로 여긴다.

상수
final 키워드는 한번 할당하면 변경할 수 없는 값에 사용한다. 이 값을 상수라고한다.

보통 상수이름은 대문자로 선언하는 관례를 따른다.

final 변수를 처음 사용전 딱한번 초기화 한다면, 초기화를 나중으로 미룰 수도 있다.

* 1.4 산술연산

수학 메서드 Math
자바 수학 메서드 Math.
Math 의 메서드는정적 메서드이므로 객체(인스턴스) 로 호출할 수 없다. static 싱수와 마찬가지로 메서드가 선언된 클래스 이름을 메서드 앞에 붙여야 한다.
연산자
조건연산자 (삼항연산자)
~~~
time < 12 ? "am" : "pm" 
// 조건 (time < 12) ? 1 : 2 , 조건이 참일 경우에 1이 반환되서 나오고 조건이 거짓일 겨우 2가 반환되서 나온다.
~~~
큰 숫자
기본정수타입이나 부동소수점 타입의 정밀도로 충분하지 않을떄
→ BigInteger, BigDecimal 객체를 사용한다.
BigInteger 클래스는 임의로 정밀도 정수 연산을 구현하며, (long 타입보다 큰 범위 사용가능)
BigDecimal 클래스는 부동소수점에 동일 동작을 구현한다. (정적 메서드 valueOf 는 Long을 BigIntenger로 변환한다.
자바에서는 객체에 연산자를 사용할수없다. 따라서 큰 숫자를 다룰때는 반드시 메서드를 호출해야한다.)


* 1.5 문자열

문자열 연결

+연산자를 사용해 연결할 수있다. 문자열을 다른 값과 연결하면 연결되는 값이 문자열로 변횐된다. 다만 문자열 연결과 덧셈을 같이 사용할경우 괄호로 묶어 사용해야 오류가 나지 않는다.
여러 문자열 구분자로 결합 ( 배열로 전달해도 된다.)
~~~
String name = String .join("" , "문자열1", "문자열2" ..);
~~~
StringBuilder 를 사용한 많은 문자열 연결
~~~
StringBuilder builder =  new StringBuilder();
while(문자열이 있으면) { builder.appand(다음 문자열); }
String result = builder.toString();
~~~
부분문자열 String.substring(x,y)
메서드 첫번째 인수 : 추출할 문자열의 시작 인덱스
메서드 두번쨰 인수 : 부분 문자열에 포함하지 않을 첫번째 위치. 즉 x부터 y-1까지 추출된다.
문자열 비교 String.equatls(String)
""(빈문자열) 과 null은 다르다. null 인지 검사하려면 == 연산자를 사용한다.
int to String : Integer.toString(n)

* 1.6 입력과 출력

System.out.println을 호출하면 출력이 '표준 출력 스트림'으로 전달되어 터미널에 표시된다.
반면에 '표준입력 스트림'에서 읽기는 그리 쉽지 않다. 표준 입력 스트림에 대응하는 System.in 객체에는 바이트 한개를 읽어오는 메서드만 있기 때문이다.
문자열과 숫자를 읽으려면 System.in 에 연결된 Scanner 를 생성해야 한다.
~~~
Scanner in = new Scanner(System.in);
한줄 읽기(공백 포함) : in.nextLine();
공백으로 구분된 단어 한 개 읽기 : in.nextInt();
~~~
* 1.7 제어 흐름

다중 루프 탈출을 위한 레이블을 붙인 break
빠져나와야 하는 문장 위에 레이블 (labeled) 을 붙이고, break와 그 레이블을 같이 입력하면 된다.
~~~
for( ; ; ) {
    for( ; ; ) {
        ...
        if( ...) **break outer**;
        }
}
~~~
레이블을 붙인 break 는 블록문을 포함해서 어떤 문장의 끝으로든 제어를 이동할 수 있다.
~~~
{
 ...
    { ...
        if( ...) break exit;
    }
    ...
}
~~~
//레이블을 붙인 break 는 이 위치로 건너뛰게 한다.
레이블을 붙인 continue
레이블을 붙인 루프의 다음번 반복으로 건너뛰게한다.

* 1.8 배열과 배열 리스트

자바의 배열 생성
String [] arr = new String[100];
new 연산자로 배열을 생성하면 배열을 기본값으로 채운다.

숫자타입(char 포함)의 배열은 0으로 채운다.
boolean 의 배열은 false 로 채운다.
객체의 배열은 null 참조로 채운다.
배열에 들어갈 값을 미리 알고있을때 , 배열 길이 지정하지 않고 채우기
~~~
int [] arr = new int[]  {1, 2, 3, 4};
~~~
길이가 0인 배열 생성하기
~~~
new int[0] 이나 new int[] {} 으로 생성할수 있다.
길이가 0인 배열은 null 과 다르다. 예를들어 a 가 길이가 0 인 배열이면, a.length() 는 0 이지만, a가 null이면 a.length 는 NullPointerExecption을 일으킨다.
~~~
배열 리스트
배열은 한번 생성하면 절대 길이를 변경할 수 없다. ArrayList 를 사용하면 이 문제를 사용할 수 있다.
ArrayList는 제네릭 클래스, 즉 타입매개변수가 있는 클래스다. 배열리스트 변수를 선언하려면 제네릭클래스 문법을 사용해 <> 안에 타입을 지정해야한다.
~~~
ArrayList<String> lists = new ArrayList<>(); // 또는 new ArrayList<String>();
안타깝게도 배열 리스트용 초깃값 지정 문법은 없다. List.of 는 지정한 요소들로 구성된 수정불가능한 리스트를 반환한다. 이 메소드를 이용해 배열리스트를 생성하는것이 최선이다.
~~~
~~~
ArrayList<String> lists = new ArrayList<>(List.of("hello","world"));
배열리스트에 요소 추가, 제거하기
//lists 끝에 요소 추가하기
lists.add("hi");
//lists 의 n번째 인댁스 앞에 요소 추가하기
list.add(n,"app");
//lists의 n번째 요소 삭제하기
lists.remove(n);
~~~
기본타입의 래퍼클래스
제네릭 클래스는 기본타입을 타입 매개변수로 사용할 수 없다. 그래서 해결책으로 래퍼클래스(wrapper class)를 사용한다.
기본타입에는 각각 대응하는 래퍼클래스가 있다. (Integer, Byte, Character, Boolean ..)
기본타입과 그에 대응하는 래퍼 타입 사이의 변환은 자동으로 일어난다.
래퍼 타입 연산자 비교 주의점
\== , ! = 연산자는 객체의 내용이 아니라 객체 참조를 비교한다. numbers가 ArrayList 일 경우, if ( numbers.get(i) == numbers.get(j) ) 는 인덱스 i와j에 있는 두 숫자가 같은지 검사하지 않는다. 따라서 문자열처럼 래펴 객체로 equals 메서드를 호출해야한다.
향상된 for문
향상된 for루프의 변수는 배열의 인덱스 값이 아니라 요소를 순회한다.
~~~
String [] friedns = new String[100];
for (String name : friedns) {
    System.out.println(name);
}
~~~
배열과 배열리스트 복사
배열 복사
배열 변수를 또 다른 배열로 복사할 수도 있지만 그렇게하면 두 변수가 같은 배열을 참조하게 된다.
~~~
int [] numbers = primes;
numbers[5]=42; // 이제 primes[5] 도 42다.
~~~
이런 공유를 원치 않는다면 Arrays.copyOf 메서드를 통해 배열의 사본을 만들어야 한다.
이 메서드는 새 배열을 원하는 길이로 생성하고 원본 배열의 요소를 복사한다.
int [] copiedPrimes = Arrays.copyOf(primes, primes.length);
배열 리스트 복사
배열리스트 참조도 배열과 동일한 방식으로 작동한다.
배열리스트를 참조하지 않고 복사하려면 기존 배열리스트에서 새 배열리스트를 생성해야한다.
배열을 배열리스트에 복사할때도 이 생성자를 사용할 수 있다.
~~~
ArrayList<String> copiedFriends = new ArrayList<>(friends);
//배열을 배열리스트에 복사하기
String [] names = ...;
ArrayList<String> friends = new ArrayList<>(List.of(names));
//배열리스트를 배열에 복사하기
String [] names = friends.toArray(new String[0]);
~~~
배열 알고리즘
Arrays 와 Collections 클래스는 배열과 배열리스트에서 자주 사용하는 알고리즘을 구현한다.

채우기
~~~
Arrays.fill(numbers, 1); //int [] 배열
Collections.fill(friedns, ""); //ArrayList<String>
정렬
Arrays.sort(numbers); //int [] 
Collections.sort(friedns); //ArrayList<String>
명령줄 인수
모든 자바의 main 메서드는 문자열의 배열을 매개변수로 받는다.
~~~
public static void main**(String[] args)**
프로그램을 실행하면 매개변수가 명령줄에서 지정한 인수들로 설정된다.

다차원 배열

자바에는 진정한 다차원 배열이 없다. 대신 배열의 배열로 다차원배열을 구현한다.
~~~
int [][] square = new int[4][4]; // 행,열 순서
~~~
행 배열의 길이가 꼭 같아야 하는것은 아니다.
n 행으로 구성된 배열을 먼저 생성하고, 루프 안에서 각행을 따로 만들면 된다.
~~~
배열 모양
1
1 2
1 2 3 
..
~~~

~~~
int [][] triangle = new int[n][]; //n은 상수
for(int i=0; i<n;i++) {
    triangle[i] = new int[i+1];
    for(int j=0 ;j<i+1;j++)
        triangle[i][j]=j+1;
}
~~~
디버깅용으로 2차원 배열의 요소 목록 출력하기
~~~
System.out.println(Arrays.deepToString(triangle));
~~~

* 1.9 기능적 분해

main 메서드가 길어질 때는 프로그램을 여러개 클래스로 분해하는것이 좋다. 하지만 간단한 프로그램이라면 코드를 동일한 클래스 안에서 여러 메서드로 나누어도 된다.
이런 메서드는 main 메서드와 마찬가지로 static 제어자로 선언해야한다. (2장에서 그 이유가 나온다.)
정적 메서드 선언 및 호출
~~~
public static double average(double x, double  y) {
    double sum = x + y;
    return sum / 2;
}
~~~
배열 매개변수와 반환값
배열을 메서드에 전달할 수도 있다. 배열참조의 원리로, 메서드는 배열에 대한 참조를 받아, 전달받은 배열을 변경할 수 있다.
//배열 안의  두 요소 바꾸기
~~~
public static void swqp(int [] values, int x, int y) {
    int temp = values[x];
    values[x] = values[y];
    values[y]=temp;
}
~~~
가변 인수
호출하는 쪽에서 인수를 원하는 개수만큼 넘길수 있게하는 메서드도 있다. 여러개 인수를 넣거나 배열로 전달해도 된다.
~~~
public static double average(double ... values) {
    double sum = 0;
    for( double v : values) sum +=v;
    return values.length ==0 ? 0 : sum/values.length;
}
~~~
가변 매개변수는 반드시 매서드의 마지막 매개변수로 구현해야한다.


## 2.객체 지향 프로그래밍
 * 2.1 객체사용
 
객체마다 자신만의 상태가 있다. 이상태는 메서드를 호출해서 얻은 결과에 영향을 준다.

예를들어 in이 Scanner의 객체일 때 in.next()를 호출하면 in 객체는 이전에 무엇을 읽었는지 기억하고 다음 입력 토큰을 준다.

다른 사람이 구현한 객체의 메서드를 호출할 때는 내부에서 무슨 일이 일어나는지 몰라도 된다.

이원칙을 캡슐화 라고 하는데, 이는 객체 지향 프로그래밍의 핵심 개념이다.

호출되는 객체를 변경하는 메서드를 변경자라고 하며, 객체를 변경하지 않는 메서드를 접근자라고 한다.

 * 2.2 클래스 구현
 
 자바에서는 인스턴스 변수로 객체의 상태를 나타낸다. 
 
 메서드를 선언할 때는 메서드 이름, 매개변수의 타입과 이름, 반환 타입을 지정해야 한다. 이것을 메서드 헤더라고 부른다
 ~~~
 public void raiseSalary(double byPercent)
 이 메서드는 double 타입 매개변수를 한 개 받고, (반환 타입이 void이므로) 어떤값도 반환하지 않는다.
 getName 메서드는 시그너처가 다르다.
 public String getName()
 이 메서드는 매개변수가 없고 String을 반환한다.
 ~~~
 
 메서드 헤더 다음에는 바디(몸체)를 작성한다.
 ~~~
 public void raiseSalary(double byPercent){
    double raise = salary * byPercent / 100;
    salary += raise;
 }
 
 메서드에서 값을 돌려줄 때는 return 키워드를 사용한다.
 
 public String getName() {
    return name;
 }
 
 메서드 선언은 클래스 선언 안에 넣어야 한다.
 
 public class Employee {
    private String name;
    private double salary;
    
    public void raiseSalary(double byPercent){
        double riase = salary*byPercent / 100;
        salary += raise;
        }
 {}안에 들어가는 것이 바디(몸체)이다.
 ~~~
 
 메서드 호출
 
 ~~~
 fred.raiseSalary(5);
 
 이 호출에서 인수 5는 raiseSalary의 매개변수인 byPercent를 초기화하는 데 사용되는데, 다음과 같은 할당에 해당한다.
 
 double by Percent = 5;
 
 이후 다음 동작이 일어난다.
 
 double raise = fred.salary * byPercent / 100;
 fred.salary += raise;
 
 인스턴스 변수 salary는 메서드 호출에 사용한 인스턴스에 적용된다.
 ~~~
 
  raiseSalary 메서드는 클래스의 인스턴스에서 작동한다, 이런 메서드를 인스턴스 메서드라고한다. 자바에서 static으로 선언하지 않은 메서드는 모두 인스턴스 메서드다.
  
  코드에서 볼 수 있듯이 raiseSalary 메서드에는 값이 두 개 전달된다.
 
 객체의 메서드를 호출 할 때 해당 객체가 this로 설정된다. 원한다면 메서드를 구현 할 때 this 참조를 사용해도 된다.
 
 ~~~
 public void raiseSalary(double byPercent){
  double raise = this.salary * byPercent / 100;
  this.salary += raise;
  }
  
지역 변수와 인스턴스 변수를 명확히 구별하려고 이 스타일을 선호한다.(raise 는 변수고 salary는 인스턴스 변수라는 사실이 명확해졌다)  
 ~~~
 
흔히 매개변수 이름을 인스턴스 변수와 다르게 지정하고 싶지 않을 때 this 참조를 사용한다.
~~~
public void setSalary(double salary){
  this.salary = salary;
}

인스턴스 변수와 지역변수의 이름이 같을 때 salary처럼 한정하지 않은 이름은 지역 변수를 나타내고, this.salary는 인스턴스 변수를 나타낸다.
~~~

메서드에 객체를 전달하면 해당 메서드는 객체 참조의 사본을 얻는다. 메서드는 이 참조로 매개변수 객체에 접근하거나 매개변수 객체를 변경 할 수 있다.

~~~
public class EvilManager{
private Random generator;

...
public void giveRandomRaise(Employee e){
  double percentage = 10 * generator.nextGaussian();
  e.raiseSalary(percentage);
  }
}

다음과 같이 호출한다고 하자.

boss.giveRandomRaise(fred);
그러면 fred를 e 매개변수로 복사한다. giveRandomRaise 메서드는 두 참조가 공유하는 개체를 변경한다.
~~~

자바에서는 기본 타입 매개변수를 업데이트하는 메서드를 작성할 수 없다.
~~~\
double 값을 증가사키는 메서드는 의도한 대로 작동하지 않는다.
public void increaseRandomly(double x) {
  double amount = x*generator.nextDouble();
  x += amount; 
 }
 // 의도한대로 작동x
~~~

하지만

~~~
boss.increaseRandomly(sales);
~~~
그러면 sales가 x로 복사된다. 다음으로 x를 증가시키지만 sales는 변하지않는다. 이후 매개변수는 유효 범위를 벗어나고 증가 연산은 효력을 잃는다

같은 이유로 객체참조를 다른 것으로 바꾸는 메서드도 작성할 수 없다.

~~~ 
  public class EvilManager {
 ...
  public void replaceWithZombie(Employee e){
    e = new Employee("" , 0);_
    }
 }
~~~
다음과 같이 호출하면 fred가 e 변수로 복사된다
~~~
boss.replaceWithZombie(fred);
~~~
그런 다음 e는 다른 참조로 설정된다. 메서드가 끝날 때 e는 유효 범위를 벗어난다. 결국 fred는 어디서도 변경 되지 않는다.


* 2.3 객체 생성

생성자 선언 방법은 메서드 선언 방법과 비슷하다. 하지만 생성자는 이름이 클래스와 같고, 반환타입이 없다.

~~~
public Employee(String name, double salary) {
  this.name = name;
  this.salary = salary;
}
~~~
생성자는 new 연산자를 사용한 시점에서 실행된다.
~~~
new Employee("이름", 급료)
~~~
이 표현식은 먼저 Employee 클래스의 객체를 할당한 후 생성자 바디를 호출한다. 

그리고 생성자 바디는 생성자에 전달된 인수로 인스턴스 변수를 초기화한다.

new 연산자는 생성된 객체의 참조를 반환한다. 

또는 메서드에 전달하기도 한다.
~~~
ArrayList<Employee> staff = new ArrayList<>();
staff.add(new Employee("이름", 급료));
~~~

생성자는 두 가지 이상의 버전으로 제공할 수 있다. 예를 들어 이름이 없는 직원을 쉽게 모델링하려면 급여만 매개변수로 받는 두 번째 생성자를 작성한다.

~~~
public Employee(double salary){
  this.name = "";
  this.salary = salary;
}
이제 Employee 클래스에는 생성자가 두 개다. 호출되는 생성자는 인수에 따라 결정된다.
Employee james = new Employee("이름", 급료1);
Employee anonymous = new Employee(급료2);
// 이때 해당 생성자가 오버로드 되었다고 한다.
~~~

비슷한 작업을 수행하는 생성자가 여러 개 있다면 코드 중복을 제거 하는것이 좋다.

공통된 초기화 작업은 대체로 생성자 하나에 몰아넣을 수 있다.

또 다른 생성자에서 어느 한 생성자를 호출할 수 있는데, 호출하는 쪽 생성자의 바디의 첫 번째 문장으로만 허용한다.

이때 호출할 생성자는 이름이 아니라 this 키워드를 사용한다.( 이 때 this 는 객체 참조가 아니다, 같은 클래스에 속한 다른 생성자를 호출할때 사용하는 문법임)
~~~
public Employee(double salary){
  this("", salary); // Employee(String, double)을 호출한다. // 이후 다른 문장이 올 수 있다.
}
~~~

인스턴스 변수를 최종으로 선언 할 수 있다. 최종으로 선언한 변수는 생성자 실행이 끝나기 전에 초기화 해야 한다. 초기화 한 후에는 해당 변수를 수정 할 수 없다.

~~~
public class Employee {
  private final String name;
  ...
  // Employee 클래스의 name 변수는 객체를 생성한 후에는 절대 변하지 않으므로 setName 메서드가 없다.
}
~~~

 * 2.4 정적 변수와 정적 메서드
 
 클래스 안에 변수를 static으로 선언하면 해당 변수는 클래스당 하나만 존재한다. 반면에 각 객체에는 자체적인 인스턴스 변수의 사본이 들어있다.
 ~~~
 public class Employee {
  private static int lastId = 0;
  private int id;
  ...
  public Employee() {
    lastId++;
    id = lastId;
  }
 }
 // 모든 Employee 객체는 인스턴스 변수인 id를 각각 보유한다. 하지만 lastId 변수는 오직 하나다. 이 변수는 클래스의 특정인스턴스가 아니라 클래스 자체에 속한다
 ~~~
 
 정적 변수를 선언하면서 초기화 했다. 하지만 초기화 작업이 추가로 필요할 때도 있다.
 이럴 경우 정적 초기화 블록안에 초기화 작업을 넣으면 된다.
 ~~~
 public class CreditCardForm{
  private static final ArrayList<Integer> expirationYear = new ArrayList<>();
  static { // 정적 초기화 블록
  int year = LocalDate.new().getYear();
  for (int i =year; i <=year + 20; i++){
      expirationYear.add(i);
    }
  }
 }
 ~~~
 
 * 2.5 패키지
 
 클래스 임포트
 
 import 문을 사용하면 전체 이름을 쓰지 않아도 클래스를 이용할 수 있다.
 ~~~
 import java.util.Random;
 ~~~
 
 
 * 2.6 중첩 클래스
 
 클래스를 다른 클래스 내부에 두는 방법을 중첩클래스라고 한다.
 
 작동방식이 다른 중첩클래스가 두가지가 있다.
 
 정적 중첩 클래스
~~~
public class Invoice { // 물품의 비용을 청구하는 Invoice 클래스 , Item을 중첩클래스로 만든다.
    private static class Item { // Invoice 내부에 Item에 중첩했다 , Item은 오직 Invoice의 메서드에서만 접근할 수 있다.
        String description;
        int quantity;
        double unitPrice;
        
        double price() { return quantity * unitPrice;}
    }
    private ArrayList<Item> items = new ArrayList<>();
    ...
    }
 ~~~
 
내부클래스의 객체를 생성하는 메서드

~~~
public class Invoice {
...
    public void addItem(String description, int quantity, double unitPrice){
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
        }
    }

}
~~~

## 3.인터페이스와 람다 표현식

* 3.1 인터페이스

단일 메커니즘만 구현하고 이 메커니즘을 클래스간 사용 할 수 있게만들어주는 것이 인터페이스다.
~~~
메서드 헤더를 가진 인터페이스를 선언
public interface IntSequence {
    boolean hasNext(); // 기본구현을 작성하지 않고 선언만 한 메서드를 추상메서드라한다.
    int next();
}
~~~

인터페이스를 사용하려면 구현을 해야한다.

~~~
public class SquareSequence implements IntSequence {
    private int i;
    
    public boolean hasNext(){
        return true;
    }
    
    public int next(){
        i++;
        return i*i;
    }
}
~~~

인터페이스 타입으로 변환
~~~
IntSequence digits = new DigitSequence(1729);
double avg = average(digits, 100);
// digits의 타입은 DigitSequnece가 아니라 IntSequence다.
IntSequnece 타입 변수는 IntSequence 인터페이스를 구현한 어떤 클래스의 객체라도 참조할 수 있다.

~~~

T타입의 모든 값을 변환 없이 S 타입의 변수에 할당할 수 있다면 S타입은 T타입의 슈퍼 타입이다
IntSequence 인터페이스는 DigitSequence 클래스의 슈퍼타입이다.

가끔 반대로 변환(슈퍼타입 -> 서브타입)으로 변환 해야할 때도 있다. 이때는 캐스트(강제변한)을 이용하면 된다.

~~~
IntSequence sequence = ...;
DigitSequence digits = (DigitSequence) sequence; 
System.out.println(digits.rest()); //rest()는 DigitSequence의 메서드이므로 캐스트가 필요하다, IntSequence로
~~~

하지만 잘못 캐스트하면 컴파일 시간 오류나 클래스 캐스트예외가 일어난다.

이것을 방지하기 위해선 instanceof 연산자로 검사해야한다.

인터페이스는 확장(extend)긴으을 제공할수 있다.
~~~
public interface Channel extends Closeable{
    boolean isOpen();
}
~~~

* 3.2 인터페이스의 정적 메서드, 기본 메서드, 비공개 메서드

인터페이스에서는 정적 메서드(static~)인 digitsof를 둘 수 있다.
~~~
public interface IntSequence {
...
    static IntSequence digitsOf(int n){
        return new DigitSequence(n);
    }
}
~~~

인터페이스에 있는 어느 메서드에서든 기본구현을 작성 할 수 있다. 반드시 defalt 제어자를 붙어여햔다

~~~
public interface IntSequence {
    default boolean hasNext() {return true;}
    int next();
}
~~~

비공개 메서드는 static이나 인스턴스 메서드는 될 수 있지만 , default 메서드는(오버라이드 가능) 될 수 없다.

비공개 메서드는 인터페이스 자체에 있는 메서드에서만 쓸 수 있으므로, 인터페이스 안에 있는 다른 메서드의 헬퍼 메서드로만 사용 할 수 있다.

* 3.3 인터페이스의 예

Comparable 인터페이스, 어떤 클래스의 객체를 정렬하려면 Comparable 인터페이스를 구현해야한다.

Comparable 인터페이스는 타입 매개변수를 받는다, 정렬할때 문자열 대 문자열(String), 직원대 직원 식으로 비교하기 때문에

Comparator 인터페이스, 길이가 증가하는 순서로 비교한다. Arrays.sort 메서드를 이용해 배열과 비교자를 매겨변수로 받는다.

Runnable 인터페이스, 특정 일을 정의하려면 Runnable 인터페이스를 구현해야한다. 이 인터페이스에는 메서드가 한 개만 있다.

사용자 인터페이스, 임의의 액션을 취해 미리 지정해둔 코드를 역으로 호출시키는 것.

* 3.4 람다 표현식

람다표현식은 나중에 한 번 이상 실행할 수 있게 전달하는 코드블록.

자바에 함수 표현이 없는 대신에 객체(특정 인터페이스를 구현하는 클래스의 인스턴스)로 함수를 표현한다. 람다표현식은 이런 인스턴스를 생성한다.

람다 표현식에 매개변수가 없으면 매개변수가 없는 메서드처럼 빈 괄호를 붙여야한다.
~~~
Runnable task = (매개변수 x 빈칸유지) -> {for (int i = 0; i < 1000; i++) doWork(); }
~~~

람다 표현식은 단일 추상 메서드를 가진 인터페이스(추상 메서드가 한 개만 있는 인터페이스) 자리에 사용 할 수 있다.

이런 인터페이스를 함수형 인터페이스라고 한다.
~~~
Arrays.sort(words, (first, second) -> first.length() - second.ength());
~~~
내부에서 Arrays.sort 메소드의 두 번째 매개변수는 Comparator<String> 을 구현한 클래스의 객체를 받는다.

함수 리터럴을 지원하는 거의 모든 프로그래밍 언어에서 (String, String) -> int 처럼 함수 타입을 선언하고, 이 함수 타입으로 변수를 선언한 후 함수를 변수에 저장해 호출할 수 있다.

하지만 자바에서는 이 중 하나만 람다 표현식으로 할 수 있다. 

람다 표현식을 함수형 인터페이스 타입 변수에 저장해서 해당 인터페이스의 인스턴스로 변환하는 것이다.

* 3.5 메서드 참조와 생성자 참조

String::compareToIgnoreCase는 람다 표현식(x,y) -> x.compareToIgnoreCase(y)에 대응하는 메서드 참조다.

:: 연산자는 클래스 이름과 메서드 이름을 분리하거나 객체의 이름과 메서드 이름을 분리한다

~~~
Class::instanceMethod -> x.compareToIgnoreCase(y) // 첫번째 매개변수가 메서드의 수신자가 되고, 나머지 매개변수는 메서드에 전달한다
Class::staticMethod -> Objects.isNull(x) // 모든 매개변수가 정적 메서드로 전달된다
object::instanceMEthod -> System.out.println(x) // 주어진 객체로 메서드를 호출하여, 매개변수는 인스턴스 메서드로 전달된다.
~~~

* 3.6 람다 표현식 처리

람다를 사용하는 핵심 목적은 지연실행이다.

~~~
repeat(10, () -> System.out.println("안녕"));
public static void reapat(int n , Runnable action){ //Runnable 인터페이스 이용
    for(int i = 0; i < n; i++) action.run(); // 람다표현식의 바디는 action.run()이 호출될때 실행
}
~~~

* 3.7 람다표현식과 변수 

    람다 표현식 바디의 유효범위는 중첩블록의 유호범위와 같다
    
    그러므로 람다 안에 지역변수와 이름이 같은 매개변수나 다른 지역변수를 선언하는 것은 규칙에 어긋난다

~~~
int first = 0;
Comparator<String> comp = (first, second) -> first.length() - second.length();
// 오류 - first 변수를 0이라고 이미 정의해서...

    또한 같은 두 지역변수를 함께 둘 수 없다. 따라서 람다 표현식에도 이름이 같은 지역 변수를 두 개 둘 수 없다.
    
    람다 표현식 안에 있는 this 키워드는 해당 람다 표현식을 생성하는 메서드의 this 매개변수를 의미한다.
    
    public class Application(){
        public void doWork(){
            Runnable runner = () -> {...; Systme.out.println(this.toString()); ...};
        }
 }       
~~~
표현식 this.toString()은 인스턴스가 아니라 Application 객체의 toString 메서드를 호출한다

람다 표현식 안에서 this를 사용한다고 해서 의미는 없다, 람다 표현식 범위는 doWork 메서드 안에 중첩 됨으로 this는 메서드 내부에서 의미가 같다.

~~~
public static void repeatMessage(String text, int count){
    Runnable r = () -> { // 람다식이 자신을 감싸는 유효 범위에 정의된 매개변수 text,count에 접근한다
        for (int i = 0; i <count; i++){
            System.out.println(text);
            }
        };
            new Thread(r).start();
            repeatMessage("안녕", 1000);        
 }
~~~
   
   람다 표현식은 3가지로 구성된다
    
  코드블록, 매개변수, 자유변수들의값(자유변수는 매개변수가 아니며 직접 선언한 것도 아닌 변수)
  위 코드는 text,count란 자유변수 사용(반드시 변 수 값 저장되야됨, 람다식 표현하려면 -> 람다식이 캡처했다)
  람다식에서는 값이 변하지 않는 변수만 캡쳐 가능하다. 
  그래서 변수가 아니라 값을 캡쳐한다고 하는것 
 
    for (int i =0; i < n; i++){
        new Thread( () -> System.out.println(i) ).start();
      } // i를 캡쳐 할 순 없다. 값이 변하는 변수라서
      
   따라서 람다표현식은 자신을 감싸는 유효 범위에 속한 사실상 최종 지역 변수(final)에만 접근 가능하다.
 

   * 3.8 고차함수
    
   함수를 처리하거나 반환하는 함수를 고차함수라 한다.
   람다 표현식은 함수형 인터페이스로 변환 가능하다
    
    
   * 3.9 지역 클래스와 익명 클래스
    
   메서드 안에서 클래스를 정의 할 수 있다. 이것이 지역(로컬)클래스 이다.
    
   클래스를 지역클래스로 만들면 클래스이름이 메서드의 유효 범위 안에 숨는다. 그리고
    
   람다 표현식의 변수처럼 지역 클래스의 메서드 안에서 자신을 감싸는 유효 범위에 속한 변수에 접근이 가능하다.
 
## 4.상속과 리플렉션

* 4.1 클래스 확장
    ~~~
    public class Manager extends Employee {
        추가된필드
        추가된 메서드 또는 슈퍼클래스의 메서드를 오버라이드하는 메서드
    }
    ~~~
    
   extends 키워드는 기존 클래스에서 파생된 새 클래스를 만든다는 것.
   
   이때 기존 클래스를 슈퍼클래스(Employee), 새클래스를 서브 클래스(Manager)라고 한다.
   
   서브클래스에서 슈퍼클래스 메서드를 수정 할 때도 있다.
   
   ~~~
   public class Manager extends Employee {
   ...
    public double getSalary(){ // 슈퍼클래스의 메서드를 오버라이드 한다.
        return super.getSalary() + bonus; //getSalary는 직원의 총급여를 보고하는 메서드
    }
   }
    ~~~
    상속받은 getSalary 메서드로는 Manager 클래스로 나타내는 관리자의 급여를 계산 못하기때문에
    
    Manager 클래스에서 getSalary 메서드를 오버라이드해서 이 메서드가 기본 급여와 상여금의 합을 반환하게 한다.
    
    ~~~
    public class Manager extends Employee {
    ...
        public boolean worksFor(Manager supervisor){
        ...
        }
    }
        @Override public boolean worksFor(Employee suprervisor)
    ~~~
    
  @override 애너테이션을 붙이면 새 메서드를 정의했을때 오류를 막을 수 있다.
  
  
    ~~~
    public class Employee {
    ...
        public final String getName() {
            return name;
        }
    }
    ~~~
    
    메서드를 final로 선언하면 어느 서브클래스도 해당 메서드를 오버라이드 할 수 없다.
    
    ~~~
    public abstract class Person { // abstract 추상메서드
        private String name;
        
        public Person(String name) { this.name = name;}
        public final STring getName() { return name; }
        
        public abstract in getId();
    }
    ~~~
    
    클래스는 구현이 없는 메서드를 선언해 섭클래스가 해당 메서드를 구현하도록 강제할수 있다.(추상 메서드)
    
    추상클래스는 인스턴스를 생성할 수 없다. 그러나 인스턴스 변수와 생성자를 포함 할 수 있다.
    
    ~~~
    ArrayList<String> names = new ArrayList<String>(100){
        public void add(int index, String element) {
            super.add(index, element);
            System.out.printf("Adding %s at #d\n", element, index);
            } // 슈퍼클래스 이름 뒤에 오는 괄호 안 인수는 슈퍼클래스 생성자에 전달된다. 여기서는 ArrayList<String>의 익명 서브클래스를 생성하면서 add 메서드를 오버라이드했다.
            // 인스턴스 초기 용량은 100으로 설정된다.
     };
    ~~~
   
    슈퍼클래스를 확장하는 익명 클래스도 만들 수 있다. 익명 서브클래스는 디버깅에 유용하다.
    
    ~~~
    ArrayList<String> friends = new ArrayList<>();
    friends.add("Harry");
    friends.add("Sally");
    invite(friends);
    invite(new ArrayList<String>() {{ add("Harry"); add("Sally"); }});
    ~~~
    
    이중 중괄호 초기화는 내부 클래스 문법을 약간 특이하게 사용한다. 
    
    바깥중괄호는 ArrayList<String>의 익명 서브클래스를 만든다. 안쪽 중괄호는 초기화 블록 이다.
    
    ~~~
    public interface Named{
        default String getName() { return ""; }
    }
    
    public class Person {
    ...
    public STring getName() { return name; }
    }
    
    public class student extends Person implements Named {
    ...
    }
    ~~~
    
    클래스와 인터페이스에 있는 메서드의 이름이 같은 경우, 항상 슈퍼클래스 구현이 인터페이스 구현보다 우선된다.
    
    ~~~
    public class Worker {
        public void work() {
            for (int i = 0; i > 100; i++) System.out.println("Working");
            }
        }
    public class ConcurrentWorker extends Worker {
        public void work(){
            Thread t = new Thread(super::work);
            t.start();
            } // ConcurrentWorker의 work 메서드는 run 메서드에서 슈퍼클래스(Worker)의 work 메서드를 호출하는 Runnable로 스레드를 생성한다.
       }
    ~~~
    
    Object::instanceMethod 형태로 사용할 수 있다. 이때 객체 참조 대신 super를 사용 할 수 있다.
    
    * 4.2 Object: 보편적 슈퍼클래스
    
    자바에서 모든 클래스는 직간접적으로 Object 클래스를 확장한다. 클래스에 명시적인 슈퍼클래스가 없으면 암시적으로 Object를 확장한다.
    
    toString 메서드는 객체의 문자열 표현을 반환해준다
    ~~~
    public String toString(){
        return getClass().getName() + "[name=" + name + ",salary=" + salary + "]";
        }
    ~~~
    
    toString 메서드는 주로 클래스 이름 뒤에 인스턴스 변수 목록을 대괄호([])로 감싸서 나열한다
    
    equals 메서드는 한 객체가 다른 객체아 동등한지 검사한다.
    
    ~~~
    public class Item {}
        private String description;
        private double pice;
        ...
        public boolean equals(Object otherObject){
        // 두 객체가 동일한지 알아보는 빠른검사
        if (this == otherObject) return true;
        
        // 매개변수가 null이면 false를 반환해야 한다.
        if (otherObject == null) return false;
        // otherObject가 Item의 인스턴스인지 검사한다.
        if (getClass() != otherObject.getClass()) return false;
        // 인스턴스 변수들의 값이 도일한지 검사한다.
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description)
            && price == other.price;
            }
           
           public int hasCode() {...} 
           
        }
    ~~~
          
    equals 메서들 구현할 때 거쳐야하는 단계
    
    1. 일반적으로 동등한 객체느 동일하며, 검사 비용이 적게든다
    
    2. 모든 equals 메서드는 null과 비교하면 false를 반환해야한다
    
    3. equals 메서드는 Object.equals를 오버라이드하므로 매개변수의 타입은 Object이다.
      
       따라서 인스턴스 변수를 조사할 수 있도록 실제 타입으로 캐스트해야한다. 캐스트 하기 전에 getClass 메서드나 instanceof 연산자로 타입 검사를 수행한다.
       
    4. 마지막으로 인스턴스 변수를 비교한다. 기본 타입은 == 연산자로 비교한다  
   

    hasCode 메서드는 
    
    
