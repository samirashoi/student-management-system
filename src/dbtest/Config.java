/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

/**
 *
 * @author Issam
 */

import java.util.*;
import java.util.Properties;
 
public class Config
{
   Properties configFile;
   public Config()
   {
    configFile = new java.util.Properties();
    try {
      configFile.load(this.getClass().getResourceAsStream("..\\config.config"));
    }catch(Exception eta){
        eta.printStackTrace();
    }
   }
 
   public String getProperty(String key)
   {
        String value = this.configFile.getProperty(key);
        return value;
   }
}


