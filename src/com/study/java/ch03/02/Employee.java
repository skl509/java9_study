package ch03.02;

public class Employee implements Measurable { //임플로이 4개만들거고 //미저러블 배열만들고// 그 배열에 임플로이 집어넣기//
    //배열들어가는 상태에서 포문 돌려서 페이 돌려주고 그것이 셋 페이 xx // 셋페이 없에고 그냥 average(Measurable[] objects 에다 계산
    public Employee(double pay,String name) { // 생성자 만들기... 직원은 페이라고 생각(pay 값 넣어주기)
        this.pay = pay;
        this.name = name;
    }

    private double pay;
    private String name;


    @Override
    public double getMeasure() {
        return this.pay;



    } //setMeasure은 만들 필요없다(파라미터 안 넣어도 됨), 리턴 값만 가져다 쓴다.

    @Override
    public String getName() {
        return this.name;
    }
}

