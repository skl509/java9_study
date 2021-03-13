package com.study.java.ch09.practice05;

import javafx.geometry.Point2D;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Paths.get("employees.ser");
        try (ObjectOutputStream out = new ObjectOutputStream( //거꾸로 객체 읽어 오려면 OjbectInputStream을 생성
                Files.newOutputStream(path))) { //writeObject 메서드 호출
            Employee peter = new Employee("Peter", 90000);
            Employee paul = new Manager("Paul", 105000);
            Manager mary = new Manager("Mary", 180000);
            peter.setBoss(mary);
            paul.setBoss(mary);
            out.writeObject(peter);
            out.writeObject(paul);
            
            out.writeObject(new LabeledPoint("origin", new Point2D(0, 0))); //writeObject 메서드 일시적이지 않은 label 변수 사용
            // defaultWriteObject 는 ObjectOutputStream 클래스의 특수 메서드로 직렬화 가능한 클래스의 writeOBject 메서드 안에서만 호출 해야됨.
            
            out.writeObject(PersonDatabase.INSTANCE.findById(1));
        }
        try (ObjectInputStream in = new ObjectInputStream(
                Files.newInputStream(path))) {
            Employee e1 = (Employee) in.readObject(); //객체에 쓴 순서대로 readObject 메서드에 호출된다
            Employee e2 = (Employee) in.readObject();
            System.out.println(e1);
            System.out.println(e2);
            
            System.out.println(in.readObject());
            System.out.println(in.readObject());
        }
    }
}
