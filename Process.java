/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app1; 
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dhiman Chakraborty
 */
public class Process {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        //Class Definition
        sysProp logger = new sysProp();
        sysUtil util = new sysUtil();
        FileIO f_Io = new FileIO();
        logger.getLog("Entered : main()");
        List<String> a_list = new ArrayList<>();
        a_list.add("1");a_list.add("3");a_list.add("5");
        
        //------------------------
        //Variable Definition
        String inputStr = "Dhiman  /Chakraborty     /Verizon/   Bullshit";
        String processName = "Main";
        String dirAbsPath = "C:/Users/Pirate/Documents/NetBeansProjects/App1";
        //------------------------
        util.stringTokenize(inputStr);
        String functionName = logger.getFunctionName();
        fIo.fileAppend("Hello Wrold from file",processName);
        fIo.getAllFileNamefromDir(dirAbsPath);
        logger.getLog("Got the function name : " + functionName);
        logger.getLog("Exiting Main function");
    }
}
