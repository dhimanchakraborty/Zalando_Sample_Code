/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Dhiman Chakraborty
 */
public class FileIO 
{ 
     /*
     * This function can be used to read a file line by line
     * @Param filename(String)
     * @return void
     */
     static void fileReaderLineByLine(String fileName)
     {
         sysProp logger = new sysProp();
         logger.getLog("Entered fileReaderLineByLine with input file name : " + fileName);
         try (BufferedReader pt_F2 = new BufferedReader(new FileReader(fileName))) 
         {
            while (pt_F2.ready())
            {
                 String fileLine = pt_F2.readLine();
            }
         }
         catch(Exception _err)
         {
             logger.getLog("Error: " + _err.getMessage());
         }
         logger.getLog("Exiting fileReaderLineByLines");
      }
    
    
    /*
     * This function can be used to append to a .txt file line by line
     * @Param writeLine(String) processName(String)
     * @return void
     */
    public void fileAppend(String writeLine,String processName)
     {
         sysProp logger = new sysProp();
         logger.getLog("Entered : " + logger.getFunctionName());
         try
         {
                File file = new File(processName + "_log." + "txt");
                if(!file.exists())
                {
                    file.createNewFile();
                    logger.getLog("Absolute file Path : " + file.getAbsolutePath());
                }
                FileWriter fileWrtr = new FileWriter(file.getName(),true);
             try (BufferedWriter bufferWriter = new BufferedWriter(fileWrtr)) {
                 bufferWriter.write(writeLine);
                 bufferWriter.newLine();
                 bufferWriter.close();            
             }
         }
         catch(Exception err)
         {
             logger.getLog("Error : " + err.getMessage());
         }
     }
     
     /*
     * This function can be used to read all files name from a given directory absolute path
     * @Param dirAbsPath(String)
     * @return void
     */
     public void getAllFileNamefromDir(String dirAbsPath)
     {
         sysProp logger = new sysProp();
         logger.getLog("Entered : " + logger.getFunctionName());
         logger.getLog("Going to get all the folder naem from a directory");
         File[] listOfFiles = null;
         
         try
         {
                File folder = new File(dirAbsPath);
                listOfFiles = folder.listFiles();
         }
         catch(Exception err)
         {
             logger.getLog("Error : " + err.getMessage());
         }
         logger.getLog(Arrays.toString(listOfFiles));
         int itr = 0;
         for(; itr < listOfFiles.length; itr++)
         {
             logger.getLog(listOfFiles[itr]);
         }
     }
}
