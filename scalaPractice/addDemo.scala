object addDemo{
    def main(args: Array[String]){
        println("returned value " +addInt(2,7))
        }
    def addInt(a:Int, b:Int):Int={
        var sum:Int =0
        sum=a+b
        return sum
    }    
}