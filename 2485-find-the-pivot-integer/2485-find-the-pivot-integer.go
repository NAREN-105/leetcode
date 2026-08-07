package main
import(
    "fmt"
    "math"
)
func pivotInteger(n int) int {
    var tot int=n*(n+1)/2
    var pi int=(int(math.Sqrt(float64(tot))))
    if pi*pi==tot{
        return pi
    }
    return -1;
}