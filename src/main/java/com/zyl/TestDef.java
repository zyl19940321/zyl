package com.zyl;

import java.util.ServiceLoader;

public interface TestDef<T> {

   default Class getMyClass(T t){
      return this.getClass();
   }

}
