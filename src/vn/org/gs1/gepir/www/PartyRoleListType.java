
/**
 * PartyRoleListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */

            
                package vn.org.gs1.gepir.www;
            

            /**
            *  PartyRoleListType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PartyRoleListType
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.gepir.gs1.org.vn/",
                "partyRoleListType",
                "ns3");

            

                        /**
                        * field for PartyRoleListType
                        */

                        
                                    protected java.lang.String localPartyRoleListType ;
                                
                            private static java.util.HashMap _table_ = new java.util.HashMap();

                            // Constructor
                            
                                protected PartyRoleListType(java.lang.String value, boolean isRegisterValue) {
                                    localPartyRoleListType = value;
                                    if (isRegisterValue){
                                        
                                               _table_.put(localPartyRoleListType, this);
                                           
                                    }

                                }
                            
                                    public static final java.lang.String _BILL_TO =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BILL_TO");
                                
                                    public static final java.lang.String _BUYER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BUYER");
                                
                                    public static final java.lang.String _CONSUMER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CONSUMER");
                                
                                    public static final java.lang.String _CORPORATE_IDENTITY =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CORPORATE_IDENTITY");
                                
                                    public static final java.lang.String _DELIVERY_PARTY =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DELIVERY_PARTY");
                                
                                    public static final java.lang.String _DISTRIBUTOR_AND_OR_BROKER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DISTRIBUTOR_AND_OR_BROKER");
                                
                                    public static final java.lang.String _INFORMATION_PROVIDER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INFORMATION_PROVIDER");
                                
                                    public static final java.lang.String _INVOICEE =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INVOICEE");
                                
                                    public static final java.lang.String _ISSUER_OF_INVOICE =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ISSUER_OF_INVOICE");
                                
                                    public static final java.lang.String _LOGISTICS_SERVICE_PROVIDER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LOGISTICS_SERVICE_PROVIDER");
                                
                                    public static final java.lang.String _MANUFACTURING_PLANT =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MANUFACTURING_PLANT");
                                
                                    public static final java.lang.String _MARK_FOR =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MARK_FOR");
                                
                                    public static final java.lang.String _MESSAGE_FROM =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MESSAGE_FROM");
                                
                                    public static final java.lang.String _MESSAGE_RECIPIENT =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MESSAGE_RECIPIENT");
                                
                                    public static final java.lang.String _OPERATOR =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("OPERATOR");
                                
                                    public static final java.lang.String _PARTY_TO_RECEIVE_COMMERCIAL_INVOICE =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PARTY_TO_RECEIVE_COMMERCIAL_INVOICE");
                                
                                    public static final java.lang.String _PAYEE =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PAYEE");
                                
                                    public static final java.lang.String _PAYER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PAYER");
                                
                                    public static final java.lang.String _SELLER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SELLER");
                                
                                    public static final java.lang.String _SHIP_FROM =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SHIP_FROM");
                                
                                    public static final java.lang.String _SHIP_TO =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SHIP_TO");
                                
                                    public static final java.lang.String _STORE =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("STORE");
                                
                                    public static final java.lang.String _SUPPLIER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SUPPLIER");
                                
                                    public static final java.lang.String _WAREHOUSE_AND_OR_DEPOT =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("WAREHOUSE_AND_OR_DEPOT");
                                
                                public static final PartyRoleListType BILL_TO =
                                    new PartyRoleListType(_BILL_TO,true);
                            
                                public static final PartyRoleListType BUYER =
                                    new PartyRoleListType(_BUYER,true);
                            
                                public static final PartyRoleListType CONSUMER =
                                    new PartyRoleListType(_CONSUMER,true);
                            
                                public static final PartyRoleListType CORPORATE_IDENTITY =
                                    new PartyRoleListType(_CORPORATE_IDENTITY,true);
                            
                                public static final PartyRoleListType DELIVERY_PARTY =
                                    new PartyRoleListType(_DELIVERY_PARTY,true);
                            
                                public static final PartyRoleListType DISTRIBUTOR_AND_OR_BROKER =
                                    new PartyRoleListType(_DISTRIBUTOR_AND_OR_BROKER,true);
                            
                                public static final PartyRoleListType INFORMATION_PROVIDER =
                                    new PartyRoleListType(_INFORMATION_PROVIDER,true);
                            
                                public static final PartyRoleListType INVOICEE =
                                    new PartyRoleListType(_INVOICEE,true);
                            
                                public static final PartyRoleListType ISSUER_OF_INVOICE =
                                    new PartyRoleListType(_ISSUER_OF_INVOICE,true);
                            
                                public static final PartyRoleListType LOGISTICS_SERVICE_PROVIDER =
                                    new PartyRoleListType(_LOGISTICS_SERVICE_PROVIDER,true);
                            
                                public static final PartyRoleListType MANUFACTURING_PLANT =
                                    new PartyRoleListType(_MANUFACTURING_PLANT,true);
                            
                                public static final PartyRoleListType MARK_FOR =
                                    new PartyRoleListType(_MARK_FOR,true);
                            
                                public static final PartyRoleListType MESSAGE_FROM =
                                    new PartyRoleListType(_MESSAGE_FROM,true);
                            
                                public static final PartyRoleListType MESSAGE_RECIPIENT =
                                    new PartyRoleListType(_MESSAGE_RECIPIENT,true);
                            
                                public static final PartyRoleListType OPERATOR =
                                    new PartyRoleListType(_OPERATOR,true);
                            
                                public static final PartyRoleListType PARTY_TO_RECEIVE_COMMERCIAL_INVOICE =
                                    new PartyRoleListType(_PARTY_TO_RECEIVE_COMMERCIAL_INVOICE,true);
                            
                                public static final PartyRoleListType PAYEE =
                                    new PartyRoleListType(_PAYEE,true);
                            
                                public static final PartyRoleListType PAYER =
                                    new PartyRoleListType(_PAYER,true);
                            
                                public static final PartyRoleListType SELLER =
                                    new PartyRoleListType(_SELLER,true);
                            
                                public static final PartyRoleListType SHIP_FROM =
                                    new PartyRoleListType(_SHIP_FROM,true);
                            
                                public static final PartyRoleListType SHIP_TO =
                                    new PartyRoleListType(_SHIP_TO,true);
                            
                                public static final PartyRoleListType STORE =
                                    new PartyRoleListType(_STORE,true);
                            
                                public static final PartyRoleListType SUPPLIER =
                                    new PartyRoleListType(_SUPPLIER,true);
                            
                                public static final PartyRoleListType WAREHOUSE_AND_OR_DEPOT =
                                    new PartyRoleListType(_WAREHOUSE_AND_OR_DEPOT,true);
                            

                                public java.lang.String getValue() { return localPartyRoleListType;}

                                public boolean equals(java.lang.Object obj) {return (obj == this);}
                                public int hashCode() { return toString().hashCode();}
                                public java.lang.String toString() {
                                
                                        return localPartyRoleListType.toString();
                                    

                                }

                        

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                
                //We can safely assume an element has only one type associated with it
                
                            java.lang.String namespace = parentQName.getNamespaceURI();
                            java.lang.String _localName = parentQName.getLocalPart();
                        
                            writeStartElement(null, namespace, _localName, xmlWriter);

                            // add the type details if this is used in a simple type
                               if (serializeType){
                                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.gepir.gs1.org.vn/");
                                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           namespacePrefix+":partyRoleListType",
                                           xmlWriter);
                                   } else {
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           "partyRoleListType",
                                           xmlWriter);
                                   }
                               }
                            
                                          if (localPartyRoleListType==null){
                                            
                                                     throw new org.apache.axis2.databinding.ADBException("partyRoleListType cannot be null !!");
                                                
                                         }else{
                                        
                                                       xmlWriter.writeCharacters(localPartyRoleListType);
                                            
                                         }
                                    
                            xmlWriter.writeEndElement();
                    

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.gepir.gs1.org.vn/")){
                return "ns3";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                
                //We can safely assume an element has only one type associated with it
                 return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                            new java.lang.Object[]{
                            org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPartyRoleListType)
                            },
                            null);

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        
                public static PartyRoleListType fromValue(java.lang.String value)
                      throws java.lang.IllegalArgumentException {
                    PartyRoleListType enumeration = (PartyRoleListType)
                       
                               _table_.get(value);
                           

                    if ((enumeration == null) && !((value == null) || (value.equals("")))) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    return enumeration;
                }
                public static PartyRoleListType fromString(java.lang.String value,java.lang.String namespaceURI)
                      throws java.lang.IllegalArgumentException {
                    try {
                       
                                       return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
                                   

                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalArgumentException();
                    }
                }

                public static PartyRoleListType fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
                                                                    java.lang.String content) {
                    if (content.indexOf(":") > -1){
                        java.lang.String prefix = content.substring(0,content.indexOf(":"));
                        java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                        return PartyRoleListType.Factory.fromString(content,namespaceUri);
                    } else {
                       return PartyRoleListType.Factory.fromString(content,"");
                    }
                }
            

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static PartyRoleListType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PartyRoleListType object = null;
                // initialize a hash map to keep values
                java.util.Map attributeMap = new java.util.HashMap();
                java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();
            

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                   
                while(!reader.isEndElement()) {
                    if (reader.isStartElement()  || reader.hasText()){
                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"partyRoleListType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                        if (content.indexOf(":") > 0) {
                                            // this seems to be a Qname so find the namespace and send
                                            prefix = content.substring(0, content.indexOf(":"));
                                            namespaceuri = reader.getNamespaceURI(prefix);
                                            object = PartyRoleListType.Factory.fromString(content,namespaceuri);
                                        } else {
                                            // this seems to be not a qname send and empty namespace incase of it is
                                            // check is done in fromString method
                                            object = PartyRoleListType.Factory.fromString(content,"");
                                        }
                                        
                                        
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    