fun main(){
    val timeOnline = 8600 // в секундах

    when{
        timeOnline < 60 -> println("был(а) в сети только что")
        timeOnline >= 60 && timeOnline < 3600 -> MinuteAgo(timeOnline)
        timeOnline >= 3600 && timeOnline < 86400 -> HourAgo(timeOnline)
        timeOnline >= 86400 && timeOnline < 172800 -> println("был(а) в сети вчера")
        timeOnline >= 172800 && timeOnline < 259200 -> println("был(а) в сети позавчера")
        else -> println("был(а) в сети давно")
    }
}

fun MinuteAgo(time : Int){
    var  minute = (time / 60)
    minute = minute.toInt()
    when{
        minute in 2..4 -> println("был(а) в сети $minute минуты назад")
        minute == 1 -> println("был(а) в сети $minute минуту назад")
        minute > 20 && minute % 10 == 1 -> println("был(а) в сети $minute минуту назад")
        minute > 20 && minute % 10 in 2..4 -> println("был(а) в сети $minute минуты назад")
        else -> println("был(а) в сети" + minute + "минут назад")
    }
}

fun HourAgo(time: Int){
    var  hour = (time / 3600)
    hour = hour.toInt()
    when{
        hour == 1 || hour == 21 -> println("был(а) в сети $hour час назад")
        hour in 2..4 || hour in 22..24 -> println("был(а) в сети $hour часа назад")
        else -> println("был(а) в сети $hour часов назад")
    }

}