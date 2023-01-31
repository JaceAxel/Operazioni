package it.uniroma2.pernasetti;

public class Main {

    public static void main(String[] args) {
        double result = 0;
        if (args.length == 2 || args.length == 3) {
            if (args[0] == "rad") Math.sqrt(Double.parseDouble(args[1]));
            if (args[0] == "log") Math.log10(Double.parseDouble(args[1]));
            if (args[0] == "piu") result = Double.parseDouble(args[1]) + Double.parseDouble(args[2]);
            if (args[0] == "meno") result = Double.parseDouble(args[1]) - Double.parseDouble(args[2]);
            if (args[0] == "div") result = Double.parseDouble(args[1]) / Double.parseDouble(args[2]);
            if (args[0] == "per") result = Double.parseDouble(args[1]) * Double.parseDouble(args[2]);
            //System.out.println("Risultato:" + Math.sqrt(Double.parseDouble(args[1])));
        }
        else{
            System.exit(1);
        }
    }
}