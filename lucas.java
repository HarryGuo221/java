import java.math.*;

// �������[�h�F
// �g���N���X�F

class lucas {
	public static void main(String args[])
	{
		// �����J����(1�`100���܂ŎZ�o���āA���v��\��)
		// ���v������ϐ����`���āA0�������Ă���
		// BigInteger�^��ryuka���`����0����
		BigInteger ryuka = new BigInteger("0");
		//// BigInteger�^�̔z��̒�`(100���܂�)
		BigInteger [] hai = new BigInteger[101];
		//// 0���ڂ̏�����
		hai[0] = new BigInteger("2");
		//// 1���ڂ̏�����
		hai[1] = new BigInteger("1");
		ryuka = ryuka.add(hai[1]);
		//// 2�`100���̌v�Z
		///// 2�`100�܂ł̃��[�v��for���ŏ���
		for (int i=2 ; i<=100 ; i++){
			// ��肽�����ƁFn = n + one;
			// BigInteger�ɏ����������
			//          n = n.add(one);
			hai[i] = hai[i-1].add(hai[i-2]);
			// �Z�o�����l�����v����ϐ��ɑ���
			ryuka = ryuka.add(hai[i]);
			// �������l��\��
			System.out.println(ryuka);
		}
	}
}

