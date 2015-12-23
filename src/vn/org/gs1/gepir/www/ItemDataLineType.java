
/**
 * ItemDataLineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */

            
                package vn.org.gs1.gepir.www;
            

            /**
            *  ItemDataLineType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ItemDataLineType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = itemDataLineType
                Namespace URI = http://www.gepir.gs1.org.vn/
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for Gtin
                        */

                        
                                    protected java.lang.String localGtin ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGtin(){
                               return localGtin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Gtin
                               */
                               public void setGtin(java.lang.String param){
                            
                                            this.localGtin=param;
                                       

                               }
                            

                        /**
                        * field for InformationProviderGln
                        */

                        
                                    protected java.lang.String localInformationProviderGln ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInformationProviderGln(){
                               return localInformationProviderGln;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InformationProviderGln
                               */
                               public void setInformationProviderGln(java.lang.String param){
                            
                                            this.localInformationProviderGln=param;
                                       

                               }
                            

                        /**
                        * field for ManufacturerGln
                        */

                        
                                    protected java.lang.String localManufacturerGln ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getManufacturerGln(){
                               return localManufacturerGln;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ManufacturerGln
                               */
                               public void setManufacturerGln(java.lang.String param){
                            
                                            this.localManufacturerGln=param;
                                       

                               }
                            

                        /**
                        * field for ItemName
                        */

                        
                                    protected java.lang.String localItemName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getItemName(){
                               return localItemName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItemName
                               */
                               public void setItemName(java.lang.String param){
                            
                                            this.localItemName=param;
                                       

                               }
                            

                        /**
                        * field for BrandName
                        */

                        
                                    protected java.lang.String localBrandName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBrandName(){
                               return localBrandName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BrandName
                               */
                               public void setBrandName(java.lang.String param){
                            
                                            this.localBrandName=param;
                                       

                               }
                            

                        /**
                        * field for TradeItemUnitDescriptor
                        */

                        
                                    protected vn.org.gs1.gepir.www.ItemDataLineTypeTradeItemUnitDescriptor localTradeItemUnitDescriptor ;
                                

                           /**
                           * Auto generated getter method
                           * @return vn.org.gs1.gepir.www.ItemDataLineTypeTradeItemUnitDescriptor
                           */
                           public  vn.org.gs1.gepir.www.ItemDataLineTypeTradeItemUnitDescriptor getTradeItemUnitDescriptor(){
                               return localTradeItemUnitDescriptor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TradeItemUnitDescriptor
                               */
                               public void setTradeItemUnitDescriptor(vn.org.gs1.gepir.www.ItemDataLineTypeTradeItemUnitDescriptor param){
                            
                                            this.localTradeItemUnitDescriptor=param;
                                       

                               }
                            

                        /**
                        * field for DescriptiveSize
                        */

                        
                                    protected java.lang.String localDescriptiveSize ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDescriptiveSize(){
                               return localDescriptiveSize;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DescriptiveSize
                               */
                               public void setDescriptiveSize(java.lang.String param){
                            
                                            this.localDescriptiveSize=param;
                                       

                               }
                            

                        /**
                        * field for NetContent
                        */

                        
                                    protected vn.org.gs1.gepir.www.ItemDataLineTypeNetContent localNetContent ;
                                

                           /**
                           * Auto generated getter method
                           * @return vn.org.gs1.gepir.www.ItemDataLineTypeNetContent
                           */
                           public  vn.org.gs1.gepir.www.ItemDataLineTypeNetContent getNetContent(){
                               return localNetContent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NetContent
                               */
                               public void setNetContent(vn.org.gs1.gepir.www.ItemDataLineTypeNetContent param){
                            
                                            this.localNetContent=param;
                                       

                               }
                            

                        /**
                        * field for LinkUri
                        * This was an Array!
                        */

                        
                                    protected vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri[] localLinkUri ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLinkUriTracker = false ;

                           public boolean isLinkUriSpecified(){
                               return localLinkUriTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri[]
                           */
                           public  vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri[] getLinkUri(){
                               return localLinkUri;
                           }

                           
                        


                               
                              /**
                               * validate the array for LinkUri
                               */
                              protected void validateLinkUri(vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LinkUri
                              */
                              public void setLinkUri(vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri[] param){
                              
                                   validateLinkUri(param);

                               localLinkUriTracker = param != null;
                                      
                                      this.localLinkUri=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri
                             */
                             public void addLinkUri(vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri param){
                                   if (localLinkUri == null){
                                   localLinkUri = new vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri[]{};
                                   }

                            
                                 //update the setting tracker
                                localLinkUriTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLinkUri);
                               list.add(param);
                               this.localLinkUri =
                             (vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri[])list.toArray(
                            new vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri[list.size()]);

                             }
                             

                        /**
                        * field for ClassificationCode
                        * This was an Array!
                        */

                        
                                    protected vn.org.gs1.gepir.www.ClassificationCodeType[] localClassificationCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClassificationCodeTracker = false ;

                           public boolean isClassificationCodeSpecified(){
                               return localClassificationCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return vn.org.gs1.gepir.www.ClassificationCodeType[]
                           */
                           public  vn.org.gs1.gepir.www.ClassificationCodeType[] getClassificationCode(){
                               return localClassificationCode;
                           }

                           
                        


                               
                              /**
                               * validate the array for ClassificationCode
                               */
                              protected void validateClassificationCode(vn.org.gs1.gepir.www.ClassificationCodeType[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ClassificationCode
                              */
                              public void setClassificationCode(vn.org.gs1.gepir.www.ClassificationCodeType[] param){
                              
                                   validateClassificationCode(param);

                               localClassificationCodeTracker = param != null;
                                      
                                      this.localClassificationCode=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param vn.org.gs1.gepir.www.ClassificationCodeType
                             */
                             public void addClassificationCode(vn.org.gs1.gepir.www.ClassificationCodeType param){
                                   if (localClassificationCode == null){
                                   localClassificationCode = new vn.org.gs1.gepir.www.ClassificationCodeType[]{};
                                   }

                            
                                 //update the setting tracker
                                localClassificationCodeTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localClassificationCode);
                               list.add(param);
                               this.localClassificationCode =
                             (vn.org.gs1.gepir.www.ClassificationCodeType[])list.toArray(
                            new vn.org.gs1.gepir.www.ClassificationCodeType[list.size()]);

                             }
                             

                        /**
                        * field for LastChangeDateTime
                        */

                        
                                    protected java.util.Calendar localLastChangeDateTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastChangeDateTime(){
                               return localLastChangeDateTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastChangeDateTime
                               */
                               public void setLastChangeDateTime(java.util.Calendar param){
                            
                                            this.localLastChangeDateTime=param;
                                       

                               }
                            

                        /**
                        * field for ChildItems
                        */

                        
                                    protected vn.org.gs1.gepir.www.ArrayOfItemDataLineTypeChildItemsChildItem localChildItems ;
                                

                           /**
                           * Auto generated getter method
                           * @return vn.org.gs1.gepir.www.ArrayOfItemDataLineTypeChildItemsChildItem
                           */
                           public  vn.org.gs1.gepir.www.ArrayOfItemDataLineTypeChildItemsChildItem getChildItems(){
                               return localChildItems;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChildItems
                               */
                               public void setChildItems(vn.org.gs1.gepir.www.ArrayOfItemDataLineTypeChildItemsChildItem param){
                            
                                            this.localChildItems=param;
                                       

                               }
                            

                        /**
                        * field for Lang
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.Language localLang =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLanguage("en");
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Language
                           */
                           public  org.apache.axis2.databinding.types.Language getLang(){
                               return localLang;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Lang
                               */
                               public void setLang(org.apache.axis2.databinding.types.Language param){
                            
                                            this.localLang=param;
                                       

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
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
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
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.gepir.gs1.org.vn/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":itemDataLineType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "itemDataLineType",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localLang != null){
                                        
                                                writeAttribute("",
                                                         "lang",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLang), xmlWriter);

                                            
                                      }
                                    
                                    namespace = "http://www.gepir.gs1.org.vn/";
                                    writeStartElement(null, namespace, "gtin", xmlWriter);
                             

                                          if (localGtin==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGtin);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.gepir.gs1.org.vn/";
                                    writeStartElement(null, namespace, "informationProviderGln", xmlWriter);
                             

                                          if (localInformationProviderGln==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localInformationProviderGln);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.gepir.gs1.org.vn/";
                                    writeStartElement(null, namespace, "manufacturerGln", xmlWriter);
                             

                                          if (localManufacturerGln==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localManufacturerGln);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.gepir.gs1.org.vn/";
                                    writeStartElement(null, namespace, "itemName", xmlWriter);
                             

                                          if (localItemName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localItemName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.gepir.gs1.org.vn/";
                                    writeStartElement(null, namespace, "brandName", xmlWriter);
                             

                                          if (localBrandName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBrandName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localTradeItemUnitDescriptor==null){
                                                 throw new org.apache.axis2.databinding.ADBException("tradeItemUnitDescriptor cannot be null!!");
                                            }
                                           localTradeItemUnitDescriptor.serialize(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","tradeItemUnitDescriptor"),
                                               xmlWriter);
                                        
                                    namespace = "http://www.gepir.gs1.org.vn/";
                                    writeStartElement(null, namespace, "descriptiveSize", xmlWriter);
                             

                                          if (localDescriptiveSize==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescriptiveSize);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localNetContent==null){

                                        writeStartElement(null, "http://www.gepir.gs1.org.vn/", "netContent", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNetContent.serialize(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","netContent"),
                                        xmlWriter);
                                    }
                                 if (localLinkUriTracker){
                                       if (localLinkUri!=null){
                                            for (int i = 0;i < localLinkUri.length;i++){
                                                if (localLinkUri[i] != null){
                                                 localLinkUri[i].serialize(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","linkUri"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("linkUri cannot be null!!");
                                        
                                    }
                                 } if (localClassificationCodeTracker){
                                       if (localClassificationCode!=null){
                                            for (int i = 0;i < localClassificationCode.length;i++){
                                                if (localClassificationCode[i] != null){
                                                 localClassificationCode[i].serialize(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","classificationCode"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("classificationCode cannot be null!!");
                                        
                                    }
                                 }
                                    namespace = "http://www.gepir.gs1.org.vn/";
                                    writeStartElement(null, namespace, "lastChangeDateTime", xmlWriter);
                             

                                          if (localLastChangeDateTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastChangeDateTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localChildItems==null){

                                        writeStartElement(null, "http://www.gepir.gs1.org.vn/", "childItems", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localChildItems.serialize(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","childItems"),
                                        xmlWriter);
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


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "gtin"));
                                 
                                         elementList.add(localGtin==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGtin));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "informationProviderGln"));
                                 
                                         elementList.add(localInformationProviderGln==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInformationProviderGln));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "manufacturerGln"));
                                 
                                         elementList.add(localManufacturerGln==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localManufacturerGln));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "itemName"));
                                 
                                         elementList.add(localItemName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "brandName"));
                                 
                                         elementList.add(localBrandName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBrandName));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "tradeItemUnitDescriptor"));
                            
                            
                                    if (localTradeItemUnitDescriptor==null){
                                         throw new org.apache.axis2.databinding.ADBException("tradeItemUnitDescriptor cannot be null!!");
                                    }
                                    elementList.add(localTradeItemUnitDescriptor);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "descriptiveSize"));
                                 
                                         elementList.add(localDescriptiveSize==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescriptiveSize));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "netContent"));
                            
                            
                                    elementList.add(localNetContent==null?null:
                                    localNetContent);
                                 if (localLinkUriTracker){
                             if (localLinkUri!=null) {
                                 for (int i = 0;i < localLinkUri.length;i++){

                                    if (localLinkUri[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                          "linkUri"));
                                         elementList.add(localLinkUri[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("linkUri cannot be null!!");
                                    
                             }

                        } if (localClassificationCodeTracker){
                             if (localClassificationCode!=null) {
                                 for (int i = 0;i < localClassificationCode.length;i++){

                                    if (localClassificationCode[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                          "classificationCode"));
                                         elementList.add(localClassificationCode[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("classificationCode cannot be null!!");
                                    
                             }

                        }
                                      elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "lastChangeDateTime"));
                                 
                                         elementList.add(localLastChangeDateTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastChangeDateTime));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "childItems"));
                            
                            
                                    elementList.add(localChildItems==null?null:
                                    localChildItems);
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","lang"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLang));
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ItemDataLineType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ItemDataLineType object =
                new ItemDataLineType();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"itemDataLineType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ItemDataLineType)vn.org.gs1.gepir.request.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "lang"
                    java.lang.String tempAttribLang =
                        
                                reader.getAttributeValue(null,"lang");
                            
                   if (tempAttribLang!=null){
                         java.lang.String content = tempAttribLang;
                        
                                                 object.setLang(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLanguage(tempAttribLang));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("lang");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                        java.util.ArrayList list10 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","gtin").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGtin(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","informationProviderGln").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInformationProviderGln(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","manufacturerGln").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setManufacturerGln(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","itemName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setItemName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","brandName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBrandName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","tradeItemUnitDescriptor").equals(reader.getName())){
                                
                                                object.setTradeItemUnitDescriptor(vn.org.gs1.gepir.www.ItemDataLineTypeTradeItemUnitDescriptor.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","descriptiveSize").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescriptiveSize(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","netContent").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNetContent(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNetContent(vn.org.gs1.gepir.www.ItemDataLineTypeNetContent.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","linkUri").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list9.add(vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone9 = false;
                                                        while(!loopDone9){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone9 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","linkUri").equals(reader.getName())){
                                                                    list9.add(vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone9 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setLinkUri((vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                vn.org.gs1.gepir.www.ItemDataLineTypeLinkUri.class,
                                                                list9));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","classificationCode").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list10.add(vn.org.gs1.gepir.www.ClassificationCodeType.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone10 = false;
                                                        while(!loopDone10){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone10 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","classificationCode").equals(reader.getName())){
                                                                    list10.add(vn.org.gs1.gepir.www.ClassificationCodeType.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone10 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setClassificationCode((vn.org.gs1.gepir.www.ClassificationCodeType[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                vn.org.gs1.gepir.www.ClassificationCodeType.class,
                                                                list10));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","lastChangeDateTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastChangeDateTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","childItems").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setChildItems(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setChildItems(vn.org.gs1.gepir.www.ArrayOfItemDataLineTypeChildItemsChildItem.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    