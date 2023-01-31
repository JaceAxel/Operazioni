package it.uniroma2.pernasetti;

public class Main {

    public static void main(String[] args) {
        if (args.length == 2 || args.length == 3) {
            if (args[0].equals("rad")) operationA(args[0], args[1]);
            if (args[0].equals("log")) operationA(args[0], args[1]);
            if (args[0].equals("piu")) operationB(args[0], args[1], args[2]);
            if (args[0].equals("meno")) operationB(args[0], args[1], args[2]);
            if (args[0].equals("div")) operationB(args[0], args[1], args[2]);
            if (args[0].equals("per")) operationB(args[0], args[1], args[2]);
        }
        else{
            System.exit(1);
        }
    }

    public static double operationA(String op, String num){
        double result = 0;
        if (op.equals("rad")) result = Math.sqrt(Double.parseDouble(num));
        if (op.equals("log")) result = Math.log10(Double.parseDouble(num));
        return result;
    }

    public static double operationB(String op, String num1, String num2){
        double result = 0;
        if (op.equals("piu")) result = Double.parseDouble(num1) - Double.parseDouble(num2);
        if (op.equals("meno")) result = Double.parseDouble(num1) - Double.parseDouble(num2);
        if (op.equals("div")) result = Double.parseDouble(num1) / Double.parseDouble(num2);
        if (op.equals("per")) result = Double.parseDouble(num1) * Double.parseDouble(num2);
        return result;
    }
}