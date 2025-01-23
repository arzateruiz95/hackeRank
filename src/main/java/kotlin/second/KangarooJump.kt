class KangarooJump {
    /*
    * Complete the 'kangaroo' function below.
    *
    * The function is expected to return a STRING.
    * The function accepts following parameters:
    *  1. INTEGER x1
    *  2. INTEGER v1
    *  3. INTEGER x2
    *  4. INTEGER v2
    */
    fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
        if ((x2 > x1 && v2 > v1) || (x1 > x2 && v1 > v2)) return "NO"
        var k1Jumps = x1
        var k2Jumps = x2
        while (k1Jumps <= k2Jumps) {
            k1Jumps += v1
            k2Jumps += v2
            if (k1Jumps == k2Jumps) return "YES"
        }

        return "NO"
    }
}

