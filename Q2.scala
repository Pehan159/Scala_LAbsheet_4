import scala.io.StdIn
object Labsheet{
def main(args: Array[String]): Unit ={

	println("Enter integer: ")
	var num = StdIn.readInt()

	var result = calEvenOrOdd(num)
	println (result);



}

def calEvenOrOdd(num1: Int): String ={
	if( num1 < 0){
		"Negative"
	}
	else if (num1==0) {
		"Zero"

	}
	else if (num1%2==0){
		"Even"
		
	}else{
		"Odd"
	}
}

}

