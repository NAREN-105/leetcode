func smallestNumber(n int, t int) int {
    for true{
        if digit(n)%t==0{
            return n
        }
        n++
    }
    return n
}
 func digit(n int )int{
    sum:=1
    for n>0{
        sum*=n%10
        n/=10
    }
    return sum
 }