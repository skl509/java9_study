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
          
    equals 메서드를 구현할 때 거쳐야하는 단계
    
    1. 일반적으로 동등한 객체느 동일하며, 검사 비용이 적게든다
    
    2. 모든 equals 메서드는 null과 비교하면 false를 반환해야한다
    
    3. equals 메서드는 Object.equals를 오버라이드하므로 매개변수의 타입은 Object이다.
      
       따라서 인스턴스 변수를 조사할 수 있도록 실제 타입으로 캐스트해야한다. 캐스트 하기 전에 getClass 메서드나 instanceof 연산자로 타입 검사를 수행한다.
       
    4. 마지막으로 인스턴스 변수를 비교한다. 기본 타입은 == 연산자로 비교한다  
   

    해시코드(hasCode) 는 객체에서 파생한 정수 값이다. 해시 코드는 중복되지 않게 잘 뒤섞여 있어야한다.
    
    ~~~
    class Item{
    ...
    public int hashCode() {
        return Objects.hash(description, price);
        }   
    }
    ~~~
    hashCode 메서드 안에서 인스턴스 변수의 해시 코드를 단순히 결합하면 된다. 
    
    가변 인수 메서드 Objects.hash는 인수들의 해시 코드를 계싼해 결합한다. Objects.hash 메서드는 널에 안전하다.
    
    
    * 4.3 열거
    
    열거 타입의 각 인스턴스는 유일하므로 열거 타입 값에 equals 메서드를 사용할 필요가 전혀없다. 열거 타입 값을 비교할 때는 그냥 ==를 사용한다.
    
    원한다면 열거 타입에 생성자, 메서드, 필드를 추가 할 수 있다.
    
    ~~~
    public enum Size{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    
    private String abbreviation;
    
    Size(String abbreviation) {
        this.abbriation = abbreviation;
    }
    public String getAbbreviaton() { eturn abbreviation;}
    }
    ~~~
    
    enum 인스턴스 각각에 메서드를 추가 할 수 있찌만, 열거에 정의된 메서드를 오버라이드하는 것이어야한다.
    ~~~
    public enum OPeration {
    ADD {
        public int eval(int arg1, int arg2) { return arg1 + arg2; }
    },
        SUBTRACT {
           public int eval(int arg1, int arg2) { return arg1 - arg2;}
    }.
        MULTIPLY {
           public int eval(int arg1, int arg2) { return arg1 * arg2;}
    },
        DIVIVDE {
            public int eval(int arg1, int arg2) { return arg1 / arg2;}
    },
        public abstract int eval(int arg1, int arg2);
        Operation op = ...;
        int result = op.eval(first, second);
    }
    ~~~
    계산기 프로그램의 루프에서는 사용자 입력에 따라 이 값중 하나를 변수에 설정한 후 eval을 호출하면 된다.
    
    열거에는 정적 멤버를 넣을 수 있다. 하지만 생성 순서에 주의해야 한다.
    ~~~
    public enum Modifier {
        PUBLIC, PRIVATE, PROECTED, STATIC, FINAL, ABSTRACT;
        private static int maskBit = 1;
        private int mask;
        Modifier() {
            mask = maskBit; // 오류 - 생성자에서 정적 변수에 접근할 수 없다.
            maskBit *= 2;
            }
            ...
    }
    ~~~
    
    해결방안은 블록 초기화다
    
    ~~~
    public enum Modifier {
          PUBLIC, PRIVATE, PROECTED, STATIC, FINAL, ABSTRACT;
          private int mask;
          
          static { // 정적 초기화 블록에서 초기화 해준다...
            int maskBit =1;
            for (Modifier m : Modifier.values()) {
                m.mask = maskBit;
                maskBit *= 2;
                }
            }
                ...
        }
    ~~~
  열거 상수가 생성되고 나면 정적 변수 초기화와 정적 초기화 블록이 평소처럼 위쪽에서 차례로 실행된다.
  
  
  
  
  * 4.4 실행 시간 타입 정보와 리소스
  
  자바에서 배열은 클래스이지만 인터페이스, 기본타입, void는 클래스가 아니다. 따라서 Class라는 명칭은 부적절하니 Type이라 표현해야한다.
  
  * 4.5 리플렉션
  
    리플렉션은 객체-관계 매퍼나 gui 빌더 같은 도구를 구현할때 유용하다.
    
    java.lang.reflect 패키지에 속한 Field, Method, Constructor 클래스는 각각 클래스의 필드, 메서드, 생성자를 나타낸다.
  
    위의 세 클래스의 get을 붙여 사용하는 메서드는 각각 공개필드, 메서드, 생성자의 배열을 반환한다.
    
    이 배열에는 상속받은 공개 멤버도 포함된다.
    
    위의 세클래스의 getDeclared를 붙여 사용하는 메서드는 각각 해당 클래스에 선언된 모든필드, 메서드, 생성자로 구성된 배열을 반환한다.
    
    이 배열에는 비공개와 패키지, 보호 멤버까지 포함되지만 슈퍼클래스의 멤버는 포함되지 않는다.
    
    많은 객체 지향 프로그래밍 언어에서 프로퍼티를 지원하며, 해당 프로퍼티를 읽는지 쓰는지에 따라 표현식 object.propertyName을 게터나 세터 메서드 호출로 매핑한다.
    
    자바에는 이런 문법이 없지만 프로퍼티가 게터/세터 쌍에 대응하는 규약이 있다.
    
    자바빈은 인수없는 생성자, 게터/세터쌍, 기타 메서드로 구성된 클래스를 의미한다.
    
    게터와 세터는 반드시 정해진 패턴을 따라야 한다.
    
    ~~~
    public Type getProperth()
    public void setProperty(Type newValue)
    ~~~
    
    게터나 세터를 생략해서 쓰기전용이나 읽기 전용 프로퍼티를 만들 수 있다
    
    프로퍼티 이름은 get/set 다음에 오는 접미어를 소문자로 바꾼 형태이다.
    
    getSalary/setSalary 쌍은 salary라는 프로퍼티를 만들어야한다. 하지만 접미어의 처음 두글자가 대문자면 그대로 대문자를 써준다.
    
    
    ## 5.기본 프로그래밍 구조
    
   * 5.1 예외 처리
   
   메서드에서 해야 할일을 할 수 없는 상황이 발생하면, 메서드에서 오류 코드를 반환해야한다.
   
   오류코드 반환은 효율적이지 않음으로 자바에서는 예외 처리를 지원하므로 메서드에서 예외를 던지는 방법으로 심각한 문제를 알릴수있다.
   
   ~~~
   public static int randInt(int low, int high){
    return low + (int) (Math.random() * (high - low + 1));
   }
   if(low > high)
    throw ne IllegalArgumentException(
        String.format("low should be <= high but low is %d and high is %d", low, high));
   ~~~
   randInt(10,5) 를 호출하면 오류 발생이다. 그러니 throw 문을 실행 시켜서 randInt 메서드 실행을 멈추고 호출하는 쪽에 값을 반환하지 않는다.
   
   프로그래머가 보고하는 예외는 Exception 클래스의 서브클래스다
   
   비검사예외(unchecked excepiton)의 서브클래스이고 다른 예외는 모두 검사 예외(checked exception)이다.
   
   ~~~
   public class FileFormatException extends IOException {
    public FileFormatException() {}
    public FileFormatException(String message) {
        super(message);
    }
  /// 연쇄된 예외용 생성자도 추가한다...
  }
   ~~~ 
  많은 예외 클래스 중에 상황에 맞는 예외 클래스를 사용한다.
  
   메서드 헤더에 검사 예외 선언을 해야한다.
   ~~~
  public void write(Object obj, String filename)
    throws IOException, ReflectiveOperationException //메서드 헤더에 thorow 문 쓰기
    ~~~
    
    메서드에서 throw 문을 사용하기 위해서든, throws 절이 있는 또 다른 메서드를 호출하기 위해서든 해당 메서드가 던질 수 있는 예외를 모두 나열해야한다.
    
    메서드를 오버라이드 할 때 슈퍼클래스 메서드에서 선언한 예외보다 광범위한 검사 예외는 던질 수 없다.
    
    ~~~
    public void write(Object obj, String filename)
        throws FileNotFoundException
    ~~~
    
    write 메서드를 오버라이드 할때, 그 메서드에서는 그보다 범위가 좁은 예외만 던질 수 있다.
   
   예외 잡기를 할려면 try 블록을 사용해야한다.
   
   ~~~
   try{
    statements
    } catch (ExceptionClass ex){
        handler
        }
    ~~~
    
    try 블록에 들어있느 statements를 실행하다가 주어진 예외클래스가 일어나면 제어가 handler로 이동한다.
    
    이 구조를 2가지로 바꿀 수 있다.
    
    ~~~
    1.
    try {
        statements
        } catch (ExceptionClass1 ex){
            handler1
            } catch (ExceptionClass2 ex){
                handler2
                } catch (ExceptionClass3 ex){
                    }
     ~~~
     catch 절 부터 일치하는 예외 타입을 찾고 없으면 내려온다, 위쪽 부터 가장 상세한 예외클래스를 배치한다
    
     ~~~
      2.
      try {
        statements
        } catch (ExceptionClass2 :(짝대기 긴거 2개 가운데 점있는거) ExceptionClass2 : ExceptionClass3 ex){
        handler
        }
     ~~~
        
   이경우 핸들러는 나열된 예외 클래스에 공통으로 있는 메서드만 예외 변수 ex로 호출 할 수 있다.
   
   
   예외처리가 필요한 문제 중 하나는 리소스 관리이다.
   
   ~~~
   ///파일에 쓰기를 수행하고, 수행이 완료하면 파일을 닫는다...
   ArrayList<String> lines = ...;
   PrintWriter out = new PrintWriter("output.txt");
   for (String line : lines) {
    out.println(line.toLowerCase());
    }
    out.close();
    ~~~
    
    이 코드는 어떤 메서든 예외를 던지면 out.close()가 호출되지 않는다. 
    
    이런 상황은 좋지않다, 예외가 여러번 일어나서 시스템이 파일핸들을 소진 시킬 수 있기 때문이다.
    
    ~~~
    ArrayList<String> lines = ...;
    try (PrintWriter out = new PrintWriter("output.txt")){// 변수선언
        for (String line : lines)
            out.println(line.toLowerCase());
            }
    ~~~
    
    try 문 헤더에 리소스를 지정 할 수 있다. 리소스에 반드시 AutoCloseable 인터페이스를 구현하는 클래스에 속해야한다.
    
    ~~~
    try (PrintWriter out = new PrintWriter("output.txt"){
        for (String line : lines){
            out.println(line.toLowerCase());
            }
         }// out.close()가 호출된다.
    ~~~
    정상적으로 try 블록의 끝에 이르렀든 예외가 일어났든 간에 try 블록이 끝날 때 리소스 객체의 close 메서드가 호출된다.
    
    ~~~
    try (Scanner in = new Scanner(Paths.get("/usr/share/dict/words")); // 리소스1 지정
            printWriter out = new PrintWriter("output.txt")){   // 리소스2 지정
            while (in.hasNext())
                out.println(in.next().toLowerCase());
                }
    ~~~
    
    여러 리소스를 세미콜론으로 구분해 선언 할 수 있다.
    
    리소스는 초기화 순ㅅ의 역순으로 닫는다, out.close()가 in.close() 보다 먼저 호출된다
    
    PrintWriter 생성자에서 예외를 던진다 할때, 이시점에서 in은 이미 초기화 되었지만 out은 아니다.
    
    try문은 in.close()를 호출하고 예외를 전파한다.
    
    finally 절은 정상적으로든 예외가 일어나든 try 블록이 끝날 때 실행된다.
    
    ~~~
    try {
        작업을 수행한다.
        } finally {
            정리 작업을 한다.
            }
    ~~~
    
    이런 패턴은 잠금을 획득,해제하거나 카운터를 증가,감소시킬 때 스택에 무언가를 넣었다가 작업을 마치고 꺼낼 때 사용한다.
    
   finally 절에서는 예외를 던지면 안된다, try 블록의 바디가 예외를 종료하더라도 finally 절에 일어난 예외로 덮어쓰기 때문이다.
   
   finally 절에서는 return 문도 작성하면 안된다. 이유는 이하동문이다.
   
   예외를 어디에서도 잡지 않으면 스택 추적이 표시된다.
   
   예외의 스택추적내용을 저장 하고 싶을때는 다음 문자열에 집어넣으면 된다.
   
   ~~~
   ByteArrayOutputStream out = new ByteArrayOutputStream();
   ex.printStactTrace(new PrintWriter(out));
   String descripton = out.toString();
   ~~~
         
   * 5.2 단정
   
   단정은 일반적으로 사용하는 방어적 프로그래밍 방법이다.
   
   ~~~
   double y = Math.sqrt(x); //특정 프로퍼티가 채워졌다고 확산하는 코드에서 해당 프로퍼티에 의존한다...
   if (x<0) throw new IllegalStateExeption(x + " < 0 ");
   ~~~ 
   
   이때 x는 음수가 아니라고 확신한다, 그럼에도 계산에서는 숫자가 아닌 부동소수점 값이 나타나지 않도록 확인해야한다
   
   하지만 이 조건문은 테스트를 마친 후에도 프로그램에 남아서 실행을 느리게 한다, 단정 메커니즘을 이용하면 테스트 중에만 검사를 하고, 제품용 코드에서는 자동으로 삭제 할 수 있다.
    
   단정 사용 형태는 두가지이다.
   
   ~~~
  assert condition; // assert 문은 조건을 평가해서 거짓이면 AssertionError를 던진다
  assert condition : expression; // 표현식 부분이 오류 객체의 메시지가 되는 문자열로 변환된다.
  ~~~
 
   단정은 기본적으로 비활성화 되있으므로 활성화 시킬려면 -enableassertions 나 -ea 옵션으로 프로그램을 실행해야한다.
   
   
   * 5.3 로깅
   
   로깅 시스템은 기본 로거를 이용한다 정보 메시지를 로그로 기록할 때는, info 메서드를 사용한다.
   
   ~~~
   Logger.getGlobal().info("Opening file " + filename);
   // Aug 04, 2014 09:53:34 AM com.mycompany.Myclass read InFO: Opening file data.txt
   ~~~
   
   로그를 기록한 시각과 호출 클래스나 메서드의 이름이 자동으로 포함된다.
   
   전문적인 애플리케이션에서는 보통 전역 로거 하나로 모든 레코드를 로그로 기록하려고 하지 않는다.
   
   그 대신 로거를 직접 정의해서 사용한다.
   
   ~~~
   Logger logger = Logger.getLogger("com.mycompany.myapp");
   ~~~
   
   이후 같은 이름으로 로거를 요청하면 같은 로거 객체를 얻는다.
   
   로깅 레벨은 일곱 가지로 SEVER, WARNING , INFO , COFIG, FINE, FINER, FINEST가 있다. 기본설정으로 상위 레벨 세 개만 로그로 기록한다.
   
   ~~~
   logger.setLevel(Leval.FINE);
   ~~~
   
   FINE 이상인 레벨을 모두 로그로 기록한다
   
   구성 파일을 편집하면 로깅 시스템의 다양한 ㅡ로퍼티를 변경할 수 있다. 기본 구성 파일은 conf/logging.properties다.
   
   다른 파일을 사용하려면 애플리케이션을 시작할때 java.util.logging.config.file 프로퍼티를 원하는 파일 위치로 설정해야한다.
   
   직접 만든 로거의 로깅 레벨을 지정할 수 있다.
   
   ~~~
   com.mycompany.myapp.level = FINE
   ~~~
   
   로그 핸들러는 콘솔에 메시지를 보낸다.
   
   로거와 마찬가지로 로그 핸들러에게도 로깅 레벨이 있다.
   
   레코드를 로그로 기록하려면 헤당 레코드의 로깅 레벨이 로거와 핸들러의 임계값 이상이여야 한다.
   
   로깅 레벨로 필터링하는 방법 외에도 Filter 인터페이스를 구현한 필터를 로거나 핸들러에 추가로 설치해 필터링 하는 방법도 있다.
   
   ## 6.제네릭 프로그래밍
   
   * 6.1 제네릭 클래스
   
   제네릭 클래스는 타입 매개변수가 한 개 이상 있는 클래스다
   
   ~~~
   public class Entry<K, V>{
    private K key; // 인스턴스 변수
    private V value;
    
    public Entry(K key, V value){// 메서드 매개변수
        this.key = key;
        this.value = value;
    }
   public K geKey() { return key; } //반환값
   public V getValue() { return value;}
   
   }
   ~~~
   클래스 이름(Entry) 뒤에 오는 <> 안에 타입 매개변수 K,V 
   
   이 타입 매개변수들은 클래스 멤버를 정의 할 때 인스턴스 변수, 메서드 매개변수, 반환 값의 타입으로 사용된다
   
   타입 변수를 원하는 타입으로 교체해 제네릭 클래스를 인스턴스화 한다.
   
   Entry<String, Integer> 는 String getKey() 와 Integer getValue()메서드를 가진 평범한 클래스다.
    
   제네릭 클래스의 객체를 생성 할 때 생성자의 타입 매개변수를 생략 할 수 가 있다
   
   ~~~
   Entry<String, Integer> entry = new Entry<>("Fred" , 42);
   // new Entry<String, Integer>("Fred" , 42) 와 같다, string, Integer 생략...
   ~~~
   
   이때 생성 인수 앞에 빈<>를 작성해야한다, 이 빈 <>를 다이아몬드(문법)라고 도 한다

    * 6.2 제네릭 메서드
    
    제네릭 메서드는 타입 매개변수를 받는 메서드다, 제네릭 메서드는 일반 클래스나 제네릭 클래스에 속 할 수 있다.
    
    ~~~
    public class Arrays { // 제네릭이 아닌 클래스에 속한 제네릭 메서드
        public static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }    
    ~~~     
    
    배열에 들어 있는 요소의 타입이 기본 타입만 아니라면 swap 메서드로 임의의 배열에 들어 있는 요소를 교환 할 수 있다
    
    ~~~
    String [] friends = ...;
    Arrays.swap(friends, 0, 1);
    ~~~
    
    제네릭 메서드를 선언 할 때는 타입 매개변수를 제어자(public , static)와 반환 타입 사이에 두어야 한다
    
    ~~~
    public static <T> void swap(T[] array, int i, int j) // 제네릭 메서드 <T>
    ~~~
    
    제네릭 메서드를 호출 할 때는 타입 매개변수를 명시 하지 않아도 된다
    
    ~~~
    1.String [] friends = ...;
    2.Arrays.swap(friends, 0, 1);
    ~~~
    
   1번 호출에서 friends의 타입이 String[]이므로 컴파일러가 T가 String이라고 추론하기 때문에 메서드 이름 앞에 타입을 명시적으로 지정해도 된다.
   
   * 6.3 타입 경계
   
   제네릭 클래스나 제네릭 메서드가 받는 타입 매개변수의 타입을 제한해야 할 때 도 있다.
   
   이때 타입 경계를 지정하면 타입이 특정 클래스를 확장하거나 특정 인터페이스를 구현 할 수 있다.
   
   ~~~
   public static <T extends AutoCloseable> void closeALL(Arraylist<T> elems)
    throws Exception {
   for (T elem : elems) elem.close();
   }
   ~~~
   
   타입 경계 extends AutoCloseable은 요소 타입이 AutoCloseable의 서브 타입임을 보장
   
   elem.close() 호출이 유효하다
   
   이 메서드에 ArrayList<PrintStream>은 전달 할 수 있지만, ArrayList<String>은 전달 할 수 없다.
    
    타입경계에서 extneds 키워드는 서브타입을 의미한다
    
    * 6.4 타입 가변성과 와일드 카드
    
    서로 다른 배열 리스트 사이에서 변환하는 일은 대부분 안전하다, 메서드에서 배열 리스트에 쓰기를 전혀 수행하지 않아 인수로 전달된 배열 리스트를 변경하지 않는다고 하자
    
    ~~~
    public static void printNames(ArrayList<? extends Employee> staff{
        for (int i = 0; i < staff.size(); i++){
            Employee e = staff.get(i);
            System.out.println(e.getName());
            }
            }
     ~~~
     
     와일드카드 타입 ? extends Employee는 미지의 Employee 서브타입을 가르킨다
     
     ArrayList<Employee> 나 Arraylist<Manager>같은 서브타입의 배열 리스트로 printNames 메서드를 호출 할 수 있다
    
    ? 타입이 무엇을 나타내든 Employee의 서브 타입이다. 그러므로 staff.get(i)의 결과를 Employee 변수 e에 할당 할 수 있다.
    
    결론적으로 ? extends Employee를 Employee 로 변환 할 수 있지만, 그 어떤 것 도 ? extends Employee 로는 변활 할 수 없다.(가역이 안된다)
  
   슈퍼 타입을 나타내는 와일드 카드 타입은 ? super Employee 다
   
   일반적으로 제네릭 함수형 인터페이스를 메서드 매개변수로 받을 때는 super 와일드카드를 사용해야한다.
   
   * 6.5 자바 가상 머신에서 보는 제네릭
   
   제네릭 타입을 정희하면 해당 타입은 로(raw) 타입 으로 컴파일 된다
   
   ~~~
   public class Entry {
    private Object key;
    prvate Object value;
    
        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
            }
            
           public Object getKey() { return key; }
           public Object getValue() { return value;}
           }
            
    ~~~
    
    타입변수에 경계가 있으면 첫 번째 경계로 교체된다
    
    ~~~
    public class Entry<K extends Comparable<? super K> & Serializable, V extends Serializable> //이렇게 한다면
    
    public class Entry { // 클래스가 교체된다...
        private Comparable key;
        private Serializable value;
        ...
        }
    ~~~    
   
    * 6.6 제네릭의 제약
    
    기본 타입 인수를 사용할 수 없다
    
    ex) ArrayList<int>는 만들 수 없다 그 대신 로(raw)타입인 ArrayList 만 있다
    
    실행 시간에는 모든 타입이 로 형태다
   
   타입 변수를 인스턴스화 할 수 없다
   
   ex) 타입변수는 T(...) 또는 new T[...] 같은 표현식에 사용 할 수 없다.
   
   매개변수화된 타입의 배열을 생성 할 수 없다
   
   ~~~
   Entry<String, Integer>[] entries = new Entry<String, Integer>[100];
   // 오류 - 제네릭 ㅓㅁ포넌트 타입으로 구성된 배열은 생성할 수 없다.
   ~~~
   
   ex) 타입이 소거된 후 배열생성자가 로 Entry 배열을 생성할 것이므로 이런 식으로 생성 못한다, 로 Entry 배열이 생성되면
   
   Entry<Employee, Manager> 같은 모든 타입의 Entry 객체를 ArrayStoreException 없이 추가 할 수 있기 때문이다
   
   정적 컨텍스트에서 클래스 타입 변수가 유효하지 않다
   
   ~~~
   public class Entry<K, V>{
    private static V defaultValue;
    // 오류 - 정적 컨텍스트에서 V를 사용했다.
    public static void setDefault(V value) { defaultValue = value; }
    // 오류 - 정적 컨텍스트에서 V를 사용했따.
    
    }
    ~~~
    결국 타입 소거는 소거된 Entry 클래스에 이런 종류의 변수나 메서드가 K와 V별로 있지 않고 오직 한 개만 있다는 것을 의미한다
    
    메서드가 소거 후 충돌하지 않을 수도 있다
    
    ex)타입 소거 후 충돌을 일으킬 수 있는 메서드는 선언하지 말아야한다
    
    ~~~
    public interface Ordered<T> extends Comparable<T> {
        public defalut boolean equals(T value) {
        // 오류 - 소거 결과 Object.equals와 충돌한다.
        return compareTo(value) == 0;
        }
        ...
        }
    ~~~
    
    equal(T value) 메서든s equals(Object value)로 소거되어 OBject의 equals 메서드와 충돌한다.
    
    제네릭 클래스의 객체는 예외로 던지거나 잡을 수 없다. 사실 Throwable의 제네릭 서브클래스조차 만들 수 없다
    
    * 6.7 리플렉션과 제네릭
    
        제네릭 클래스와 제네릭 메서드의 헤더는 지워지지 않으므로 리플렉션으로 접근 할 수 있다.
   
   ## 7.컬렉션
   
   * 7.1 컬렉션 프레임워크 개요
    
    컬렉션 프레임워크는 일반적인 자료 구조의 구현체를 제공한다.
    
    ArrayList 클래스와 LinkedList 클래스는 List 인터페이스를 구현한다.
    
    set(집합)은 요소를 특정 위치에 삽입하지 않으며, 중복 요소를 허용하지 않는다.
    
    SortedSet에는 정렬 순서로 요소를 순회하는 기능
    
    NavigableSet에는 이웃 요소를 찾는 메서드
    
    Queue는 삽입 순서를 유지하지만 사람들이 줄지어 있는 것처럼 요소를 꼬리에서만 삽입하고, 헤드에서만 제거 할 수 있다.
    
    Deque은 양쪽 끝에서 삽입과 제거를 할 수 있다.
    
    컬렉션 인터페이스는 모두 제네릭이며, 요소 타입에 대응하는 타입 매개변수를 받는다
    
    * 7.2 반복자

각 컬렉션은 특정 순서로 요소를 순회하는 메서들르 제공한다.

향상된 for 루프를 사용해도 된다.

~~~
for (String element : coll) {
    element를 처리한다.
    }
~~~

   * 7.3 집합


집합은 순서가 중요하지 않을 때 유용하다, 예를 들어 나쁜 단어를 사용자 이름으로 쓸 수 없게 한다 할때, 이때 순서는 중요하지 않다

사용자 이름이 나쁜 단어 집합에 있는지 없는지만 알면 되기 때문에


   * 7.4 맵

맵은 연관 된 키(key)와 값(value)을 저장한다. 

연관된 키와 값을 새로 추가하거나 기존 키 값을 변경할 때는 put을 호출한다.

~~~
Map<Strig, Integer> counts = new HaspMap<>();
counts.put("Alice" , 1); // 맵에 키/값 쌍을 추가한다.
counts.put("Alice" , 2); // 키에 대응하는 값을 업데이트한다.
~~~

여기에서 해시 맵(hash map)을 사용한다. 키를 정렬 순서로 방문해야 하는 경우가 아니라면 보통 해시 맵을 선택한다

정렬 순서로 방문하려면 TreeMap을 사용한다

~~~
int count = count.get("Alice");
~~~

get 메서드는 키가 없으면 null 값을 반환한다. 

그러므로

~~~
int count = count.get("Alice" , 0);
~~~
 키값(0)을 넣어줘야 한다.
 
   * 7.5 기타 컬렉션

프로퍼티(Properties) 클래스는 텍스트 형식으로 쉽게 저장하고 불러올 수 있는 맵을 구현한다

비트집합(Bitset) 클래스는 비트 시퀀스를 저장한다. 비트 집합은 비트를 long 값의 배열로 패킹하므로 boolean 값의 배열을 이용할 때보다 효율적이다.

열거값의 집합을 모으려면 BitSet 대신 EnumSet 클래스를 사용해야한다. 이 클래스는 공개 생성자가 없다. 그러므로 정적 팩토리 메서드로 집합을 생성한다.

스택(stack)은 한쪽 끝에서 요소를 추가하고 제거하는 자료구조 , 스택을 이용할 때는 push와 pop 메서드를 사용한다(추가, 제거)

큐(queue)는 요소를 효율적으로 한쪽 끝에 추가하고, 다른 쪽 끝에서 제거한다. 그리고 add와 remove 메서드를 사용한다.

더블 엔디드 큐 줄여서 덱(deque)은 양쪽 끝에서 삽입과 제거를 모두 할 수 있다. 그리고 remove 메서드를 호출 할 때마다 우선순위 큐에서 현재 가장 작은 요소를 얻는다.

이 자료 구조 3가지 모두 중간에 요소를 추가하는 기능은 지원하지 않는다.
       
  * 7.6 뷰
  
  컬렉션 뷰는 컬렉션 인터페이스를 구현하지만 요소를 저장하지 않는 경량 객체다
  
  List, Set, Map 인터페이스는 지정한 요소로 구성된 집합이나 리스트와 지정한 키/값 쌍으로 구성된 맵을 돌려주는 정적 메서드를 제공한다
  
  이 메서들은 요소 세 개로 구성된 리스트와 집합을 돌려준다
  
  요소, 키, 값으로 null을 지정 할 수 없다.
  
  리스트의 서브리스트 뷰를 만들 수 있다.
  
  서브리스트에 가한 모든 변경(요소 설정, 추가, 제거)은 원본에도 영향을 준다. 정렬 집합,맵 이라면 하한과 상한으로 범위를 지정한다.
  
  
   ## 8. 스트림
   
   
   * 8.1 반복에서 스트림 연산으로 전환

   스트림을 이용하면 필터링과 카운팅을 확인하려고 루프를 살펴볼 필요가 없다.
   
   메서드 이름을 보면 코드가 무엇을 의도하는지 바로 알 수 있다. 게다가 루프에서는 연산 순서를 자세히 작성해야 하지만, 스트림은 결과만 맞으면 원하는 방식으로 연산을
   
   스케줄링 할 수 있다.
   
   스트림은 '어떻게가 아니라 무엇을' 이라는 원칙을 따른다.
   
   스트림은 요소를 저장하지 않는다.
   
   스트림 연산은 원본을 변경하지 않는다.
   
   스트림 연산은 가능하면 지연 방식으로 작동한다. 즉 필요하기 전까지는 연산 결과를 실행하지 않는다.
   
   
   * 8.2 스트림 생성

  Collection 인터페이스의 stream 메서드를 사용하면 어떤 컬렉션이든 스트림으로 변환 할 수 있다, 하지만 배열일 때는 정적메서드 Stream.of를 사용해야한다.
  
  배열의 일부에서 스트림을 만들려면 Arrays.stream(array, from, to)를 사용해야 한다.
  
  요소가 없는 스트림을 만들려면 정적 메서드 Stream.empty를 사용해야한다.


  * 8.3 filter , map , flatMao 메서드


 스트림 변환은 또 다른 스트림에 들어 있는 요소에서 파새앟ㄴ 요소의 스트림을 만들어 낸다.
 
 filter 변환은 특정 조건과 일치하는 요소로 구성된 새 스트림을 돌려준다. 여기서 문자열 스트림을 긴 단어로만 구성된 또 다른 스트림으로 변화한다.
 
 map을 사용하면 지정한 함수를 각 요소에 적요한 결과들을 담은 새 스트림을 만든다.
 
 스트림을 단일 스트림으로 펼치려면 map 대신 flatMap 메서드를 사용해야 한다.
 
 
 
 * 8.4 서브스트림 추출과 스트림 결합


stream.limit(n) 호출은 요소 n 개 이후 끝나는 새 스트림을 반환한다. 이 메서드는 무한 스트림을 원하는 크기로 자를 때 유용하다

stream.skip(n) 호출은 limit와는 반대 작업을 수행한다, 처음 n 개의 요소를 버린다.

stream.takeWhile(predicate) 호출은 프레디케이트가 참인 동안 스트림에서 모든 요소를 가져온 후 중단한다.

dropWhile 메서드는 반대로 조건이 참인 동안 요소를 버리고, 조건이 처음 거짓으로 판명된 요소부터 시작해 모든 요소의 스트림을 돌려준다.

Stream 클래스의 정적 메서드 concat을 사용 하면 두 수트림을 연결 할 수 있다, 물론 첫번째 스트림이 무한 스트림이면 안된다.


* 8.5 기타 스트림 변환


distinct 메서드는 원본 스트림에 있는 요소의 중복을 제외하고 같은 순서로 돌려주는 스트림을 반환한다.

스트림 정렬용으로 사용하는 sorted 메서드는 여러 변형이 있다. 그 중 하나는 Comparable 요소로 구성된 스트림에 작동하고, 또 다른 변형은 Comparator를 받는다. 여기서는 문자열을 정렬해 서 가장 긴 문자열이 처음에 나타나게 한다.

모든 스트림 변환이 그렇듯이 sorted 메서드는 우너본 스트림의 요소가 정렬된 새 스트림을 돌려준다. 물론 스트림을 사용하지 않고도 컬렉션을 정렬 할 수 있다. sorted 메서드는 정렬 과정이 스트림 파이프라인으 일부일 때 유용하다.

peek 메서드는 원본과 요소가 같은 또 다른 스트림을 돌려주지만, 요소를 추출할 때 마다 전달받은 함수를 호출하기에 디버깅할 때 유용하다.


* 8.6 단순 리덕션


스트림 데이터에서 결과를 얻는 방법, 리덕션(종료 연산) 이라 한다.

리덕션은 스트림을 프로그램에서 사용할 수 있는 넌스트림 값으로 리듀스 한다.


* 8.7 옵션타입


Optional<T> 객체는 T 타입 객체 또는 객체가 없음을 나타내는 래퍼다. 
    
Optional을 효과 적으로 활용하는 핵심은 값이 없을 때는 대체 값을 생산하고, 값이 있을 때만 해당 값을 소비하는 메서드를 사용하는 것이다.

Optional 값을 올바르게 사용하지 않으면 '어떤 객체 또는 null' 접근법보다 나을 것이 없다. get 메서드는 Optional 값에 래핑된 요소가 있으면 얻어오고, 그렇지 않으면 NoSuchElementException을 던진다.

Optional 객체를 생성하는 메서드를 작성하고 싶을때는 Optional.of(result)와 Optional.mepty()를 비롯해 이 용도로 쓸 수 있는 몇 가지 정적 메서드를 사용하면된다.


* 8.8 결과 모으기


결과를 보고 싶을때 iterator 메서드를 호출해 스트림의 요소를 방문하는 데 사용하는 전통적인 반복자를 얻으면 된다

병렬 스트림에서 forEach 메서드는 요소를 임의의 순서로 순화한다. 스트림 순서로 처리하려면 forEach 메서드 대신 forEachOrdered 메서드를 호출해야 한다.


* 8.9  맵으로 모으기

예제로 배우기


* 8.10 그루핑과 파티셔닝


특성이 값은 값을 그룹으로 형성하는 일은 아주 흔한 작업으로 groupingBy 메서드를 사용한다

분류 함수가 프레디케이트 로 나눈다. 이 경우 partitioningBy를 사용하면 효율 적이다.


* 8.11 다운스트림 컬렉터


groupingBy 메서드는 값이 리스트인 맵을 돌려준다. 이런 리스트를 원하는 방식으로 처리하려면 다운스트림 컬렉터를 작성해야한다.

스트림 라이브러리에는 그룹으로 묶인 요소를 숫자로 리듀스하는 데 사용하는 컬렉터가 몇 가지 있다.

counting은 모은 요소의 개수를 센다

summing은 함수 인수를 받아서 해당 함수를 다운스트림 요소에 적용하고 합계를 구한다.

mapBy 와 minBy는 비교기를 받아서 다운 스트림 요소의 최댓값과 최솟값을 구한다

mapping 컬렉터는 함수를 다운스트림 결과에 적용하며, 이 결과를 처리할 또 다른 컬렉터를 받는다.


* 8.12 리덕션 연산


reduce 메서드는 스트림에서 값을 계산하는 일반적인 메커니즘이다. 가장 단순한 형태는 이항 함수를 받아 처음 두 요소부터 시작해 계속해서 함수를 적용하는 것이다.

리덕션을 병렬 스트림과 함께 사용하려면 연산이 결합 법칙을 지원해야한다. 즉, 요소 결합하는 순서와는 무관해야한다.


* 8.13 기본 타입 스트림


예제로 배우기



* 8.14 병렬 스트림


스트림을 이용하면 벌크 연산을 쉽게 병려로하 할 수 있다. 대부분 자동이지만 몇 가지 규칙을 따라야 한다.

먼저 병렬 스트림이 있어야한다.

스트림이 병렬 모드에 있는 한 종료 메서드를 실행하면 중간 스트림 연산이 모두 병렬화 된다.

스트림 연산을 병렬로 실행 할 때도 차례로 실행했을 때와 같은 결과를 반환받아야 한다. 따라서 연산은 상태가 없고(stateless) 임의의 순서로 실행할 수 있는 것이어야 한다.

기본적으로 순서 유지컬렉션(배열과 리스트), 범위, 발생기, 반복자 Stream.sorted를 호출해 얻는 스트림은 순서를 유지한다.

순서 유지 스트림의 결과는 원본 요소 순서로 쌓이므로 전적으로 예측할 수 있게 작동한다. 따라서 같은 연산을 두 번 실행해도 같은 결과를 얻는다.

일부 연산은 순서에 대한 요구 사항을 버리면 더 효과적으로 병렬화 할 수 있다.



 ## 9. 입출력 처리
 
 
 * 9.1 입출력 스트림, 리더와 라이터


파일에서 스트림을 얻는 가장 쉬운 방법은 정적 메서드를 사용 하는 것이다.

~~~
InputStream in = Files.newInputStream(path);
OutputStream out = Files.newOutputStream(path);
~~~

InputStream 클래스에는 바이트를 한개 읽는 메서드가 존재한다

이 read 메서드는 읽어 온 바이트를 0~255 범위에 있는 정수로 반환하거나 입력의 끝에 이르면 -1을 반환한다.

바이트를 벌크(bulk)로 읽을 때가 더 많다, 스트림에서 모든 바이트를 읽어와 바이트 배열을 저장하는 readAllBytes 메서드가 있다.

모든 바이트가 아니라 일부만 읽으려면 바이트 배열을 인수로 전달 하면서 readNBytes 메서드를 호출한다

readNBytes 메서드는 n바이트까지 또는 입력이 더는 없을 때까지 읽고, 실제로 읽어 온 바이트 수를 반환한다. 입력이 전혀없으면 -1 을 반환한다.

OutPutStream의 write 메서드는 개별 바이트와 바이트 배열을 쓸 수 있다.

스트림에 쓰기를 마친 후에 반드시 해당 스트림을 닫아서 버퍼에 저장된 출력을 커밋해야 한다. 좋은 방법은 try-with-resources 문을 사용하는 것이다

~~~
try (OutputStream out = ...) {
    out.srite(bytes);
    }
~~~

입력 스트림을 출력 스트림으로 복사할 때는 InputStream.transferTo 메서드를 사용 하면 된다


텍스트를 다룰 때는 텍스트가 바이트로 인코드되는 방식이 중요하다.

가장 일반적인 인코딩 방법은 각 유니코드의 코드 포인트를 1~4바이트 시퀀스로 인코드 하는 UTF-8이다

이것의 장점은 전통적인 아스키 문자 집합에 속하는 문자가 각각 1바이트씩만 차지한다는 것이다

또 다른 일반적인 인코딩 방법은 UTF-16이다

이것은 각 유니코드의 코드포인트를 16비트 값 한 두 개로 인코드한다. 자바 문자열은 UTF-16 인코딩을 사용한다.



* 9.2 경로, 파일, 디렉터리


경로는 일련의 디렉터리 이름으로 선택적으로 파일 이름이 붙는다.

정적 메서드 Paths.get 은 문자열을 한 개 이상 받아 기본 파일 시스템의 경로 분리자(유닉스 계열 파일 시스템은 / , 윈도는 \)로 결합한다.

주어진 파일 시스템에서 올바른 경로가 아니면 InvalidPathException을 던진다. 결과는 Path 객체다.

Paths.get 메서드에 경로 구분자가 포함된 문자열을 전달해도 된다.

~~~
Path homeDirectory = Paths.get(" /home/cay");
~~~

경로를 결합하거나 '해석'하는 일은 아주 일반 적이다. p.resolve(q) 호출은 다음 규칙에 따라 경로를 반환한다.

1. q가 절대경로면 결과는 q다.

2. q가 상대 경로면 파일 시스템 규칙에 따라 결과는 'p 다음 q"다.


새 디렉터리를 생성 할 때는 다음과 같이 호출한다.

~~~
Files.createDirectory(path);
~~~

경로에서 마지막 구성 요소를 빼고는 모두 이미 있어야한다. 중간 디렉터리까지 생성하려면 다음과 같이 사용해야 한다.

~~~
Files.createDirectories(path);
~~~

다음 호출로 빈 파일을 생성할 수 있따.

~~~
Files.createFile(path);
~~~

이 호출은 파일이 이미 있으면 예외를 던진다


정적 메서드 Files.list 는 Stream<Path>를 반환한다. Stream<Path>는 디렉터리의 엔트리를 읽는다.
    
디렉터리를 지연 방식으로 읽으므로 엄청나게 많은 엔트리가 포함된 디렉터리도 효율적으로 처리할 수 있다.

디렉터리 일기는 닫기가 필요한 시스템 리소스와 연관 되므로 try-with-resources 블록을 사용해야한다

list 메서드는 서브디렉터리로 들어가지 않는다. 디렉터리의 자손을 모두 처리하려면 list 메서드 대신 Files.walk 메서드를 사용해야한다.

~~~
try (Stream<path> entries = Files.walk(pathToRoot)) {
.. // 자손을 모두 담고 있으며, 가각을 깊이 우선(depth-first) 순으로 방문한다.
}
~~~


* 9.3 HTTP 커넥션


URL.getInputStream 메서드가 반환한 입력 스트림으로 URL에서 내용을 읽어 올 수 있다.


* 9.4 정규표현식


정규표현식에서 문자는 예약 문자 중 하나가 아니면 자신을 나타낸다

. * + ? { ㅣ(가운대 짤린거) () [ \ ^ $

* 기호는 앞에 있는 구문이 0 번 이상 반복 될 수 있음을 나타낸다

?는 구문이 선택적임을 나타낸다, 나머지 횟수는 {} 로 지정한다

ㅣ(가운대 짤린거) 는 선택을 나타낸다 ()안에서 선택한다

문자 클래스는 [] 처럼 대괄호로 감싼 선택 문자의 집합이다

\d 나 \p 처럼 미리 정의된 문자 클래스가 많다.

^과 $ 문자는 입력의 시작과 끝에 일치한다.

정규표현식을 사용 하는 방식은 두가지다.

1. 그냥 정적 메서드 matches를 사용하는 것 (일치 항목 한 개 찾기)

2. 정규 표현식 활용 사례를 이용한다. + resluts 메서드를 호출해 Stream<MatchResult> 얻기 (모든 일치 항목 찾기)

일치 항목의 구성요소를 추출할 때는 그룹(group)을 이용, 좋은 방법은 이름으로 캡처하는 것 그럼다음 항목으로 이름을 추출한다.

일치하는 구분자로 입력을 분리하고 나머지는 모두 그대로 두고 싶으면 Pattern.split 메서드를 이용하면 자동 처리된다

정규 표현식의 모든 일치 항목을 문자열로 교체하려면 매처의 replaceAll 을 호출해야한다

사전 컴파일이 필요 없다면 STring 클래스의 replaceAll 메서드를 사용 해도 된다



* 9.5 직렬화

객체 직렬화는 객체를 다른 곳으로 보내거나 디스크에 저장 할 수 있는 바이트의 묶음으로 변환하고, 해당 바이트들에게 객체를 재구성하는 매커니즘.

직렬화는 객체를 한 가상 머신에서 다른 가상 머신으로 보내는 분산 처리에서 필수 도구

직렬화된 객체를 다른 서버로 옮길 수 있을 때는 페일오버(장애극복)와 로드 밸런싱(부하 분산)에도 이용한다

Serializeable 인터페이스를 구현하는 클래스의 인스턴스여야 객체를 직렬화 할 수 있다.

특정 인스턴스 변수는 직렬화 하면 안된다.

또 객체가 값의 캐시를 관리 할 때는 해당 캐시를 저장하기보다는 버리고 다시 계산해야한다.

인스턴스 변수가 직렬화 되는 것을 막을려면 해당 변수에 transient 제어자를 붙이면 된다

인스턴스 변수가 직렬화 불가능한 클래스에 속할 때도 일시적인 변수로 표시한다. 객체를 직렬화 할 때 일시적인 필드는 항상 건너뛴다.

직렬화 메커니즘을 조정할 때 메서드를 정의해 원하는 액션을 기본 읽기와 쓰기 동작에 추가할 수 있다. (readObject 와 writeObject 메서드)

생성자로만 객체를 구성할 수 있다는 것을 당연하게 여긴다, 하지만 역직렬화되는 객체는 구성되지 않는다.

역직렬화되는 객체의 인스턴스 변수는 단순히 객체 스트림에 복원된다.

생성자가 어떤 조건을 강제하면 이 점이 문제가 된다

역직렬화되는 각 인스턴스의 고유성을 제어하는 상황에 처했을때 객체 자체가 아니라 해당 객체를 찾아내거나 생성 할 수 있는 프록시를 직렬화 해야한다

프록시 객체를 반환하는 writeReplace 메서드를 구현해야 한다.



