package com.msco.mil.shared;

import java.util.Date;
import com.msco.mil.shared.MyTaskProperties;

import com.google.gwt.editor.client.Editor.Path;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;


public interface MyTaskProperties extends PropertyAccess<MyTask> {
    @Path("key")
    ModelKeyProvider<MyTask> key();
    
    ValueProvider<MyTask, Long> id();
    
    ValueProvider<MyTask, String> name();
    
    ValueProvider<MyTask, Integer> priority();
    
    ValueProvider<MyTask, String> status();
    
    ValueProvider<MyTask, Date> createdOn();
    
    ValueProvider<MyTask, Date> expiration();
    
    ValueProvider<MyTask, String> owner();
    
    ValueProvider<MyTask, String> deployment();
    
    ValueProvider<MyTask, String> parentName();
    
    ValueProvider<MyTask, String> action1();
}