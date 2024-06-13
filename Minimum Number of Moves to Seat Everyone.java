class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {       
       int[] seatsa=new int[101];
       int[] studentsa=new int[101];
       for(int i=0;i<seats.length;i++){
        seatsa[seats[i]]++;
        studentsa[students[i]]++;
       }
       int j=0;
       int sum=0;
       for(int i=0;i<seatsa.length;i++){
        if(seatsa[i]==0) continue;
        while(studentsa[j]==0) {j++;}
        sum+=Math.abs(i-j);
        seatsa[i]--;
        studentsa[j]--;
        if(seatsa[i]!=0) i--;
       }
       return sum;
    }
}
