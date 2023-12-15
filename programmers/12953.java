class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        for(int i=0;i<arr.length;i++){
            int g = gcd(answer, arr[i]);
            answer = g * (answer / g) * (arr[i] / g);
        }
        
        return answer;
    }
    
    public int gcd(int a, int b){
        if(a < b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
