package com.iu.study4.s2;
public class Student {
	private String name; 	// �̸�
	private int num; 		// ��ȣ
	private int korean;		// ����
	private int english;	// ����
	private int math;		// ����
	private int total;		//����
	private double avg;		//���
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getNum() {
		return num;
	}




	public void setNum(int num) {
		this.num = num;
	}




	public int getKorean() {
		return korean;
	}




	public void setKorean(int korean) {
		this.korean = korean;
	}




	public int getEnglish() {
		return english;
	}




	public void setEnglish(int english) {
		this.english = english;
	}




	public int getMath() {
		return math;
	}




	public void setMath(int math) {
		this.math = math;
	}




	public int getTotal() {
		return total;
	}




	public void setTotal(int total) {
		this.total = total;
	}




	public double getAvg() {
		return avg;
	}




	public void setAvg(double avg) {
		this.avg = avg;
	}




	//�޼���� calc
	//�ش� �ν��Ͻ��� total, avg �� ����ؼ� ����
	public void calc() {
		total=korean+english+math;
		avg=total/3;
		
	}
	
}
