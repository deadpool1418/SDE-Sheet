class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=i; j<matrix[0].length; j++) {
                swap(matrix, i, j);
            }
        }
        for(int i=0; i<matrix.length; i++) 
            reverse(matrix[i]);
    }
    
    public void swap(int[][] a, int i, int j) {
        int temp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = temp;
    }
    
    public void reverse(int[] a) {
        int i = 0, j = a.length - 1;
        while(i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }
    }
}
