
class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null) return result;

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(s);
        visited.add(s);

        boolean found = false;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<String> levelValidStrings = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                String curr = queue.poll();

                if (isValid(curr)) {
                    levelValidStrings.add(curr);
                    found = true;
                }
                if (!found) {
                    for (int j = 0; j < curr.length(); j++) {
                        char c = curr.charAt(j);
                        if (c != '(' && c != ')') {
                            continue;
                        }
                        String nextState = curr.substring(0, j) + curr.substring(j + 1);
                        if (!visited.contains(nextState)) {
                            visited.add(nextState);
                            queue.add(nextState);
                        }
                    }
                }
            }
            if (found) {
                return levelValidStrings;
            }
        }

        return result;
    }
    private boolean isValid(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}
