package com.msco.mil.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.msco.mil.shared.MyActor;
import com.msco.mil.shared.MyDeployment;
import com.msco.mil.shared.MyProcessInstance;
import com.msco.mil.shared.MyTask;


/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
    public List<MyDeployment> getDeployments() throws IllegalArgumentException;
    public List<MyProcessInstance> getProcessInstances(Integer status) throws IllegalArgumentException;
    public List<MyTask> getTasks() throws IllegalArgumentException;
    public List<MyActor> getActors() throws IllegalArgumentException;
    public String undeploy(String deploymentIdentifier) throws IllegalArgumentException;
}
