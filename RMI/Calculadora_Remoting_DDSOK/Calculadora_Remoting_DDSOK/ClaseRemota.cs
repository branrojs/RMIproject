using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculadora_Remoting_DDSOK
{
    public class ClaseRemota: MarshalByRefObject, RemoteInterface
    {
        
        public float suma(float a, float b)
        {
            float res = 0;
            res = a + b;
            return res;
        }
         

        public float resta(float a, float b)
        {   
            float res = 0;
            res = a - b;
            return res;
        }

        public float multiplicacion(float a, float b)
        {
            float res = 0;
            res = a * b;
            return res;
        }

        public float division(float a, float b)
        {
            float res = 0;
            res = a / b;
            return res;
        }

        public float porcentaje(float a, float b)
        {
            float res = 0;
            res = a * (b / 100);
            return res;
        }

      
    }
}
