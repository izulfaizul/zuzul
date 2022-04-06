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
public class web implements nilai{
    double d,e,f;
    public web(double d, double e, double f)
            {
                this.d = d;
                this.e = e;
                this.f = f;
                
            }

    @Override
    public double tulis() {
        return (double)(d*0.4);  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double koding() {
        return (double)(e*0.35);  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double wawancara() {
        return (double)(f*0.25);  //To change body of generated methods, choose Tools | Templates.
    }

   
    public double hasil(double d, double e, double f) {
        return (double)(((d*0.4)+(e*0.35)+(f*0.25))); //To change body of generated methods, choose Tools | Templates.
    }
}
