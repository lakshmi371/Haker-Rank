package com.ibs.training.interfacee;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisor_sum1(int n);


public default int divisor_sum(int n)
{
    int sum=0;
    for(int i=1;i<=n/2;i++)
    {
        if(n%i==0)
        {
        sum=sum+i;
    }
}

sum=sum+n;
return sum;
}
}
