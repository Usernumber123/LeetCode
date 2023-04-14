package com.company;

// time complexity O(n), где n= s.length()
// space complexity O(n), где n~= s.length() (StringBuilder)
public class RemovingStarsFromAString {

    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                str.deleteCharAt(str.length() - 1);
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    /* //неудачное решение, не укладывается во время:
    public String removeStars(String s) {
        String r="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                r+=s.charAt(i);
            }
            else{
                r=r.substring(0,r.length()-1);
            }
        }
        return r;
    }
    */
}
