fun main() {
    print(solution("c2"))
}

fun solution(cell: String): Int {
    var moves = 0
    if ((cell[1].digitToInt() + 2) < 9 && cell[0] < 'h') {
        moves++
    }
    if ((cell[1].digitToInt() + 1) < 9 && cell[0] < 'g') {
        moves++
    }
    if ((cell[1].digitToInt() - 2) > 0 && cell[0] < 'h') {
        moves++
    }
    if ((cell[1].digitToInt() - 1) > 0 && cell[0] < 'g') {
        moves++
    }
    if ((cell[1].digitToInt() + 2) < 9 && cell[0] > 'a') {
        moves++
    }
    if ((cell[1].digitToInt() + 1) < 9 && cell[0] > 'b') {
        moves++
    }
    if ((cell[1].digitToInt() - 2) > 0 && cell[0] > 'a') {
        moves++
    }
    if ((cell[1].digitToInt() - 1) > 0 && cell[0] > 'b') {
        moves++
    }
    return moves
}