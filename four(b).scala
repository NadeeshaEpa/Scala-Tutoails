object question4b extends App{
       def attendence(tprice:Int):Int={
         return 120+(15-tprice)/5*20
       }
       def tcost(tprice:Int):Int={
         return attendence(tprice)*tprice
       }
       def cost(tprice:Int):Int={
         return 500+attendence(tprice)
       }
       def profit(tprice:Int):Int={
         return tcost(tprice)-cost(tprice)
       }
       val result=profit(5)
       printf("%d",result)
}