package kr.or.ddit.homework.home10;

public class Grade {
	int kor;
	int eng;
	int met;
	int sum;
	double avg;
	
	public Grade(int kor, int eng, int met) {
		this.kor = kor;
		this.eng = eng;
		this.met = met;
		this.sum = kor + eng + met;
		this.avg = (int)(((double)(kor + eng + met) / 3)*10+0.5)/10.0;
	}

	@Override
	public String toString() {
		return "Grade [kor=" + kor + ", eng=" + eng + ", met=" + met + ", sum=" + sum + ", avg=" + avg + "]";
	}
}
