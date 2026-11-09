class Solution {
    public int[] evenOddBit(int n) {
     int even=0;
     int odd=0;
     String binary=Integer.toBinaryString(n) ;
     for(int i=0;i<binary.length();i++){
        char bit=binary.charAt(binary.length()-1-i);
        if(bit=='1'){
            if(i%2==0){
            even++;
        }else{
            odd++;
        }
    } 
    }
    return new int[]{even,odd};
}
}