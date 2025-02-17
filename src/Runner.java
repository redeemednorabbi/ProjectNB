public class Runner {
    public static void main(String[] args)
    {
        /*
        Old code:

        double x1=50.31, x2=99.21, x3=75.27;
        double x4 = (x1+x2+x3)/3;
        DecimalFormat fmt = new DecimalFormat("#.##");
        System.out.println("The following is a list of all test scores.\nTest 1: "+ x1 +"\nTest 2: "+ x2 +"\nTest 3: "+ x3 +"\nThe average of the previous tests is: "+ fmt.format(x4));
        */

        Tests test1 = new Tests();
        test1.getAverage();
        System.out.println(test1.toString());
    }

}