class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int totalSal = 0;
        for(int sal : salary){
            totalSal += sal;
        }
        return (double)(totalSal - (salary[0] + salary[salary.length - 1])) / (salary.length - 2);
    }
}