class StrStr {
    public int strStr(String haystack, String needle) {
        char h[] = haystack.toCharArray();
        char n[] = needle.toCharArray();
        if(h.length<n.length){
            return -1;
        }
        for(int i=0;i<h.length;i++){
            if(h[i]==n[0]){
                boolean f = true;
                int temp = i;
                for(int j=0;j<n.length;j++){
                    if(h[temp]==n[j]){
                        if(temp!=h.length-1){
                            temp++;
                        }
                        // temp++;
                    }
                    else{
                        f = false;
                        break;
                    }
                }
                if(f){
                    return i;
                }
            }
        }
        return -1;
    }
}
