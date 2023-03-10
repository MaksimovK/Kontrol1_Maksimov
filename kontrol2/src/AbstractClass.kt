abstract class AbstractClass(): Interface {
    abstract var marka: String
    abstract var otprav: String
    abstract var naznach: String
    abstract var data: String
    abstract var timeotprav: Int
    abstract var timevPuti: Int

    override fun Speed() {
        println("Скорость самолёта 100000км/ч")
    }

    override fun timeOtprav() {
        try {
                        var time: Int
            do {
                print("Введите час отправления: ")
                time = readLine()!!.toInt()
            } while (time <= 0)
            println("Время отправления $time")
        }
        catch (ex: Exception)
        {
            println(ex.message)
        }
    }

    override fun timevPuti() {
        println("Время в пути 136 минут")
    }

}