package main
import(
    "fmt"
)
func countOperations(num1 int, num2 int) int {
    op:=0
    for (num1!=0&&num2!=0){
        if num1>=num2{
            num1-=num2
            op++
        } else {
           num2-=num1
           op++
        }
    }
    return op
}