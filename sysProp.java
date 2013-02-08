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
    /**
     * This function can be used for printing the log lines
     * @param logLine
     */
    public void getLog(String logLine)
    {
        System.out.println(logLine);
    }
     /**
     * This function can be used for printing the log lines if the input is File type
     * @param fileLog
     */
    public void getLog(File fileLog) 
    {
        System.out.println(fileLog);
    }
    /**
     * This function can be used to get the fuction_Name for correct type of logging
     * @return function_Name
     */
    public String getFunctionName()
    {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste[ste.length-2].getMethodName();
    }
}
