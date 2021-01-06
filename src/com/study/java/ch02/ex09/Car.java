
public class Car {
    private double x;     // 변수선언 ,거리
    private double gallon; // 연료(시간)
    /* commant
    변수 이름 mpg(mile per gallon)로 바꾸자 (S는 뭐냐;;)
    그리고 mpg는 변경되면 안되는 값이고 고정된 값이어야 함
    고정된 값으로 처리하려면 어떻게 정의해야하는지 찾아보기
     */
    private final double MPG ; // 연비
    private double distance;
    /* comment
      30을 그대로 저장(하드코딩)해놓으면 안되고 parameter 값을 전달 받아서 저장해야됨
    */
    public Car(double MPG) {  // 생성자 만들기
        this.MPG = MPG;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getGallon() {
        return this.gallon;
    }

    public void setGallon(double gallon) {
        this.gallon = gallon;
    }

    public double getMPG() {
        return this.MPG;
    }


    public double distance(){ return MPG*gallon;}


    /* comment
    mpg 변수가 고정되면 이건 필요 없어지겠지?
     */


    /* comment
      if도 return this고 else도 return this이면 중복
      intellij에서 코드 하단에 물결표시 있으면 유심히 보고 마우스 올려놓으면 가이드 나오니까 확인
    */
    public Car drive(double x) { // 지정한 마일(x)만큼 움직이는 메서드, 연료없으면 그 곳에서 멈춘다...
        if(x <= MPG*gallon){
            setX(this.x+x);
            setGallon((MPG*this.gallon-x)/MPG);
        }
        else{
            setX(MPG*gallon);
            setGallon((MPG*this.gallon)/MPG*0);
        }
        return this;
    }

    public Car fuel(double gallon) {   // 지정한 수(gallon)만큼 연료 채우는 메서드
        setGallon(this.gallon + gallon);
        return this;
    }


    /* comment
    거리 결과만 보여주는 함수로 변경할 것
    parameter도 필요 없음. 이유는 현재 가지고 있는 gallon 정보는 Car 클래스 안에 있으니까 계산에 추가로 필요한 값이 없다.
    굳이 지금 만든 함수를 정의하자면 gallon 만큼 더 넣었을때 갈 수 있는 거리? 정도의 이미. (문제에서 의도한 건지는 잘 모르겠음)
    gallon 만큼 더 넣었을때 갈 수 있는 거리를 계산하고 싶으면 실제로 더 넣고(fuel 실행하고) 계산하면 되지 않나??
     */


    public static void main(String[] args) {
//        Car d = new Car(30).fuel(3).drive(30).distance(3); // 연료 3만큼 넣고 거리를 간다고 설정
//        System.out.println("차가 간 거리 \n" +  d.getX() + " \n연료의 수 \n" +  d.getGallon() + " \n남은 연료로 현제 갈 수 있는 거리 \n" + d.getMPS());
        /* comment
         예상 결과가 왜 이렇게 나오는지부터 이해한 후
         아래 코드 기준으로 예상 결과와 동일하게 나오도록 수정
         */
        Car c1 = new Car(5).fuel(10).drive(40);
        System.out.println("c1 - 이동거리 : " + c1.getX() + ", 남은 연료 : " + c1.getGallon() +
                ", 연비 : " + c1.getMPG() + ", 이동 가능 거리 : " + c1.distance()); // 예상 결과 x=40, gallon=2, mpg=5, distance=10
        Car c2 = new Car(10).fuel(5).drive(80);
        System.out.println("c2 - 이동거리 : " + c2.getX() + ", 남은 연료 : " + c2.getGallon() +
                ", 연비 : " + c2.getMPG() + ", 이동 가능 거리 : " + c2.distance()); // 예상 결과 x=50, gallon=0, mpg=10, distance=0
        Car c3 = new Car(5).fuel(3).fuel(5);
        System.out.println("c3 - 이동거리 : " + c3.getX() + ", 남은 연료 : " + c3.getGallon() +
                ", 연비 : " + c3.getMPG() + ", 이동 가능 거리 : " + c3.distance());
        Car c4 = new Car(5).fuel(5).fuel(3).drive(20).drive(10);
        System.out.println("c4 - 이동거리 : " + c4.getX() + ", 남은 연료 : " + c4.getGallon() +
                ", 연비 : " + c4.getMPG() + ", 이동 가능 거리 : " + c4.distance());
    }
}
