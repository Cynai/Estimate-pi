import java.util.concurrent.ThreadLocalRandom;

public class Points {
    /*
    coordinates are a random point which falls into the square, and may fall into the circle
    I have put them as an attribute in case I use a graph in a future update

    inCircle is a counter which increments by 1 every time a point lands inside a circle
     */
    double[] coordinates = {0, 0};
    static int inCircle;

    //Set two random x and y values
    Points(double length){
        //create a random x-value and y-value for the point within the square
        for(int i =0; i<2; i++) {
            coordinates[i] = ThreadLocalRandom.current().nextDouble(0, length);
        }
        if(Circle.isInCircle(coordinates)){
            inCircle ++;
        }
    }


}
