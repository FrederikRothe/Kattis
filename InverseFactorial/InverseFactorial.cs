using System;

    class InverseFactorial
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine();
            var digits = input.Length;
                    
            if(digits < 4)
            {
                int number = int.Parse(input);
                Console.WriteLine(pre_definedFactorial(number));
            }
            else
            {
                int currentCount = 6;
                double logSum = 4 * Math.Log10(2) + 2 * Math.Log10(3) + Math.Log10(5);
                while(true)
                {
                    logSum += Math.Log10(++currentCount);
                    if(logSum > digits)
                    {
                        Console.WriteLine(currentCount - 1);
                        break;
                    }    
                }
            }
        }
        static int pre_definedFactorial(int n)
            {
                return n == 1 ? 1 : n == 2 ? 2 : n == 6 ? 3 : n == 24 ? 4 : n == 120 ? 5 : 6;
            }
    }