package tool;

import java.util.ArrayList;
import java.util.List;

/*
 * This class compute the way to conquer cells at horizontal way and vertical way
 */
public class ZeroConquer {

	//	public static void main(String args[]) {
//		int[][] input = {
//					{1, 2, 3, 4, 5, 6, 7, 8},
//					{1, 2, 3, 4, 0, 6, 7, 8},
//					{1, 2, 0, 4, 5, 6, 7, 8},
//					{1, 2, 3, 4, 5, 6, 0, 8},
//					{1, 2, 3, 4, 5, 6, 7, 8}
//					};
//		ZeroConquer zc = new ZeroConquer();
//		zc.zeroConquer(input);
//		for (int i=0; i<input.length; i++) {
//			System.out.println(Arrays.toString(input[i]));
//		}
//	}
	
	/*
	 * if the given array of 2 dimensions have zero, then write "0" on the way of horizontal line and vertical line
	 * @param int[][] board
	 * @return  
	 */
	public void zeroConquer(int[][] board) {
		List list = new ArrayList<int[]>();
		int[] lctn = new int[2];
		int row = board.length;
		int col = board[0].length;

		// memorize the locations of appearance of "0"s
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				if (board[i][j] == 0) {
					lctn[0] = i;
					lctn[1] = j;
					list.add(lctn.clone());
				}
			}
		}
		
		// write "0"s on the way of horizontal way and vertical way 
		for (int m=0; m<list.size(); m++) {
			lctn = (int[])list.get(m);
			for (int n=0; n<row; n++) {
				board[n][lctn[1]] = 0;
			}
			for (int n=0; n<col; n++) {
				board[lctn[0]][n] = 0;						
			}
		}
		
	}
	
}
