// package lab15.sict.must.edu.mn;

// public class Multiplication {
//     public double multiply(double a, double b) {
//         return a * b;
//     }
// }
package lab15.sict.must.edu.mn;

public class Multiplication {
    public double multiply(double a, double b) {
        if (a == 0 || b == 0) {
            return 0.0; // Илүү тодорхой болгох зорилготой өөрчлөлт
        }
        return a * b;
    }
}
