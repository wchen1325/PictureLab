/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft(){
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorVerticalRightToLeft();
    temple.explore();
  }

  public static void testMirrorHorizontal(){
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorHorizontal();
    temple.explore();

  }
  public static void testMirrorHorizontalBotToTop(){
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorHorizontalBotToTop();
    temple.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorDiagonal()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorDiagonal();
    temple.explore();
  }

  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testKeepOnlyBlue(){
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  public static void testNegate(){
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  public static void testGrayscale(){
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }

  public static void testFixUnderwater(){
    Picture water = new Picture("water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }

  public static void testMirrorArms(){
    Picture water = new Picture("snowman.jpg");
    water.explore();
    water.mirrorArms();
    water.explore();
  }

  public static void testMirrorGull(){
    Picture water = new Picture("seagull.jpg");
    water.explore();
    water.mirrorGull();
    water.explore();
  }

  public static void testCopy(){
    Picture water = new Picture("seagull.jpg");
    Picture water2 = new Picture("redMotorcycle.jpg");
    water.explore();
    water2.copy(water,0,450,0,600);
    water2.explore();
  }

  public static void testMyCollage(){
    Picture collage = new Picture(1000,1000);
    Picture robot = new Picture("robot.jpg");
    collage.copy(robot,0,100,1,100);
    robot.mirrorHorizontal();
    collage.copy(robot,200,300,200,300);
    robot.keepOnlyBlue();
    collage.copy(robot,100,200,100,200);
    collage.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    testMyCollage();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}