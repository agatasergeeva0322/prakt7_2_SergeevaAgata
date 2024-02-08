import kotlin.math.pow
import kotlin.math.round
import kotlin.math.exp
import kotlin.math.abs
import kotlin.math.ln
fun main() {
    try
    {
        println("Задание 7")
        print("Введите a: ")
        var a = readLine()!!.toDouble()
        print("Введите b: ")
        var b = readLine()!!.toDouble()
        print("Введите c: ")
        var c = readLine()!!.toDouble()
        when {
            a >= b && b >= c -> {
                a *= 2
                b *= 2
                c *= 2
            }

            else -> {
                a = abs(a)
                b = abs(b)
                c = abs(c)

            }
        }
        println("a: $a \nb: $b \nc: $c")
    }
    catch (e:Exception)
    {
       println("Ошибка")
    }

    try
    {
        println("\nЗадание 17")
        print("Введите k: ")
        var k = readLine()!!.toDouble()
        print("Введите l: ")
        var l = readLine()!!.toDouble()
        print("Введите n: ")
        var n = readLine()!!.toDouble()
        print("Введите m: ")
        var m = readLine()!!.toDouble()
        when
        {
            l % k == 0.0 && n % k == 0.0 && m % k == 0.0 -> println("k является делителем l, n, m")
            else -> println("k не является делителем для всех чисел, введённых после него")

        }
    }
    catch (e:Exception)
    {
                println("Ошибка")
    }

    try
    {
        println("\nЗадание 27")
        print("Введите a: ")
        var a1 = readLine()!!.toDouble()
        print("Введите b: ")
        var b1 = readLine()!!.toDouble()
        print("Введите c: ")
        var c1 = readLine()!!.toDouble()
        if (a1>0&&b1>0&&c1>0) {
            when {
                (a1 + b1) > c1 && (a1 + c1) > b1 && (b1 + c1) > a1 -> {
                    var p = a1 + b1 + c1
                    var pp = p / 2
                    var s = String.format("%.2f", (Math.sqrt(pp * (pp - a1) * (pp - b1) * (pp - c1))))
                    println("Если бы из отрезков составили треугольник, то: \nПериметр - $p \nПлощадь - $s")
                }

                else -> println("Данные отрезки не могут быть сторонами треугольника")
            }
        }
        else println("Проверьте данные, которые вы ввели. Среди них есть отрицательное")
    }
    catch (e:Exception)
    {
        println("Ошибка")
    }

    try {
        println("\nЗадание 35")
        print("Введите k: ")
        var k2 = readLine()!!.toDouble()
        print("Введите a: ")
        var a2 = readLine()!!.toDouble()
        print("Введите b: ")
        var b2 = readLine()!!.toDouble()
        var D = a2.pow(2) - 4 * b2
        var mk = -k2
        when {
            D >= 0.0 -> {
                if (Math.sqrt(D) <= k2) {
                    var x1 = (-b2 + Math.sqrt(D)) / 2
                    var x2 = (-b2 - Math.sqrt(D)) / 2
                    println("x1: ${"%.2f".format(x1)}\nx2: ${"%.2f".format(x2)}")
                    if ((-k2 < x1 && x1 < k2) && (-k2 < x2 && x2 < k2)) println("Корни уравнения попадают в интервал ($mk; $k2)")
                    else println("Корни уравнения не попадают в интервал ($mk;$k2)")
                }
                else println("Корни уравнения не попадают в интервал ($mk;$k2)")
            }
            else -> println("Уравнение не имеет корней")
        }
    }
    catch (e:Exception)
    {
        println("Ошибка")
    }

    try
    {
        println ("\nЗадание 37")
        print ("Введите x1: ")
        var x11 = readLine()!!.toDouble()
        print ("Введите y1: ")
        var y11 = readLine()!!.toDouble()
        print("Введите x2: ")
        var x22 = readLine()!!.toDouble()
        print("Введите y2: ")
        var y22 = readLine()!!.toDouble()
        print("Введите радиус: ")
        var R = readLine()!!.toDouble()
        print("Введите ( ... : 0 ): ")
        var P = readLine()!!.toDouble()
        if (R>0)
        {
            if (((x11-P).pow(2)+y11.pow(2))<R.pow(2) && ((x22-P).pow(2)+y22.pow(2))<R.pow(2))
                println("Обе точки находятся внутри полуокружности")
            else if (((x11-P).pow(2)+y11.pow(2))<R.pow(2)) println("Только первая точка находится внутри полуокружности")
            else if (((x22-P).pow(2)+y22.pow(2))<R.pow(2)) println("Только вторая точка находится внутри полуокружности")
            else println ("Ни одна из точек не находится в полуокружности")
        }
        else println("Радиус не может быть отрицательным")
    }
    catch (e:Exception)
    {
        println("Ошибка")
    }

}