package com.msco.mil.shared;

import java.util.Date;
import com.msco.mil.shared.MyProcessDefinition;

import com.google.gwt.editor.client.Editor.Path;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;

public interface MyProcessDefinitionProperties extends PropertyAccess<MyProcessDefinition> {
    @Path("key")
    ModelKeyProvider<MyProcessDefinition> key();
    
    ValueProvider<MyProcessDefinition, Long> id();
    
    ValueProvider<MyProcessDefinition, String> name();
    
    ValueProvider<MyProcessDefinition, String> initiator();
    
    ValueProvider<MyProcessDefinition, String> version();
    
    ValueProvider<MyProcessDefinition, String> state();
    
    ValueProvider<MyProcessDefinition, Long> startDate();
    
    ValueProvider<MyProcessDefinition, Date> date();
}