package com.virtuslab

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  case class AAA(aa: String, bb : Boolean, spp : Int)
  val settings =""
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
    val a = Array(1,2,3)/**/map(_.toString) /* very long
      multiline
      string */

    try{
      val asd = 123
    } catch {
      case t : Throwable =>
    } finally {
      val dd = 234
    }
      def */ () = ""
  
  }


}
