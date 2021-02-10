package com.study.java.ch04.practice02; // equal 기능 확인

import java.util.Objects;

public class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false; //객체의 클래스가 정확히 일치하지 않으면 false 반환
        DiscountedItem other = (DiscountedItem) otherObject; // otherObject는 DiscountedItem 이여야한다
                                                            // 슈퍼클래스(item)에서 getClass 검사가 실패하기때문에
        return discount == other.discount;
    }
    
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}
