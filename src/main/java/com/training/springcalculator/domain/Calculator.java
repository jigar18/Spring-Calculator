package com.training.springcalculator.domain;

import javax.persistence.Entity;

//@Entity
public class Calculator {

    private double leftOperand;
    private double rightOperand;
    private String operand;

    public Calculator() {
        leftOperand = 0;
        rightOperand = 0;
        operand = "+";
    }

    public double getLeftOperand() { return leftOperand; }

    public void setLeftOperand(double leftOperand) { this.leftOperand = leftOperand; }

    public double getRightOperand() { return rightOperand; }

    public void setRightOperand(double rightOperand) { this.rightOperand = rightOperand; }

    public String getOperand() { return operand; }

    public void setOperand(String operand) { this.operand = operand; }
}
