package Matrix;

public class Matrix {
	private int m, n;
	private double[][] data;

	public Matrix(int m, int n) {
		setM(m);
		setN(n);
		data = new double[m][n];
//		System.out.println("m = " + m + "," + "this.data.length = " + this.data.length);
		for (int i = 0; i < this.data.length; i++)
			for (int j = 0; j < this.data[i].length; j++)
				setElement(i, j, 3 * Math.random()+1);
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double[][] getData() {
		return data;
	}

	public void setData(double[][] data) {
		this.data = data;
	}

	// 设置第row行，第col列元素的值
	public void setElement(int m, int n, double value) {
		this.data[m][n] = value;
//		System.out.println(this.data[m][n]);
	}

	// 实现当前矩阵与m矩阵相加，并返回新的矩阵；若无法相加，则返回null
	public Matrix add(Matrix m) {
		int row = this.data.length, col = this.data[0].length;
		Matrix res = new Matrix(row, col);
		if(row != m.getM() || col != m.getN()) {
			System.out.println("ADD ERROR!");
			res = null;
		}else {
			for(int i = 0; i < row; i++)
				for(int j = 0; j < col; j++)
					res.data[i][j] = m.data[j][i] + this.data[i][j];
		}
		return res;
	}

	// 实现当前矩阵减去m矩阵，并返回新的矩阵；若无法相减，则返回null
	public Matrix minus(Matrix m) {
		int row = this.data.length, col = this.data[0].length;
		Matrix res = new Matrix(row, col);
		if(row != m.getM() || col != m.getN()) {
			System.out.println("MINUS ERROR!");
			res = null;
		}else {
			for(int i = 0; i < row; i++)
				for(int j = 0; j < col; j++)
					res.data[i][j] = this.data[i][j] - m.data[i][j];
		}
		return res;
	}

	// 实现当前矩阵乘以m矩阵，并返回新的矩阵；若无法相乘，则返回null
	public Matrix multiple(Matrix m) {
		int row = this.data.length, col = m.data[0].length;
		Matrix res = new Matrix(row, col);
		if(this.data[0].length != m.data.length) {
			System.out.println("MULTIPLE ERROR!");
			res = null;
		}else {
			for(int i = 0; i < row; i++)
				for(int j = 0; j < col; j++)
					for(int k = 0; k < m.data.length; k++)
						res.data[i][j] += this.data[i][k] + m.data[k][j]; 
		}
		return res;
	}

	// 实现矩阵转置，并返回新的矩阵
	public Matrix transposition() {
		int row = this.data.length, col = this.data[0].length;
		Matrix res = new Matrix(row, col);
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
				res.data[i][j] = this.data[j][i];
		return res;
	}

	// 打印当前矩阵
	public void display() {
		for (int i = 0; i < this.data.length; i++) {
			for (int j = 0; j < this.data[i].length; j++)
				System.out.print((int)this.data[i][j] + " ");
			System.out.println();
		}
	}

}
