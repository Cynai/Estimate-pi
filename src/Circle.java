import java.util.Arrays;



public class Circle {
    //Create circle with one attribute "radius"
    static double radius;

    //create a constructor which defines the radius
    Circle(double radius){
        this.radius = radius;
    }


    /*
    Uses pythagoras's theorem to see if point is within a circle
    Distance between two points is x2-x1 (righthand point - lefthand point)
    We use the radius as a point because one radius length along the x/y axis is the centre point

    Therefore, if the length of the line produced from the centre of the circle to a point is longer than the radius,
    the point must be outside the circle and therefore, due to the bounds I have set for the random point generator,
    inside the rectangle
     */
    static boolean isInCircle(double[] coordinates){
        double pointCalculation = Math.sqrt( Math.pow( coordinates[0] - radius,2) + Math.pow(coordinates[1] - radius,2));
        //System.out.println(Arrays.toString(coordinates));
        if (pointCalculation > radius){
            return false;
        }
        return true;

    }
}
