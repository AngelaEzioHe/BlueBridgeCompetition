//����һ�а���һ�����ʣ�����ֻ��СдӢ����ĸ��ɡ�
//
//�������е���������������ĵ��ʳ��Ȳ����� 1000��
//
//�������
//������У���һ�а���һ��Ӣ����ĸ����ʾ�����г��ֵ�������ĸ���� ��������ж����ĸ���ֵĴ�����ȣ�����ֵ�����С���Ǹ���
//
//�ڶ��а���һ����������ʾ���ֵ������Ǹ���ĸ�ڵ����г��ֵĴ�����

#include<stdio.h>
#include<string.h>
int main()
{
	char letter[1010];
	scanf("%s",&letter);
	int length=strlen(letter);//�����ʵĳ��� 
	int word[30]={0};//26��Ӣ����ĸ�ֱ�ͳ�ƴ���
	for(int i=0;i<length;i++)
	{
		
		switch(letter[i])
		{
			case 'a':word[1]++; break;
			case 'b':word[2]++; break;
			case 'c':word[3]++; break;
			case 'd':word[4]++; break;
			case 'e':word[5]++; break;
			case 'f':word[6]++; break;
			case 'g':word[7]++; break;
			case 'h':word[8]++; break;
			case 'i':word[9]++; break;
			case 'j':word[10]++; break;
			case 'k':word[11]++; break;
			case 'l':word[12]++; break;
			case 'm':word[13]++; break;
			case 'n':word[14]++; break;
			case 'o':word[15]++; break;
			case 'p':word[16]++; break;
			case 'q':word[17]++; break;
			case 'r':word[18]++; break;
			case 's':word[19]++; break;
			case 't':word[20]++; break;
			case 'u':word[21]++; break;
			case 'v':word[22]++; break;
			case 'w':word[23]++; break;
			case 'x':word[24]++; break;
			case 'y':word[25]++; break;
			case 'z':word[26]++; break;
		}
	}
	int max=0;
	int t;
	for(int i=1;i<=26;i++)
	{
		if(word[i]>max)
		{
			max = word[i];
			t=i;
		}
	} 
	printf("%c\n",(t+96));//��ĸ�ĽǱ�ת��Ϊ��ĸ 
	printf("%d",max);//�����ĸ���ִ��� 
}
