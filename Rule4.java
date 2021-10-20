import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Rule4 {
    static Scanner in = new Scanner(System.in);

    static File rule4 = new File("C:/Users/Daniel/Desktop/Rule4_ErrorProp/Four.txt");

    public static double Rule4(int inputs){

        double[] uncert = new double[inputs];
        double[] data = new double[inputs];
        double[] power = new double[inputs];
        double value = 0;

        for(int i = 0; i < inputs; i ++){
            System.out.print("What is the value of your measurmnet? ");
            value = in.nextDouble();

            System.out.print("What is the uncertentiy of your " + (i + 1) + " error? ");
            uncert[i] = in.nextDouble();

            System.out.print("What is the measurment of your " + (i + 1) + " piece of data? ");
            data[i] = in.nextDouble();

            System.out.print("To what power is your " + (i + 1) + " measurmnet? ");
            power[i] = in.nextDouble();
            System.out.println();
        }

        double temp = 0;

        for(int i = 0; i < inputs; i ++){
            temp += Math.pow(((power[i] * uncert[i]) / data[i]), 2.0);

        }

        return Math.sqrt(temp) * value;

    }

    public static double Rule4TXT(int inputs) throws FileNotFoundException{
        Scanner txt = new Scanner(rule4);
        double[] uncert = new double[inputs];
        double[] data = new double[inputs];
        double[] power = new double[inputs];
        double value = 0;


        value = txt.nextDouble();

        for(int i = 0; i < inputs; i ++){

            uncert[i] = txt.nextDouble();


            data[i] = txt.nextDouble();


            power[i] = txt.nextDouble();
        }

        double temp = 0;

        for(int i = 0; i < inputs; i ++){
            temp += Math.pow(((power[i] * uncert[i]) / data[i]), 2.0);

        }

        return Math.sqrt(temp) * value;

    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("How many pieces of data do you have? ");
        System.out.printf("%s%.4f", "The Uncertentiy is: ", Rule4TXT(in.nextInt()));
    }

}
