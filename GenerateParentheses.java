class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtracking(ans, new StringBuilder(), n, 0,0);
        return ans;
    }
    public void backtracking(List<String> ans, StringBuilder sb, Integer n, Integer open, Integer close){
        if(sb.length() == 2*n){
            ans.add(sb.toString());
            return;
        }
        if(open>close){
            sb.append(")");
            backtracking(ans,sb,n,open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open<n){
            sb.append("(");
            backtracking(ans,sb,n,open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
