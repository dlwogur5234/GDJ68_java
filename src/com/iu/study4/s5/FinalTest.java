package com.iu.study4.s5;

public final class FinalTest { //��ӺҰ�
	
	public static final int SIZE=50;
	
	public final int MAX_NUM; //���-�ѹ� �Է��� ���� ������ �Ұ�
	
//	{
//		this.num=20;
//	}

	public FinalTest() {
		this.MAX_NUM=20;
	}
	
	public final void finalMethod() { //�������̵� �Ұ�
		final int a = 10; //���-�ѹ� �Է��� ���� ������ �Ұ�
	}
}
