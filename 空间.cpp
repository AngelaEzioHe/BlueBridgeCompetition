//小蓝准备用 256MB256MB 的内存空间开一个数组，
//数组的每个元素都是 3232 位 二进制整数，
//如果不考虑程序占用的空间和维护内存需要的辅助空间，
//请问 256MB256MB 的空间可以存储多少个 3232 位二进制整数？

#include<stdio.h>
int main()
{
	int a;
	int length=sizeof(a);
	printf("%d",((256*1024*1024)/length));
	return 0;
}
