import java.text.DecimalFormat;
import java.util.Scanner;

public class Tests {
    private double ave;
    private int count;
    private int score;

//public Constructor(s)

    public Tests() {
        this.setAve(0);
        this.setCount(0);
        this.setScore(0);
    }

//public set or mutator method for every private data field.

    public void setAve(double newAve) {
        this.ave = newAve;
    }

    public void setCount(int newCount) {
        this.count = newCount;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }


//public get or accessor method for every private data field

    public double getAve() {
        return this.ave;
    }

    public int getCount() {
        return this.count;
    }

    public int getScore() {
        return this.score;
    }

    public void getAverage() {
        boolean loopRun = true;

        double sum = 0;
        int localCount = 0;

        System.out.println("Please enter test scores. Enter -1 when you are done entering scores to be averaged.");
        while (loopRun){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the test score(s) now: ");

            int testScore = scan.nextInt();

            if (testScore == -1){
                break;
            }

            sum += testScore;

            localCount += 1;

            this.setCount(localCount);
            this.setScore(testScore);
        }

        setAve(sum/getCount());

        // Test of getAverage function.\/
        //System.out.println(getAve());
    }

//public toString method that prints out all of the object state

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.##");
        String finalAve = df.format(this.ave);

        String output = "The average of the " + this.count + " scores entered is " + finalAve + ".";
        return output;
    }
}



