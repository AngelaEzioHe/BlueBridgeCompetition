#include<stdio.h>
int main()
{
	float sum;
	int a;
	sum=180.9*0.88+10.25*0.65+56.14*0.9
	+104.65*0.9+100.3*0.88+297.15*0.5+26.75*0.65
	+130.62*0.5+240.28*0.58+270.62*0.8+115.87*0.88
	+247.34*0.95+73.21*0.9+101*0.5+79.54*0.5
	+278.44*0.7+199.26*0.5+12.97*0.9+166.3*0.78
	+125.5*0.58+84.98*0.9+113.35*0.68+166.57*0.5
	+42.56*0.9+81.9*0.95+131.78*0.8+255.89*0.78
	+109.17*0.9+146.69*0.68+139.33*0.65+141.16*0.78
	+154.74*0.8+59.42*0.8+85.44*0.68+293.7*0.88
	+261.79*0.65+11.3*0.88+268.27*0.58+128.29*0.88
	+251.03*0.8+208.39*0.75+128.88*0.75+62.06*0.9
	+225.87*0.75+12.89*0.75+34.28*0.75+62.16*0.58
	+129.12*0.5+218.37*0.5+289.69*0.8;
//	printf("%f\n",sum);        //5136.859375
	a=(int)sum;	
//	printf("%d\n",a);
	printf("%d",(a/100+1)*100);	
	return 0;
}
