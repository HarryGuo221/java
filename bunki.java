class bunki {
	public static void main(String args[])
	{
		// �����̒l
		int kotae=0;
    	// ���́F���l1�A�L���A���l�Q�̏��Ԃɓ���
    	System.out.print("���l1=");
    	int in0 = new java.util.Scanner(System.in).nextInt();
    	System.out.print(
    		"�����Z(+)�A�����Z(-)�A�|���Z(*)�A����Z(/)�A�]��(%)�̂ǂꂩ=");
		// String�^�̕ϐ�kigou�ɁA��L�̋L�������
		String kigou = new java.util.Scanner(System.in).nextLine();
    	System.out.print("���l2=");
    	int in1 = new java.util.Scanner(System.in).nextInt();

		// �����F�L���ɉ����Čv�Z
		// �q���g�Fkigou��+���ǂ�����if���͈ȉ��̂Ƃ���
		//   if (kigou.equals("+"))
		if (kigou.equals("+"))
			kotae = in0 + in1;
		if (kigou.equals("-"))    
		    kotae = in0 - in1;
		// �o�́F�v�Z���ʂ��o��
		// �u���l1 �v�Z�L�� ���l2 = �����v
		System.out.println("" + in0 + kigou + in1 + "=" + kotae);
	}
}

