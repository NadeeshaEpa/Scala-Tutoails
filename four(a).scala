object question4a extends App{
       def normal(x:Int):Double=x*250
       def OT(y:Int):Double=y*85
       def total(x:Int,y:Int):Double={
         return normal(x)+OT(y)
       }
       def tax(x:Int,y:Int):Double={
         return total(x,y)*12/100
       }
       def takehome(x:Int,y:Int):Double={
         return total(x,y)-tax(x,y)
       }
      val salary=takehome(40,30)
      
      printf("%.3f",salary) 
    
  
}