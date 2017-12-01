
/***
* Example JUnit testing class for Circle2 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle2Test
{
   // Data you need for each test case
   private Circle2 circle1;
   private Circle2 testcircle; 

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle2(1,2,3);
   testcircle = new Circle2(4,5,6); 
	
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}

///my test///

//simple scale
@Test
public void simpleScale()
{
	System.out.println("scale test");
	double r = 3.0;
	r = circle1.scale(r);
	Assert.assertTrue(r == 9);
}

@Test
public void simplemove2()
{

	System.out.println("no movement test");
	Point p; 
	p = circle1.moveBy(0,0);
        Assert.assertTrue(p.x == 1 && p.y == 2);
}



@Test
public void simpleIntersect()
{
	System.out.println("Test intersect");
	Assert.assertTrue(circle1.intersects(testcircle));
}

/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}
