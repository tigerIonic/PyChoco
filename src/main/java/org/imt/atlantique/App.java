package org.imt.atlantique;

import org.chocosolver.solver.Model;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Model model = new Model("A first model");
        System.out.println(model.getName());
    }
}
