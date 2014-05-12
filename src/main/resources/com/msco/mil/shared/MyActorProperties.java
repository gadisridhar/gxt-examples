package com.msco.mil.shared;

import com.google.gwt.editor.client.Editor.Path;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;


public interface MyActorProperties extends PropertyAccess<MyActor> {
    @Path("key")
    ModelKeyProvider<MyActor> key();
    
    ValueProvider<MyActor, String> name();
    
    ValueProvider<MyActor, String> color();
}