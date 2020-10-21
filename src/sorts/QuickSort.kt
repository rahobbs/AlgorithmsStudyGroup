package sorts

fun quickSort(inputList: List<Int>): List<Int> {
    if (inputList.size < 2) {
        return inputList
    } else {
        val pivotValue = inputList[inputList.size / 2]
        val leftSide = mutableListOf<Int>()
        val rightSide = mutableListOf<Int>()
        val equalToPivots = mutableListOf<Int>()

        for (i in inputList) {
            if (i < pivotValue) {
                leftSide.add(i)
            } else if (i == pivotValue) {
                equalToPivots.add(i)
            } else {
                rightSide.add(i)
            }
        }
        return quickSort(leftSide) + equalToPivots + quickSort(rightSide)
    }
}
