package com.supercompany.miragecodir.service;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import fr.jaschavolp.m1.jee.mirageshared.shared.services.ServicesCODIRRemote;

/**
 * Structure un service RMI pour l'interaction entre le serveur et un client MIA-CODIR
 * @author FlorianDELSOL
 */
public class RMICODIRClientService {
    private final static String URI = "fr.jaschavolp.m1.jee.mirageshared.shared.services.ServicesCODIRRemote";
    
    private InitialContext ctx;
    private ServicesCODIRRemote remoteSvc;
    
    /**
     * Créer une nouvelle instance
     * @throws NamingException 
     */
    public RMICODIRClientService () throws NamingException{
        this.ctx = new InitialContext();
        remoteSvc = (ServicesCODIRRemote) ctx.lookup(URI);
    }

    /**
     * @return le service permettant la communication avec le serveur
     */
    public ServicesCODIRRemote getDabRemoteSvc() {
        return remoteSvc;
    }
    
}
