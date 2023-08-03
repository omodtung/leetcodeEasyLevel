
import java.util.List;
import java.util.ArrayList;

public  class pascalTriagle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i =0 ; i< numRows ;i++) {
        List<Integer> list = new ArrayList<> ();
        for( int j= 0;j<=i;j++)
        {
            if(j>0 && i>0 && res.get(i-1).size()-1>=j )
            {
                list.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));


            }
            else{
                list.add(1);
            }
            res.add(list);
        }
      //  return res;
        }
        return res;
    }


    
        public static void main(String[] args) {
            // Generate a Pascal's triangle with 5 rows
            List<List<Integer>> triangle = generate(5);
            // Print the triangle
            
            for (List<Integer> row : triangle) {
              System.out.println(row);
            }
          }
          
    
}
