import java.util.Random;
import java.io.*;

class sort {
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
			int sum=0;
			// �������ꂽ������̕\��
            for (int i=0; i<str1Ary.length; i++) {
            	// idatas[i]�ɁAstr1Ary[i]��int�^�ɃL���X�g���đ��
            	idatas[i]=Integer.valueOf(str1Ary[i]).intValue();
            	sum=sum+idatas[i];
            	System.out.println(str1Ary[i]);
            }
            System.out.println("���v��"+sum);
            
            
			// �t�@�C�������
			br.close();
			
			// ���ёւ�
			// 0 1 2 3�Ԗ�
			// 5 2 3 1
			// >0,1=���ёւ�
			// 2 5 3 1
			// >1,2=���ёւ�
			// 2 3 5 1
			// >2,3=���ёւ�
			// 2 3 1 5
			// -----------
			// >0,1=���̂܂�
			// >1,2=���т���
			// 2 1 3 5
			// -----------
			// >0,1=���ёւ�
			// 1 2 3 5
			// ------------
			// �f�[�^����4
			// i:j
			// 0:0�`2=4-2-0=4-2-i
			// 1:0�`1=4-2-1=4-2-i
			// 2:0   =4-2-2=4-2-i
			// �ȏォ��Ai��0�`�f�[�^��-2
			// j�́A0�`�f�[�^��-2-i
			for(int i=0;i<idatas.length-1;i++)
			{
				for(int j=0;j<idatas.length-1-i;j++)
				{
					if (idatas[j]>idatas[j+1])
					{
						int w = idatas[j];
						idatas[j]=idatas[j+1];
						idatas[j+1]=w;
					}
				}
			}
			for(int i=0 ; i<idatas.length;i++) {
				System.out.print(idatas[i]+",");
			}
			
		} catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
