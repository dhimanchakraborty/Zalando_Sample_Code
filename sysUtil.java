/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 * @author Dhiman Chakraborty
 */
public class sysUtil 
{
    public void stringTokenize(String inputStr)
    {
        String regex = "\\/";
        String[] strData;
        sysProp logger = new sysProp();
        logger.getLog("Entered : " + logger.getFunctionName());
        logger.getLog("Input String : " + inputStr);
        try
        {
            Pattern ptrnPattern = Pattern.compile(regex);
            strData = ptrnPattern.split(inputStr);
            logger.getLog(Arrays.toString(strData));
        }
        catch(Exception _err)
        {
            logger.getLog("Error : " + _err.getMessage());
        }
    }
 
}
