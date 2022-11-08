//题目描述
//小蓝给学生们组织了一场考试，卷面总分为 100 分，每个学生的得分都是一个 0 到 100 的整数。
//
//请计算这次考试的最高分、最低分和平均分。
//
//输入描述
//输入的第一行包含一个整数 n\ (1 ≤ n ≤ 10^4)n (1≤n≤10 
//4
// )，表示考试人数。
//
//接下来 nn 行，每行包含一个 0 至 100 的整数，表示一个学生的得分。
//
//输出描述
//输出三行。
//
//第一行包含一个整数，表示最高分。
//
//第二行包含一个整数，表示最低分。
//
//第三行包含一个实数，四舍五入保留正好两位小数，表示平均分。

#include <stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n+10];
  for(int i=1;i<=n;i++)
  {
    scanf("%d",&a[i]);
  }
  int max=a[1];
  int min=a[1];
  float average;
  for(int i=1;i<=n;i++)
  {
    if(a[i]>max)
    {
      max=a[i];
    }
  }
  for(int i=1;i<=n;i++)
  {
    if(a[i]<min)
    {
      min=a[i];
    }
  }
  float sum=0;
  for(int i=1;i<=n;i++)
  {
    sum+=a[i];
  }
  average=sum/n;
  printf("%d\n",max);
  printf("%d\n",min);
  printf("%.2f\n",average);
  return 0;
}
