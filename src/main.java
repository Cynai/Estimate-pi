import java.util.Scanner;
public class main {

    static double radius;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]){
        System.out.println("Welcome to pi estimation!");
        System.out.print("What size of circle would you like?\n:");

        //Make sure user has entered a value for the radius not equal to 0
        boolean flag = false;
        do{
            try {
                radius = Math.signum(scanner.nextDouble());
                while(radius==0){
                    System.out.print("Please enter a non 0 value for the radius\n:");
                    radius = Math.signum(scanner.nextDouble());
                }
                flag = true;
            }
            catch(Exception e){
                System.out.print("Please type in numbers, such as 1 2 3 etc\n:");
                scanner.next(); //needed to avoid an infinate loop. Consumes token (thanks samitgaur from stackoverflow!)
            }
        }while(flag == false);


        //Create an object Circle with the desired radius
        Circle circle = new Circle(radius);
        count();
    }

    /*
    This is a procedure which asks the user how many samples they want, runs the simulation, and calculates an estimated
    value of pi
    For improved results, carry out multiple simulations and find the mean for all the values of pi produced
     */
    static int limit;
    public static void count(){
        System.out.print("How many random points would you like?\n:");



        //Check to make sure user has entered an integer greater than 0 for number of simulations
        boolean flag = false;
        do {
            try {
                limit = scanner.nextInt();
                while (limit <= 0) {
                    System.out.print("Please run at least one simulation\n:");
                    limit = scanner.nextInt();
                }
                flag = true;
            }
            catch (Exception e){
                System.out.print("Please enter integers, such as 1, 2,3 etc\n:");
                scanner.next(); //Explained on the do-while above
            }
        }while(flag == false);




        for(int i=0; i<limit; i++){
            Points point = new Points(radius);
        }

        //loose proof as to why this equation works on the readme
        double pi = 4.0 * Points.inCircle/limit;
        System.out.println("With " + limit + " simulations, I have estimated pi to be around " + pi);
    }
}
