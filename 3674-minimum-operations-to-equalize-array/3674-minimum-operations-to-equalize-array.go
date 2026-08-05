func minOperations(nums []int) int {
    sum:=0
    for i:=0;i<len(nums)-1;i++{
        if(nums[i]!=nums[i+1]){
            sum++
            break
        }
        
    }
    return sum
}