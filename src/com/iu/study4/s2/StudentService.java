package com.iu.study4.s2;
import java.util.Scanner;
public class StudentService {	
	
	public Student findByNum(Student [] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ã������ �ϴ� �л��� ��ȣ�� �Է��ϼ���");
		int num = sc.nextInt();
		
		Student student = null;
		
		for(int i=0; i<students.length; i++) {
			if(num==students[i].getNum()) {
				student = students[i];
				break;
			}
		}
		return student;
		
	}
	
	public Student[] makeStudents() {
		// �л��� �Է�
		// �л��� ��ŭ �л����� �������
		//�̸�, ��ȣ, ����, ����, ���� ���� �Է�
		//����, ��� ���
		//�л����� ���� ����
		//1. �л� �迭�� ����
		//2. �л��� ��ŭ �ݺ��� ����
		//3. �ݺ��� ������ �̸�, ��ȣ, ����, ����, ���� �Է� ���� ���
		//4. �ش� �л��� �迭�� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �л� �� �Է�");
	
		int numberOfStudent= sc.nextInt();
		Student[] students = new Student[numberOfStudent];
		
		for(int i=0; i<students.length; i++) {
			Student s1 = new Student();
			students[i]=s1;
			System.out.println("�̸��� �Է��ϼ���");
			students[i].setName(sc.next()); 
			System.out.println("��ȣ�� �Է��ϼ���");
			students[i].setNum(sc.nextInt());  
			System.out.println("���� ���� �Է�");
			students[i].setKorean(sc.nextInt());
			System.out.println("���� ���� �Է�");
			students[i].setEnglish(sc.nextInt());
			System.out.println("���� ���� �Է�");
			students[i].setMath(sc.nextInt());
//			students[i].total = students[i].korean + students[i].english +students[i].math;
//			students[i].avg = students[i].total/3;
			s1.calc();
		}		
		
		return students;
		
		
			
					
		
			
	}
}