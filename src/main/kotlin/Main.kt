import java.util.*

fun main() {
    val comissRuble = 3500
    val comissPercent = 75
    println("Сумма комиссии 0,75% - минимум 35 рублей")
    println("Введите сумму")
    val scan = Scanner(System.`in`)
    val summa = scan.nextDouble()

    val amount: Int = (summa * 100).toInt()
    val percent = amount * comissPercent / 10000

    val komiss: Int = if (percent < comissRuble) {
        comissRuble
    } else {
        percent
    }
    val resultAmount = amount.toDouble() / 100
    val resultComiss = komiss.toDouble() / 100
    val resultAll = (amount + komiss).toDouble() / 100

    println("Сумма перевода $resultAmount рублей")
    println("Комиссия составила $resultComiss рублей")
    println("Итого к оплате: $resultAll рублей")
}