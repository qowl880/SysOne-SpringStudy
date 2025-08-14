package app.labs.servlet;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

// 빈 관례
/**
 
모든 멤버 변수는 기본
*/
public class CalcBean {
    private String num1;
    private String num2;
    private String operator;

    private int result;

    public CalcBean() {
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getResult() {
        return result;
    }

    public void calculate() {
        if (this.num1 == null) this.num1 = "0";
        if (this.num2 == null) this.num2 = "0";
        if (this.operator == null) this.operator = "+";

        CalcService calc = new CalcService(Integer.parseInt(num1), Integer.parseInt(num1), this.operator);
        this.result = calc.getResult();

        Map<String, BinaryOperator<Integer>> calcMap = new HashMap<>();

        calcMap.put("+", (a, b) -> a + b);
        calcMap.put("-", (a, b) -> a - b);
        calcMap.put("*", (a, b) -> a * b);
        calcMap.put("/", (a, b) -> a / b);

        this.result = calcMap
                .get(operator)
                .apply(Integer.parseInt(num1), Integer.parseInt(num2));
    }


}