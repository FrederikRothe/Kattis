using System;
using System.Collections.Generic;

namespace ICPCAwards
{
    class Program
    {
        static void Main(string[] args)
        {
            var n = Console.ReadLine();

            var unis = Int32.Parse(n);

            var uniqueUnis = new List<string>();
            var winners = new List<string>();

            for (int i = 0; i < unis; i++)
            {
                var input = Console.ReadLine();

                var uniName = input.Split(" ");

                if(!uniqueUnis.Contains(uniName[0]))
                {
                    uniqueUnis.Add(uniName[0]);
                    winners.Add(input);
                }
            }
            for (int i = 0; i < 12; i++)
            {
                Console.WriteLine(winners[i]);
            }
        }
    }
}
