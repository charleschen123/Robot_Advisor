package com.dcfund.ra.thriftapi;

import org.apache.thrift.TException;  
import com.dcfund.ra.thriftapi.Hello.Iface;;  

public class HelloImpl implements Iface{  
  private static int count = 0;  
  @Override  
  public String helloString(String word) throws TException {  
    // TODO Auto-generated method stub  
    count += 1;  
    System.out.println("HELLOWORD!");
    System.out.println("get " + word + " " +count);     
    return "HWOOLWORD! hello " + word + " " + count;
    
    
    }  
}  