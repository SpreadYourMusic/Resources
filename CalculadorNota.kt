val integrantes_horas: List<Pair<String, Double>> = arrayListOf(
        Pair("Abel", 130.5),
        Pair("Alex", 58.5),
        Pair("Jorge Pinilla", 51.0),
        Pair("Ángel", 47.0),
        Pair("Jorge Aznar", 44.0),
        Pair("Oscar", 31.0),
        Pair("Yasmina", 10.0)
)

fun main(args: Array<String>) {
    integrantes_horas.sortedBy {
        it.second
    }

    val horas_totales_out = integrantes_horas.reduceRight { act, acc ->
        Pair("", act.second + acc.second)
    }.second

    println("Puntuaciones obtenidas suponiendo el siguiente reparto de horas")

    for (i in integrantes_horas){
        println("${i.first}: ${i.second}")
    }

    for (i in 10 downTo  1){
        println("----------------------------------------------------------------")
        val nota = i.toDouble()
        println("Reparto de puntos suponiendo una nota en el proyecto de $nota puntos")

        var nota_a_repartir = nota * 7.0
        var horas_totales = horas_totales_out

        for (j in 0 until integrantes_horas.size) {
            val punto_por_hora = nota_a_repartir / horas_totales

            val actual = integrantes_horas[j]
            var nota_integrante = (punto_por_hora * actual.second)
            if(nota_integrante > 10.0) nota_integrante = 10.0
            nota_a_repartir = nota_a_repartir - nota_integrante
            horas_totales = horas_totales - actual.second

            println("${actual.first}: ${nota_integrante}")
        }

    }
}