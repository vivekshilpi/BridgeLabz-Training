package com.lambdas.smarthomelighting;

@FunctionalInterface
public interface LightAction {
    void activate(int brightness, String color);
}
