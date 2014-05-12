package com.msco.mil.shared;

import java.util.Date;

import com.google.gwt.editor.client.Editor.Path;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;


public interface MyTaskProperties extends PropertyAccess<ThisTask> {
    @Path("key")
    ModelKeyProvider<ThisTask> key();
    
    ValueProvider<ThisTask, Long> id();
    
    ValueProvider<ThisTask, String> name();
    
    ValueProvider<ThisTask, Integer> priority();
    
    ValueProvider<ThisTask, String> status();
    
    ValueProvider<ThisTask, Date> createdOn();
    
    ValueProvider<ThisTask, Date> expiration();
    
    ValueProvider<ThisTask, String> owner();
    
    ValueProvider<ThisTask, String> deployment();
    
    ValueProvider<ThisTask, String> parentName();
    
    ValueProvider<ThisTask, String> action1();
}