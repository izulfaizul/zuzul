/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleksi;

/**
 *
 * @author Hewlett-Packard
 */
public class hasilandroid implements nilai {
    double a,b,c,d;

    public hasilandroid(double a, double b, double c)
            {
                this.a = a;
                this.b = b;
                this.c = c;
              
            }

    @Override
    public double tulis() {
        return (double)(a*0.2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double koding() {
        return (double)(b*0.5); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double wawancara() {
        return (double)(a*0.3);//To change body of generated methods, choose Tools | Templates.
    }


    public double hasil(double a, double b, double c) {
         return (double)(((a*0.2)+(b*0.5)+(c*0.3))); //To change body of generated methods, choose Tools | Templates.
    }
}
