class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        int n = operations.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
           if(operations[i].equals("C"))
            {
                list.remove(list.get(list.size()-1));
            }
            else if(operations[i].equals("D"))
            {
                list.add(list.get(list.size()-1) * 2);
            }
            else if(operations[i].equals("+"))
            {
                list.add(list.get(list.size()-1) + list.get(list.size()-2));
            }else
            {
               list.add(Integer.parseInt(operations[i]));
            }
        }
        for(int a : list)
        {
            sum = sum + a;
        }
        return sum;
    }
}