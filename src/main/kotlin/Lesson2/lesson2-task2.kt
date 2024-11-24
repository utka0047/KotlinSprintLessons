package Lesson2

fun main() {
    var oldWorkers = 50
    var salaryOldWorkers = 30_000
    var oldSalaryFund = oldWorkers * salaryOldWorkers

    var newWorkers = 30
    var salaryNewWorkers = 20_000
    var newSalaryFund = newWorkers * salaryNewWorkers

    var totalWorkers = oldWorkers + newWorkers
    var totalSalaryFund = oldSalaryFund + newSalaryFund
    var average = totalSalaryFund / totalWorkers

    println(oldSalaryFund)
    println(totalSalaryFund)
    println(average)

}