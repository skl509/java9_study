package com.study.java.ch04.ex06;

import com.study.java.ch04.practice02.Item;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Item a = new Item("A",1000);
        Item b = new Item("A" , 1000);
        System.out.println(a);
        System.out.println(a.equals(b)); // 디스카운트 아이템과 비교하고 출력 코드는 잘 안써진다...
                                        // 검은 표시로 디스카운트 아이템 사용 안하고 있어서 처리방법 잘 모르겠다...

        class Item {
            private String description;
            private double price;

            public Item(String description, double price) {
                this.description = description;
                this.price = price;
            }

            @Override
            public boolean equals(Object otherObject) {
                if (this == otherObject) return true;
                if (otherObject == null) return false; //매개변수가 null이면 거짓을 반환
                if (!(otherObject instanceof Item)) return false; //인스턴스 변수 동일한지 검사
                Item other = (Item) otherObject; // 두 객체 동일한지 확인
                return Objects.equals(description, other.description) && price == other.price;
            }

            @Override
            public int hashCode() {
                return Objects.hash(this.description, this.price);
            } // 해쉬코드 메서드 equals와 호환
        }
        class DiscountedItem extends Item { //서브 클래스 discountedItem
            private double discount;

            public DiscountedItem(String description, double price, double discount) {
                super(description, price); // 생성자 생성 슈퍼타입
                this.discount = discount;
            }

            @Override
            public boolean equals(Object otherObject) {
                if (!super.equals(otherObject)) return false; // 인스턴스 변수 동일한지 검사
                if (otherObject.getClass() == Item.class) { // 두객체 동일한지 확인
                    return super.equals(otherObject);
                }
                DiscountedItem other = (DiscountedItem) otherObject; // 할인까지 포함해서 비교...
                return this.discount == other.discount;
            }

            @Override
            public int hashCode() {
                return Objects.hash(this.discount, super.hashCode());
            }
        }
    }

}
