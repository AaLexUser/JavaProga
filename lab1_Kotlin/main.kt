fun main(){
    val a = mutableListOf<Short>()
    for (i in 6..20 step 2) {
        a.add(i.toShort())

    }
    val x = Array<Float>(17,{0.toFloat()})
    for (i in 0..16) {
        x[i] = (-3 + Math.random() * 18).toFloat()
    }
    val ans = Array(8,{Array<Double>(17,{0.toDouble()})})
    for (i in 0..a.size-1) {
        for (j in 0..x.size-1) {
            if (a[i] == 16.toShort()) {
                ans[i][j] = Math.pow(Math.E, Math.pow(2.0 / 3 + x[j] * (x[j] - 1), 3.0))
            }
            else if (a[i] == 6.toShort() || a[i] == 12.toShort() || a[i] == 18.toShort() || a[i] == 20.toShort()) {
                ans[i][j] = 1.0 / 3 * Math.log(
                    Math.pow((Math.abs(x[j]) + 1).toDouble(), x[j].toDouble()))
            }
            else {
                ans[i][j] = (1.0 / 2) / (3 - Math.atan(Math.cos(x[j].toDouble())))
            }
        }
    }
    for (i in 0..7) {
        for (j in 0..16) {
            if (java.lang.Double.isInfinite(ans[i][j]) || ans[i][j] > 10000000) {
                print("Infin\t") //Infinity name is too long replace with Infin
            }
            else {
                System.out.printf("%.2f\t", ans[i][j].toFloat())
            }
        }
        print("\n")
    }
}