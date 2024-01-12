import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
	// Write your code here
	val hours = s.substring(0, 2)
	val ap = s.substring((s.length-2)).lowercase()
	if(ap.equals("pm")){
		if((hours.toInt()+12)==24) {
			return s.substring(0, s.length - 2)
		}else {
			return (hours.toInt()+12).toString() + s.substring(2, s.length - 2)
		}
	}else{
		if((hours.toInt()+12)==24) {
			return "00" + s.substring(2, s.length - 2)
		}else {
			return s.substring(0, s.length - 2)
		}
	}
}

fun main(args: Array<String>) {
	val s = readLine()!!

	val result = timeConversion(s)

	println(result)
}