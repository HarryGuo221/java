class fibo {
	public static void main(String args[])
	{
		// �t�B�{�i�b�`����(0�`10���܂ŎZ�o���ĕ\��)
		//// �z��̒�`
		int [] hai = new int[11];
		//// 0���ڂ̏�����
		hai[0] = 0;
		//// 1���ڂ̏�����
		hai[1] = 1;
		//// 2�`10���̌v�Z
		///// 2�`10�܂ł̃��[�v��for���ŏ���
		for (int i=2 ; i<=10 ; i++){
			hai[i] = hai[i-1] + hai[i-2];
		}
		//// 1�`10���܂ł�\��
		for (int i=1 ; i<=10 ; i++){
		     System.out.println(hai[i]);
		}
		/* 5�`8�܂ł̃��[�v
		for (int i=5 ; i<=8 ; i++) {
			System.out.println(i);
		}
		
		int [] hai = new int[10];
		hai[0] = 0;
		hai[1] = 10;
		hai[2] = 100;
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

