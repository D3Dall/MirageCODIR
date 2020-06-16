/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supercompany.miragecodir.service;

import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import fr.jaschavolp.m1.jee.mirageshared.shared.services.ServicesCODIRRemote;

/**
 *
 * @author FlorianDELSOL
 */
public class RMICODIRClientService {
    private final static String URI = "fr.jaschavolp.m1.jee.mirageshared.shared.services.ServicesCODIRRemote";
    
    private InitialContext ctx;
    private ServicesCODIRRemote remoteSvc;
    
    public RMICODIRClientService () throws NamingException{
        this.ctx = new InitialContext();
        remoteSvc = (ServicesCODIRRemote) ctx.lookup(URI);
    }

    public ServicesCODIRRemote getDabRemoteSvc() {
        return remoteSvc;
    }

    
}
