import java.util.Random;
import java.io.*;

class file {
	public static void main(String args[])
	{
		// 0�`100�܂ł̗�����100�R���}��؂��
		// �t�@�C���o�͂���
		
		// 0�`100�܂ł̗�����int�^�̕ϐ�a�ɋ��߂�
		// �o��
		Random b = new Random();
		int a =b.nextInt(101);
		System.out.print(a);
		// �ϐ�a��tensu.txt�Ƀt�@�C���o�͂���
		try{
			File file = new File("tensu.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(a);
			pw.close();
		} catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
