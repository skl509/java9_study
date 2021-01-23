package com.study.java.ch03.practice06;

import java.awt.Color;

@FunctionalInterface
public interface PixelFunction {
    Color apply(int x, int y);
}
