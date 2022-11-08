//输入一行包含一个单词，单词只由小写英文字母组成。
//
//对于所有的评测用例，输入的单词长度不超过 1000。
//
//输出描述
//输出两行，第一行包含一个英文字母，表示单词中出现得最多的字母是哪 个。如果有多个字母出现的次数相等，输出字典序最小的那个。
//
//第二行包含一个整数，表示出现得最多的那个字母在单词中出现的次数。

#include<stdio.h>
#include<string.h>
int main()
{
	char letter[1010];
	scanf("%s",&letter);
	int length=strlen(letter);//长单词的长度 
	int word[30]={0};//26个英文字母分别统计次数
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
	printf("%c\n",(t+96));//字母的角标转化为字母 
	printf("%d",max);//最多字母出现次数 
}
