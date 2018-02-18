public class HellsTriangle {

    public static void main(String[] args) {
        int[][] triangle = {{6}, {3,5}, {9, 7, 1}, {4, 6, 8, 4}};
        maximumTotal(triangle);
    }

    public static int maximumTotal( int[][] triangle ){
        int maximumTotal = 0;
        if(triangle!=null){
            int[] resultArray = new int[triangle.length];
            resultArray[0] = triangle[0][0];
            maximumTotal = triangle[0][0];
            int firstIndexNextLine = 0;
            int secondIndexNextLine = firstIndexNextLine + 1;
            StringBuffer str = new StringBuffer().append(resultArray[0]);

            if(triangle.length>1){
                for (int i = 0; i < triangle.length; i++) {
                    if(i>0){
                        for (int j = 0; j < triangle[i].length; j++) {
                            if(i>0 && j==firstIndexNextLine){
                                if(triangle[i][firstIndexNextLine] >= triangle[i][secondIndexNextLine]){
                                    resultArray[i] = triangle[i][firstIndexNextLine];
                                }else{
                                    resultArray[i] = triangle[i][secondIndexNextLine];
                                    firstIndexNextLine = secondIndexNextLine;
                                    secondIndexNextLine = firstIndexNextLine+1;
                                }
                                str.append(" + " + resultArray[i]);
                                maximumTotal += resultArray[i];
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println( str.toString() + " = " + maximumTotal);
            return maximumTotal;
        }
        System.err.println("Could not perform operation: Triangle is invalid or null.");
        return maximumTotal;
    }
}
