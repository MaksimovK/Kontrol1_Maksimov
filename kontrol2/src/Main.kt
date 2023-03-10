import kotlinx.coroutines.*

suspend fun main() = coroutineScope<Unit> {
    try {
        val airClass = Air()
        var n: Int
        do {
            print("Введите кол-во повторений: ")
            n = readLine()!!.toInt()
        } while (n <= 0)
        launch {
            for (i in 1..n) {
                delay(3000L)
                airClass.timeOtprav()
            }
        }
        airClass.Speed()
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}