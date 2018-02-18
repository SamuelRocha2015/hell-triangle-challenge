public class HellsTriangle {

    public static void main(String[] args) {
        int[][] triangle = {{6}, {3,5}, {9, 7, 1}, {4, 6, 8, 4}};
        maximumTotal(triangle);
    }

    public static int maximumTotal( int[][] triangle ){
        int[] resultArray = new int[triangle.length];
        resultArray[0] = triangle[0][0];
        int maximumTotal = triangle[0][0];
        int a = 0;
        int b = a + 1;
        StringBuffer str = new StringBuffer().append(resultArray[0]);

        for (int i = 0; i < triangle.length; i++) {
            if(i>0){
                for (int j = 0; j < triangle[i].length; j++) {
                    if(i>0 && j==a){
                        if(triangle[i][a] >= triangle[i][b]){
                            resultArray[i] = triangle[i][a];
                        }else{
                            resultArray[i] = triangle[i][b];
                            a = b;
                            b = a+1;
                        }
                        str.append(" + " + resultArray[i]);
                        maximumTotal += resultArray[i];
                        break;
                    }
                }
            }
        }
        System.out.println( str.toString() + " = " + maximumTotal);
        return maximumTotal;
    }
}
