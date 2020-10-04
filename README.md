# Estimate-pi
A simple program which estimates the value of pi.

Done in java because I wanted to practice my object oriented programming, 
although this approach is not recommended usually as the only infomation you truly need is the radius. Scripting would be better

* [How it works](#How-it-works)
* [Step-by-step](#Step-by-step)
* [Possible updates](#Possible-updates)
* [Proof of pi calculation](#Proof-of-pi-calculation)


## How it works
Essentially 2 shapes are made, a circle and a square. 
The circle has a radius which is chosen by the user.
The square has a side length equivalent to the radius of the circle.
only the circle needs to be defined as an object, as going by the radius alone is enough infomation for the project.
The circle sits inside the square, such as [this](https://geometryhelp.net/wp-content/uploads/2019/08/Circle-inscribed-in-a-square.jpg).
The centre of the circle is calculated, which is important when it comes to finding if a dot is within a circle or not.

From here, a series of points which contain a random x and y coordinate value are created.
These values are garunteed to fall within the square, and may fall within the circle.
Using pythagoras's theorem, we can find the distance between the centre of the circle and each dot.
If the calculated length is more than the radius, it must have fallen outside of the circle.
Finally, the equation pi=4*(number of points landing in the circle)/(number of points created) gives us pi!

## Step-by-step
1. The user inputs a value f.
  -   If the user enters an invalid value, a helpful message is displayed and they can try again
  
2. An object in the Circle class is created with the attribute radius being set to this.

3. The user inputs how many simulations they want to try.
  - If the user enters an invalid value, a helpful message is displayed and they can try again

4. An instance of the point class is continuously called until the number of simulations it met.
This is because I have set the constructer to create random coordinates within the square and see where they land
  -   If a point lands inside the circle, the static variable isInCircle increments by 1 within the Points class

5.Pi is calculated and printed.


## Possible updates
- adding a GUI, along with an animation of how the program works
- Doing multiple simulations, and calculating the mean of all the pi results

## Proof of pi calculation
This is loose proof I came up with of the method I used to calculate pi.
BY NO MEANS IS THIS A CONCRETE PROOF, just a simple explination.

let radius = r
Area of a circle = pi * radius^2
Area of a square = length^2

since the length of one side of the square is equivelent to 2*radius, we can say:
Area(s) = 4 radius^2

The area of a circle equation can be rearranged to give us:
radius = squareRoot(Area(c)/pi)

Subsitute this into Area(s):
Area(s) = 4*(squareRoot(Area(c)/pi))^2
Area(s) = 4*(Area(c)/pi)

Rearrange this and we get:
pi = 4 * Area(c)/Area(s)

Essentialy, Area(c)/Area(s) means the ratio of area of the circle to the square, so this can be approximated to:
pi = 4 * (number of dots in the circle)/(number of simulations, as dots can only be placed within the square)




