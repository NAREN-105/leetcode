func countPartitions(nums []int) int {
var ele int = nums[0]
count:=0
for  i:=1;i<len(nums);i++ {
 var val int =find(i,nums)
  diff:=val-ele
  if diff%2==0{
    count++
  }
  ele+=nums[i]
  
}  
return count  
}
func find(n int ,nums[] int)int{
    sum:=0
    for i:=n;i<len(nums);i++{
        sum+=nums[i];
    }
    return sum
}