import java.util.Random;
import java.io.*;

class sum {
	public static void main(String args[])
	{
		// �ϐ�a��tensu.txt�Ƀt�@�C���o�͂���
		try{
			// tensu.txt�ɏ������ޏ���
			File file = new File("tensu.csv");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			// �ǂݍ��񂾃f�[�^���R���}�ŕ�������
			String datas = br.readLine();
			String[] str1Ary = datas.split(",");
			int [] idatas=new int[str1Ary.length];
			// �������ꂽ������̕\��
            for (int i=0; i<str1Ary.length; i++) {
            	// idatas[i]�ɁAstr1Ary[i]��int�^�ɃL���X�g���đ��
            	idatas[i]=Integer.valueOf(str1Ary[i]).intValue();
            	
            	System.out.println(str1Ary[i]);
            }
            
            
            
			// �t�@�C�������
			br.close();
		} catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
