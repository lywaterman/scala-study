object Hi { 
  def fib(n: BigInt) = {
  var a:BigInt = 0
  var b:BigInt = 1

  def next(a: BigInt, b: BigInt) = Pair(b, a+b);

  var i = 0

  while(i < n) {
    val Pair(c, d) = next(a, b);

    a = c
    b = d

    i = i + 1
  }

  a

}

import com.twitter.util.Eval
import java.io._
  
def main(args: Array[String]) = {
    val eval = new Eval
    eval.compile(eval.toSource(new File("fib.sca")))
    //val value = eval.apply[Int]("test.x=test.fib(40); test.x", false)
    eval.apply[Unit](eval.toSource(new File("fib_call.sca")), false)
    //eval.compile(eval.toSource(new File("fib.sca")))
    //val value1 = eval.apply[Int]("test.x", false)
   
   }
}
