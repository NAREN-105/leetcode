func commonFactors(a int, b int) int {
    var  i int =1
    var  count int =0
    for i<=a{
        if a%i==0&&b%i==0{
        count++
        }
        i++
    }
    return count
}