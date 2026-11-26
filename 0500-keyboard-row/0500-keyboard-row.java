class Solution {
    public String[] findWords(String[] words) {
        String arr[] = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
        ArrayList<String>as=new ArrayList<>();
        for (String word : words) {
            for (String check : arr) {
                String low = "";
                for (char ch : word.toCharArray()) {
                    low += String.valueOf(Character.toLowerCase(ch));
                }
                int count = 0;
                for (char ch : low.toCharArray()) {
                    if (check.contains(String.valueOf(ch))) {
                        count++;
                    }
                }
                if (count == low.length()) {
                    as.add(word);
                    break;
                }
            }
        }
        if(as.size()==0||as.isEmpty())
        {
            return new String[]{};
        }
        String arr1[]=as.toArray(new String[0]);
        return arr1;
    }
}