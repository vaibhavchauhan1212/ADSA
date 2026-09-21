class Solution {
    public long minimumTime(int[] d, int[] r) {
        long[] rr = new long[2];
        long[] dd = new long[2];
        dd[0] = (long)d[0];
        dd[1] = (long)d[1];
        rr[0] = (long)r[0];
        rr[1] = (long)r[1];
        
        long s = 0;
        long e = Long.MAX_VALUE;

        while(s <= e){
            long m = s + (e - s)/2;
            if(good(m,dd[0],dd[1],rr[0],rr[1])){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return s;
    }
    long gcd(long a , long b){
        if(b == 0) return a;
        return gcd(b , a%b);
    }

    boolean good(long m , long d1,long d2, long r1, long r2){
        long gcd = gcd(r1,r2);
        long lcm = (r1/gcd)*r2;
        // a -> all positions where i can put d1 without any thought.
        // b -> all positions where i can put d2 without any thought.
        long a = m/r2 - m/lcm;
        long b = m/r1 - m/lcm;

        long conflict = m - m/r1 - m/r2 + m/lcm;

        long remA = Math.max(0 , d1 - a);
        long remB = Math.max(0 , d2 - b);

        return conflict >= remA + remB;
    }
}