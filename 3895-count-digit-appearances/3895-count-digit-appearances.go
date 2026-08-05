func countDigitOccurrences(nums []int, digit int) int {
sum:=0
for i:=0;i<len(nums);i++{
    if nums[i]<=9{
        if nums[i]==digit{
            sum++
        }
    } else{
        var val int=nums[i]
        for val>0{
          dig:=val%10
          if dig==digit{
            sum++
          }
          val/=10;
        }
    }  
}
return sum    
}