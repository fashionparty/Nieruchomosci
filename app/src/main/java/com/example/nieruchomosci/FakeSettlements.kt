package com.example.nieruchomosci

sealed class FakeSettlements(
    val month: String,
    val date: String,
    val dueDate: String,
    val balance: String,
    val bill: String,
    val payment: String,
    val toPay: String,
    val isSettled: Boolean
) {
    class Styczen(): FakeSettlements(
        month = "STYCZEŃ",
        date = "03-01-2022",
        dueDate = "21-01-2022",
        balance = "32,24 PLN",
        bill = "-438,44 PLN",
        payment = "0 PLN",
        toPay = "-406,20 PLN",
        isSettled = false
    )

    class Grudzien(): FakeSettlements(
        month = "GRUDZIEŃ",
        date = "01-12-2021",
        dueDate = "14-12-2021",
        balance = "32,24 PLN",
        bill = "-438,44 PLN",
        payment = "438,44 PLN",
        toPay = "32,24 PLN",
        isSettled = true
    )

    class Listopad(): FakeSettlements(
        month = "LISTOPAD",
        date = "01-11-2021",
        dueDate = "14-11-2021",
        balance = "32,24 PLN",
        bill = "-438,44 PLN",
        payment = "438,44 PLN",
        toPay = "32,24 PLN",
        isSettled = true
    )
}
