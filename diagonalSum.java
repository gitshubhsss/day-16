public class diagonalSum{
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};

        int total_number_of_rows=matrix.length;
        int total_number_of_cols=matrix[0].length;

        int diaSum=0;

        //finding the primary  diagonal sum

        for(int row=0;row<total_number_of_rows;row++){
            for(int col=0;col<total_number_of_cols;col++){
                if(row==col){
                    diaSum=diaSum+matrix[row][col];
                }
            }
        }
        //now will calculate the secondary diagonal sum

        int startCol=total_number_of_cols-1;

        for(int row=0;row<total_number_of_rows;row++){
            if(row!=startCol){
                diaSum=diaSum+matrix[row][startCol];
            }
            startCol--;
        }

        System.out.println("diagonal sum : "+diaSum);
    }
}