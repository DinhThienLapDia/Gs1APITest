
/**
 * Gs1VnAPIMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package vn.org.gs1.gepir.www;

        /**
        *  Gs1VnAPIMessageReceiverInOut message receiver
        */

        public class Gs1VnAPIMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        Gs1VnAPISkeleton skel = (Gs1VnAPISkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getOwnerOfGLN".equals(methodName)){
                
                vn.org.gs1.gepir.www.GepirPartyE gepirParty84 = null;
	                        vn.org.gs1.gepir.www.GetOwnerOfGLNE wrappedParam =
                                                             (vn.org.gs1.gepir.www.GetOwnerOfGLNE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    vn.org.gs1.gepir.www.GetOwnerOfGLNE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               gepirParty84 =
                                                   
                                                   
                                                         skel.getOwnerOfGLN(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), gepirParty84, false, new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                    "getOwnerOfGLN"));
                                    } else 

            if("getItemByGTIN".equals(methodName)){
                
                vn.org.gs1.gepir.www.GepirItemE gepirItem87 = null;
	                        vn.org.gs1.gepir.www.GetItemByGTINE wrappedParam =
                                                             (vn.org.gs1.gepir.www.GetItemByGTINE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    vn.org.gs1.gepir.www.GetItemByGTINE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               gepirItem87 =
                                                   
                                                   
                                                         skel.getItemByGTIN(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), gepirItem87, false, new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                    "getItemByGTIN"));
                                    } else 

            if("gepirVersion2".equals(methodName)){
                
                vn.org.gs1.gepir.response.GepirVersion2Response gepirVersion2Response89 = null;
	                        vn.org.gs1.gepir.request.GepirVersion2Request wrappedParam =
                                                             (vn.org.gs1.gepir.request.GepirVersion2Request)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    vn.org.gs1.gepir.request.GepirVersion2Request.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               gepirVersion2Response89 =
                                                   
                                                   
                                                         skel.gepirVersion2(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), gepirVersion2Response89, false, new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                    "gepirVersion2"));
                                    } else 

            if("getPartyByGLN".equals(methodName)){
                
                vn.org.gs1.gepir.www.GepirPartyE gepirParty92 = null;
	                        vn.org.gs1.gepir.www.GetPartyByGLNE wrappedParam =
                                                             (vn.org.gs1.gepir.www.GetPartyByGLNE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    vn.org.gs1.gepir.www.GetPartyByGLNE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               gepirParty92 =
                                                   
                                                   
                                                         skel.getPartyByGLN(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), gepirParty92, false, new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                    "getPartyByGLN"));
                                    } else 

            if("getAuthorization".equals(methodName)){
                
                vn.org.gs1.gepir.www.GepirAuthorizationE gepirAuthorization95 = null;
	                        vn.org.gs1.gepir.www.GetAuthorizationE wrappedParam =
                                                             (vn.org.gs1.gepir.www.GetAuthorizationE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    vn.org.gs1.gepir.www.GetAuthorizationE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               gepirAuthorization95 =
                                                   
                                                   
                                                         skel.getAuthorization(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), gepirAuthorization95, false, new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                    "getAuthorization"));
                                    } else 

            if("getPartyByName".equals(methodName)){
                
                vn.org.gs1.gepir.www.GepirPartyE gepirParty98 = null;
	                        vn.org.gs1.gepir.www.GetPartyByNameE wrappedParam =
                                                             (vn.org.gs1.gepir.www.GetPartyByNameE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    vn.org.gs1.gepir.www.GetPartyByNameE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               gepirParty98 =
                                                   
                                                   
                                                         skel.getPartyByName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), gepirParty98, false, new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                    "getPartyByName"));
                                    } else 

            if("sessionAuthorize".equals(methodName)){
                
                vn.org.gs1.gepir.www.SessionAuthorizeResponse sessionAuthorizeResponse100 = null;
	                        vn.org.gs1.gepir.www.SessionAuthorize wrappedParam =
                                                             (vn.org.gs1.gepir.www.SessionAuthorize)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    vn.org.gs1.gepir.www.SessionAuthorize.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               sessionAuthorizeResponse100 =
                                                   
                                                   
                                                         skel.sessionAuthorize(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), sessionAuthorizeResponse100, false, new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                    "sessionAuthorize"));
                                    } else 

            if("getPartyByGTIN".equals(methodName)){
                
                vn.org.gs1.gepir.www.GepirPartyE gepirParty103 = null;
	                        vn.org.gs1.gepir.www.GetPartyByGTINE wrappedParam =
                                                             (vn.org.gs1.gepir.www.GetPartyByGTINE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    vn.org.gs1.gepir.www.GetPartyByGTINE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               gepirParty103 =
                                                   
                                                   
                                                         skel.getPartyByGTIN(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), gepirParty103, false, new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                    "getPartyByGTIN"));
                                    } else 

            if("getPartyBySSCC".equals(methodName)){
                
                vn.org.gs1.gepir.www.GepirPartyE gepirParty106 = null;
	                        vn.org.gs1.gepir.www.GetPartyBySSCCE wrappedParam =
                                                             (vn.org.gs1.gepir.www.GetPartyBySSCCE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    vn.org.gs1.gepir.www.GetPartyBySSCCE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               gepirParty106 =
                                                   
                                                   
                                                         skel.getPartyBySSCC(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), gepirParty106, false, new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                    "getPartyBySSCC"));
                                    } else 

            if("getStatistics".equals(methodName)){
                
                vn.org.gs1.gepir.www.GepirStatisticsE gepirStatistics109 = null;
	                        vn.org.gs1.gepir.www.GetStatisticsE wrappedParam =
                                                             (vn.org.gs1.gepir.www.GetStatisticsE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    vn.org.gs1.gepir.www.GetStatisticsE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               gepirStatistics109 =
                                                   
                                                   
                                                         skel.getStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), gepirStatistics109, false, new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                    "getStatistics"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GetOwnerOfGLNE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GetOwnerOfGLNE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GepirPartyE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GepirPartyE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GepirRequestHeaderE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GepirRequestHeaderE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GepirResponseHeaderE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GepirResponseHeaderE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GetItemByGTINE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GetItemByGTINE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GepirItemE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GepirItemE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.request.GepirVersion2Request param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.request.GepirVersion2Request.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.response.GepirVersion2Response param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.response.GepirVersion2Response.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GetPartyByGLNE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GetPartyByGLNE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GetAuthorizationE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GetAuthorizationE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GepirAuthorizationE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GepirAuthorizationE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GetPartyByNameE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GetPartyByNameE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.SessionAuthorize param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.SessionAuthorize.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.SessionAuthorizeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.SessionAuthorizeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GetPartyByGTINE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GetPartyByGTINE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GetPartyBySSCCE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GetPartyBySSCCE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GetStatisticsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GetStatisticsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(vn.org.gs1.gepir.www.GepirStatisticsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(vn.org.gs1.gepir.www.GepirStatisticsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, vn.org.gs1.gepir.www.GepirPartyE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(vn.org.gs1.gepir.www.GepirPartyE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private vn.org.gs1.gepir.www.GepirPartyE wrapGetOwnerOfGLN(){
                                vn.org.gs1.gepir.www.GepirPartyE wrappedElement = new vn.org.gs1.gepir.www.GepirPartyE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, vn.org.gs1.gepir.www.GepirItemE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(vn.org.gs1.gepir.www.GepirItemE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private vn.org.gs1.gepir.www.GepirItemE wrapGetItemByGTIN(){
                                vn.org.gs1.gepir.www.GepirItemE wrappedElement = new vn.org.gs1.gepir.www.GepirItemE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, vn.org.gs1.gepir.response.GepirVersion2Response param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(vn.org.gs1.gepir.response.GepirVersion2Response.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private vn.org.gs1.gepir.response.GepirVersion2Response wrapGepirVersion2(){
                                vn.org.gs1.gepir.response.GepirVersion2Response wrappedElement = new vn.org.gs1.gepir.response.GepirVersion2Response();
                                return wrappedElement;
                         }
                    
                         private vn.org.gs1.gepir.www.GepirPartyE wrapGetPartyByGLN(){
                                vn.org.gs1.gepir.www.GepirPartyE wrappedElement = new vn.org.gs1.gepir.www.GepirPartyE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, vn.org.gs1.gepir.www.GepirAuthorizationE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(vn.org.gs1.gepir.www.GepirAuthorizationE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private vn.org.gs1.gepir.www.GepirAuthorizationE wrapGetAuthorization(){
                                vn.org.gs1.gepir.www.GepirAuthorizationE wrappedElement = new vn.org.gs1.gepir.www.GepirAuthorizationE();
                                return wrappedElement;
                         }
                    
                         private vn.org.gs1.gepir.www.GepirPartyE wrapGetPartyByName(){
                                vn.org.gs1.gepir.www.GepirPartyE wrappedElement = new vn.org.gs1.gepir.www.GepirPartyE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, vn.org.gs1.gepir.www.SessionAuthorizeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(vn.org.gs1.gepir.www.SessionAuthorizeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private vn.org.gs1.gepir.www.SessionAuthorizeResponse wrapSessionAuthorize(){
                                vn.org.gs1.gepir.www.SessionAuthorizeResponse wrappedElement = new vn.org.gs1.gepir.www.SessionAuthorizeResponse();
                                return wrappedElement;
                         }
                    
                         private vn.org.gs1.gepir.www.GepirPartyE wrapGetPartyByGTIN(){
                                vn.org.gs1.gepir.www.GepirPartyE wrappedElement = new vn.org.gs1.gepir.www.GepirPartyE();
                                return wrappedElement;
                         }
                    
                         private vn.org.gs1.gepir.www.GepirPartyE wrapGetPartyBySSCC(){
                                vn.org.gs1.gepir.www.GepirPartyE wrappedElement = new vn.org.gs1.gepir.www.GepirPartyE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, vn.org.gs1.gepir.www.GepirStatisticsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(vn.org.gs1.gepir.www.GepirStatisticsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private vn.org.gs1.gepir.www.GepirStatisticsE wrapGetStatistics(){
                                vn.org.gs1.gepir.www.GepirStatisticsE wrappedElement = new vn.org.gs1.gepir.www.GepirStatisticsE();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (vn.org.gs1.gepir.request.GepirVersion2Request.class.equals(type)){
                
                        return vn.org.gs1.gepir.request.GepirVersion2Request.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.response.GepirVersion2Response.class.equals(type)){
                
                        return vn.org.gs1.gepir.response.GepirVersion2Response.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GepirAuthorizationE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GepirAuthorizationE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GepirItemE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GepirItemE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GepirPartyE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GepirPartyE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GepirRequestHeaderE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GepirRequestHeaderE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GepirResponseHeaderE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GepirResponseHeaderE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GepirStatisticsE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GepirStatisticsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GetAuthorizationE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GetAuthorizationE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GetItemByGTINE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GetItemByGTINE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GetOwnerOfGLNE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GetOwnerOfGLNE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GetPartyByGLNE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GetPartyByGLNE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GetPartyByGTINE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GetPartyByGTINE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GetPartyByNameE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GetPartyByNameE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GetPartyBySSCCE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GetPartyBySSCCE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.GetStatisticsE.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.GetStatisticsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.SessionAuthorize.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.SessionAuthorize.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (vn.org.gs1.gepir.www.SessionAuthorizeResponse.class.equals(type)){
                
                        return vn.org.gs1.gepir.www.SessionAuthorizeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    