package com.valuemomentum.training.testing.junitdemo;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class calculator {
    public double add(double a,double b) {
        return a+b;
    }
    public double subtract(double a , double b) {
        return a-b;
    }
    public double multiply(double a , double b) {
        return a*b;
    }
    public double divide(double a ,  double b ) {
           if (b==0) {
                throw new ArithmeticException();
            }
            return a/b;
    }

 

}
 