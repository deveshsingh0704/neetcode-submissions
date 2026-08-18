class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(Character ch:s.toCharArray()){
            char c=ch;
            if(c=='(' ||c=='['||c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.peek();
                if((top=='(' && c==')')||(top=='['&&c==']')||(c=='}' && top=='{')){
                    st.pop();
                }
                    else{
                        return false;
                    }
            }
        }
        return st.size()==0;
    }
}
