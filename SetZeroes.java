class SetZeroes {
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i<row.size();i++){
            Arrays.fill(matrix[row.get(i)],0);
        }
        for(int j:col){
            for(int i=0;i<matrix.length;i++){
                matrix[i][j]=0;
            }
        }
    }
}
