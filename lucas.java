// �������[�h�F
// �g���N���X�F

class lucas {
	public static void main(String args[])
	{
		// �����J����(1�`100���܂ŎZ�o���āA���v��\��)
		// ���v������ϐ����`���āA0�������Ă���
		double ryuka = 0;
		//// �z��̒�`(100���܂�)
		double [] hai = new double[101];
		//// 0���ڂ̏�����
		hai[0] = 2;
		//// 1���ڂ̏�����
		hai[1] = 1;
		//// 2�`100���̌v�Z
		///// 2�`100�܂ł̃��[�v��for���ŏ���
		for (int i=2 ; i<=100 ; i++){
			hai[i] = hai[i-1] + hai[i-2];
			// �Z�o�����l�����v����ϐ��ɑ���
			ryuka = ryuka + hai[i];
			// �������l��\��
			System.out.println(ryuka);
		}

		/* 5�`8�܂ł̃��[�v
		for (int i=5 ; i<=8 ; i++) {
			System.out.println(i);
		}
		
		int [] hai = new int[10];
		hai[0] = 0;
		hai[1] = 10;
		hai[2] = 100
		System.out.println(hai[0]+","+hai[1]+","+hai[2]);
		
		for (int i=0 ; i<=9 ; i++) {
			hai[i] = i*2;
		}
		for (int i=0 ; i<=9 ; i++) {
			System.out.println(hai[i]);
		}
		*/
	}
}

