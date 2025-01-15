package lecture_1_OOPS.Assignment;

public class ComplexNumbers {
	
	// Complete this class
		private int real;
		private int imaginary;

		public ComplexNumbers(int real, int imaginary){
			this.real = real;
			this.imaginary = imaginary;
		}

		public void plus(ComplexNumbers c1) {
			int temp_real = this.real + c1.real;
			int temp_img = this.imaginary + c1.imaginary;
			this.real = temp_real;
			this.imaginary = temp_img;
		}

		public void multiply(ComplexNumbers c1) {
			int temp_real = this.real * c1.real - this.imaginary * c1.imaginary;
			int temp_img = this.imaginary = this.real * c1.imaginary + this.imaginary * c1.real;
			this.real = temp_real;
			this.imaginary = temp_img;
		}

		public void print(){
			if(this.imaginary >=0){
				System.out.println(this.real+" + "+"i"+this.imaginary);
			}else{
				System.out.println(this.real+" - "+"i"+Math.abs(this.imaginary));
			}
		}

		public void setReal(int real){
			this.real = real;
		}

		public void setImaginary(int imaginary){
			this.imaginary = imaginary;
		}

		public int getReal(){
			return this.real;
		}

		public int getImaginary(){
			return this.imaginary;
		}

}
