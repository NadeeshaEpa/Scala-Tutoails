object question2 extends App{
      var (a:Int,b:Int,c:Int,d:Int)=(2,3,4,5)
      var k:Double = 4.3
      var g:Double = 4.0
      //println( - -b * a + c *d - -); In scala this statement won't be work because it does
                                       // not has an decrement operator.
                                      //But if we evaluate this using java it gives us
                                     //println(--3*2+4*5--)
                                    //=(2*2+4*5) 
                                   //=4+20=24


      //println(a++);//In scala this statement won't be work because it does
                  // not has an decrement operator.
                 //But if we evaluate this using java it gives us
                //println(2++)
               //In here 2++ will return the value 2 and incerement it by 1.Value of a is now 3.
              //Output is 2. 
              //=2


      println (-2*(g-k)+c); //execute in both languges and gives 4.6 as the output.
      
      //println (c=c++);  does not execute in scala.In java this will return 4 as the output.


      //println (c=++c*a++); we can't execute this in scala because of increment operator.
                            //Value of c is now 4 and value of a is now 3.
                           //But in java c=++4*3++=5*3=15
                          //This will return 15

      
}
