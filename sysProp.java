/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author Dhiman Chakraborty
 */
public class sysProp 
{
    //This function can be used for printing the log lines
    /**
     *
     * @param logLine
     */
    public void getLog(String logLine)
    {
        System.out.println(logLine);
    }
    /**
     *
     * @return
     */
    public String getFunctionName()
    {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste[ste.length-2].getMethodName();
    }
}
