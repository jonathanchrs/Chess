package chess_piece;

public class King extends Pieces {

	@Override
	public boolean validateMovement(int[][] gridsArray, int x1, int y1, int x2, int y2) {
		if(x2 < 0 || x2 > 7 || y2 < 0 || y2 > 7) {
			//System.out.println("msk");
			return false;
		}
		if((gridsArray[x1][y1] >= 7 && gridsArray[x1][y1] <= 12 && gridsArray[x2][y2] >= 7 && gridsArray[x2][y2] <= 12) ||
		   (gridsArray[x1][y1] < 7 && gridsArray[x1][y1] > 0 && gridsArray[x2][y2] < 7 && gridsArray[x2][y2] > 0)) {
			System.out.println("makan temenK");
			return false;
		}
		
		//buat atas
		if(x1 - x2 == 1  && y1 == y2) return true;
		//buat bawah
		else if(x1 - x2 == -1 && y1 == y2) return true;
		//buat kiri
		else if(y1 - y2 == 1 && x1 == x2) return true;
		//buat kanan
		else if(y1 - y2 == -1 && x1 == x2) return true;
		//buat kiri atas
		else if(x1 - x2 == 1 && y1 - y2 == 1) return true;
		//buat kanan atas
		else if(x1 - x2 == 1 && y1 - y2 == -1) return true;
		//buat kiri bawah
		else if(x1 - x2 == -1 && y1 - y2 == 1) return true;
		//buat kanan bawah
		else if(x1 - x2 == -1 && y1 - y2 == -1) return true;
		
		return false;
	}

}
