func checkGoodInteger(n int) bool {
  var di_sq int =sq(n)
  var di_su int =su(n)
  return di_sq-di_su>=50
}
func sq(n int)int{
    sum:=0
    for n>0{
        dig:=n%10
        sum+=dig*dig
        n/=10
    }
    return sum
}
func su(n int)int{
    sum:=0
    for n>0{
        dig:=n%10
        sum+=dig
        n/=10
    }
    return sum

}