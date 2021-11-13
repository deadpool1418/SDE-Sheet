class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c = matrix[0].length;
        for(int[] row: matrix) {
            if(target >= row[0] && target <= row[c - 1])
                return search(row, target);
        }
        return false;
    }
    
    public boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        boolean isFound = false;
        while(low <= high) {
            mid = (low + high) / 2;
            if(arr[mid] == target) {
                isFound = true;
                break;
            }
            else if(arr[mid] <= target) low = mid + 1;
            else if(arr[mid] > target) high = mid - 1;
        }
        return isFound;
    }
