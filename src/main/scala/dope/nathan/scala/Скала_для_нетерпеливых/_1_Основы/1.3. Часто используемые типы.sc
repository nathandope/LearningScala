// все является объектом
// нет оберток => нет боксинга и анбоксинга
// компилятор берет это на себя
1.toString
// Int преобразуется в RichInt
1.to(10)

// java.lang.String неявно преобразуется в StringOps
"Hello".intersect("World")

// методы преобразования, а не операции приведения
"99.44".toDouble



