package com.junjia.design.pattern.behavioral.interpreter;

/**
 * Created by junjia.
 */
public class Test {
    public static void main(String[] args) {
        String junjiaInputStr="6 100 11 + *";
        JunjiaExpressionParser expressionParser=new JunjiaExpressionParser();
        int result=expressionParser.parse(junjiaInputStr);
        System.out.println("解释器计算结果: "+result);
    }
}
