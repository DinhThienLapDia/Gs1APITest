
/**
 * PartyDataLineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */

package vn.org.gs1.gepir.www;

/**
 * PartyDataLineType bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class PartyDataLineType implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * partyDataLineType Namespace URI = http://www.gepir.gs1.org.vn/ Namespace
	 * Prefix = ns3
	 */

	/**
	 * field for Gln
	 */

	protected java.lang.String localGln;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getGln() {
		return localGln;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Gln
	 */
	public void setGln(java.lang.String param) {

		this.localGln = param;

	}

	/**
	 * field for ReturnCode
	 */

	protected org.apache.axis2.databinding.types.NonNegativeInteger localReturnCode;

	/**
	 * Auto generated getter method
	 * 
	 * @return org.apache.axis2.databinding.types.NonNegativeInteger
	 */
	public org.apache.axis2.databinding.types.NonNegativeInteger getReturnCode() {
		return localReturnCode;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ReturnCode
	 */
	public void setReturnCode(org.apache.axis2.databinding.types.NonNegativeInteger param) {

		this.localReturnCode = param;

	}

	/**
	 * field for InformationProviderGln
	 */

	protected java.lang.String localInformationProviderGln;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getInformationProviderGln() {
		return localInformationProviderGln;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            InformationProviderGln
	 */
	public void setInformationProviderGln(java.lang.String param) {

		this.localInformationProviderGln = param;

	}

	/**
	 * field for LastChangeDateTime
	 */

	protected java.util.Calendar localLastChangeDateTime;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getLastChangeDateTime() {
		return localLastChangeDateTime;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            LastChangeDateTime
	 */
	public void setLastChangeDateTime(java.util.Calendar param) {

		this.localLastChangeDateTime = param;

	}

	/**
	 * field for Gcp
	 */

	protected java.lang.String localGcp;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getGcp() {
		return localGcp;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Gcp
	 */
	public void setGcp(java.lang.String param) {

		this.localGcp = param;

	}

	/**
	 * field for AdditionalPartyId This was an Array!
	 */

	protected java.lang.String[] localAdditionalPartyId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAdditionalPartyIdTracker = false;

	public boolean isAdditionalPartyIdSpecified() {
		return localAdditionalPartyIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String[]
	 */
	public java.lang.String[] getAdditionalPartyId() {
		return localAdditionalPartyId;
	}

	/**
	 * validate the array for AdditionalPartyId
	 */
	protected void validateAdditionalPartyId(java.lang.String[] param) {

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AdditionalPartyId
	 */
	public void setAdditionalPartyId(java.lang.String[] param) {

		validateAdditionalPartyId(param);

		localAdditionalPartyIdTracker = param != null;

		this.localAdditionalPartyId = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            java.lang.String
	 */
	public void addAdditionalPartyId(java.lang.String param) {
		if (localAdditionalPartyId == null) {
			localAdditionalPartyId = new java.lang.String[] {};
		}

		// update the setting tracker
		localAdditionalPartyIdTracker = true;

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localAdditionalPartyId);
		list.add(param);
		this.localAdditionalPartyId = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);

	}

	/**
	 * field for PartyName
	 */

	protected java.lang.String localPartyName;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPartyName() {
		return localPartyName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PartyName
	 */
	public void setPartyName(java.lang.String param) {

		this.localPartyName = param;

	}

	/**
	 * field for StreetAddress This was an Array!
	 */

	protected java.lang.String[] localStreetAddress;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localStreetAddressTracker = false;

	public boolean isStreetAddressSpecified() {
		return localStreetAddressTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String[]
	 */
	public java.lang.String[] getStreetAddress() {
		return localStreetAddress;
	}

	/**
	 * validate the array for StreetAddress
	 */
	protected void validateStreetAddress(java.lang.String[] param) {

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            StreetAddress
	 */
	public void setStreetAddress(java.lang.String[] param) {

		validateStreetAddress(param);

		localStreetAddressTracker = param != null;

		this.localStreetAddress = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            java.lang.String
	 */
	public void addStreetAddress(java.lang.String param) {
		if (localStreetAddress == null) {
			localStreetAddress = new java.lang.String[] {};
		}

		// update the setting tracker
		localStreetAddressTracker = true;

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localStreetAddress);
		list.add(param);
		this.localStreetAddress = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);

	}

	/**
	 * field for POBoxNumber
	 */

	protected java.lang.String localPOBoxNumber;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPOBoxNumber() {
		return localPOBoxNumber;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            POBoxNumber
	 */
	public void setPOBoxNumber(java.lang.String param) {

		this.localPOBoxNumber = param;

	}

	/**
	 * field for SubDivision
	 */

	protected java.lang.String localSubDivision;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getSubDivision() {
		return localSubDivision;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SubDivision
	 */
	public void setSubDivision(java.lang.String param) {

		this.localSubDivision = param;

	}

	/**
	 * field for PostalCode
	 */

	protected java.lang.String localPostalCode;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPostalCode() {
		return localPostalCode;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PostalCode
	 */
	public void setPostalCode(java.lang.String param) {

		this.localPostalCode = param;

	}

	/**
	 * field for City
	 */

	protected java.lang.String localCity;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getCity() {
		return localCity;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            City
	 */
	public void setCity(java.lang.String param) {

		this.localCity = param;

	}

	/**
	 * field for CountryISOCode
	 */

	protected java.lang.String localCountryISOCode;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getCountryISOCode() {
		return localCountryISOCode;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CountryISOCode
	 */
	public void setCountryISOCode(java.lang.String param) {

		this.localCountryISOCode = param;

	}

	/**
	 * field for Contact This was an Array!
	 */

	protected vn.org.gs1.gepir.www.PartyContactType[] localContact;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localContactTracker = false;

	public boolean isContactSpecified() {
		return localContactTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return vn.org.gs1.gepir.www.PartyContactType[]
	 */
	public vn.org.gs1.gepir.www.PartyContactType[] getContact() {
		return localContact;
	}

	/**
	 * validate the array for Contact
	 */
	protected void validateContact(vn.org.gs1.gepir.www.PartyContactType[] param) {

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Contact
	 */
	public void setContact(vn.org.gs1.gepir.www.PartyContactType[] param) {

		validateContact(param);

		localContactTracker = param != null;

		this.localContact = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            vn.org.gs1.gepir.www.PartyContactType
	 */
	public void addContact(vn.org.gs1.gepir.www.PartyContactType param) {
		if (localContact == null) {
			localContact = new vn.org.gs1.gepir.www.PartyContactType[] {};
		}

		// update the setting tracker
		localContactTracker = true;

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localContact);
		list.add(param);
		this.localContact = (vn.org.gs1.gepir.www.PartyContactType[]) list
				.toArray(new vn.org.gs1.gepir.www.PartyContactType[list.size()]);

	}

	/**
	 * field for PartyRole
	 */

	protected vn.org.gs1.gepir.www.PartyRoleListType localPartyRole;

	/**
	 * Auto generated getter method
	 * 
	 * @return vn.org.gs1.gepir.www.PartyRoleListType
	 */
	public vn.org.gs1.gepir.www.PartyRoleListType getPartyRole() {
		return localPartyRole;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PartyRole
	 */
	public void setPartyRole(vn.org.gs1.gepir.www.PartyRoleListType param) {

		this.localPartyRole = param;

	}

	/**
	 * field for PartyContainment
	 */

	protected vn.org.gs1.gepir.www.ArrayOfPartyChildType localPartyContainment;

	/**
	 * Auto generated getter method
	 * 
	 * @return vn.org.gs1.gepir.www.ArrayOfPartyChildType
	 */
	public vn.org.gs1.gepir.www.ArrayOfPartyChildType getPartyContainment() {
		return localPartyContainment;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PartyContainment
	 */
	public void setPartyContainment(vn.org.gs1.gepir.www.ArrayOfPartyChildType param) {

		this.localPartyContainment = param;

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
		return factory.createOMElement(dataSource, parentQName);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
			boolean serializeType)
					throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {

			java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.gepir.gs1.org.vn/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":partyDataLineType", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "partyDataLineType",
						xmlWriter);
			}

		}

		namespace = "http://www.gepir.gs1.org.vn/";
		writeStartElement(null, namespace, "gln", xmlWriter);

		if (localGln == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(localGln);

		}

		xmlWriter.writeEndElement();

		namespace = "http://www.gepir.gs1.org.vn/";
		writeStartElement(null, namespace, "returnCode", xmlWriter);

		if (localReturnCode == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCode));

		}

		xmlWriter.writeEndElement();

		namespace = "http://www.gepir.gs1.org.vn/";
		writeStartElement(null, namespace, "informationProviderGln", xmlWriter);

		if (localInformationProviderGln == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(localInformationProviderGln);

		}

		xmlWriter.writeEndElement();

		namespace = "http://www.gepir.gs1.org.vn/";
		writeStartElement(null, namespace, "lastChangeDateTime", xmlWriter);

		if (localLastChangeDateTime == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastChangeDateTime));

		}

		xmlWriter.writeEndElement();

		namespace = "http://www.gepir.gs1.org.vn/";
		writeStartElement(null, namespace, "gcp", xmlWriter);

		if (localGcp == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(localGcp);

		}

		xmlWriter.writeEndElement();
		if (localAdditionalPartyIdTracker) {
			if (localAdditionalPartyId != null) {
				namespace = "http://www.gepir.gs1.org.vn/";
				for (int i = 0; i < localAdditionalPartyId.length; i++) {

					if (localAdditionalPartyId[i] != null) {

						writeStartElement(null, namespace, "additionalPartyId", xmlWriter);

						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localAdditionalPartyId[i]));

						xmlWriter.writeEndElement();

					} else {

						// we have to do nothing since minOccurs is zero

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("additionalPartyId cannot be null!!");

			}

		}
		namespace = "http://www.gepir.gs1.org.vn/";
		writeStartElement(null, namespace, "partyName", xmlWriter);

		if (localPartyName == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(localPartyName);

		}

		xmlWriter.writeEndElement();
		if (localStreetAddressTracker) {
			if (localStreetAddress != null) {
				namespace = "http://www.gepir.gs1.org.vn/";
				for (int i = 0; i < localStreetAddress.length; i++) {

					if (localStreetAddress[i] != null) {

						writeStartElement(null, namespace, "streetAddress", xmlWriter);

						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localStreetAddress[i]));

						xmlWriter.writeEndElement();

					} else {

						// we have to do nothing since minOccurs is zero

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("streetAddress cannot be null!!");

			}

		}
		namespace = "http://www.gepir.gs1.org.vn/";
		writeStartElement(null, namespace, "pOBoxNumber", xmlWriter);

		if (localPOBoxNumber == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(localPOBoxNumber);

		}

		xmlWriter.writeEndElement();

		namespace = "http://www.gepir.gs1.org.vn/";
		writeStartElement(null, namespace, "subDivision", xmlWriter);

		if (localSubDivision == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(localSubDivision);

		}

		xmlWriter.writeEndElement();

		namespace = "http://www.gepir.gs1.org.vn/";
		writeStartElement(null, namespace, "postalCode", xmlWriter);

		if (localPostalCode == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(localPostalCode);

		}

		xmlWriter.writeEndElement();

		namespace = "http://www.gepir.gs1.org.vn/";
		writeStartElement(null, namespace, "city", xmlWriter);

		if (localCity == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(localCity);

		}

		xmlWriter.writeEndElement();

		namespace = "http://www.gepir.gs1.org.vn/";
		writeStartElement(null, namespace, "countryISOCode", xmlWriter);

		if (localCountryISOCode == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(localCountryISOCode);

		}

		xmlWriter.writeEndElement();
		if (localContactTracker) {
			if (localContact != null) {
				for (int i = 0; i < localContact.length; i++) {
					if (localContact[i] != null) {
						localContact[i].serialize(
								new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "contact"), xmlWriter);
					} else {

						// we don't have to do any thing since minOccures is
						// zero

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("contact cannot be null!!");

			}
		}
		if (localPartyRole == null) {

			writeStartElement(null, "http://www.gepir.gs1.org.vn/", "partyRole", xmlWriter);

			// write the nil attribute
			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
			xmlWriter.writeEndElement();
		} else {
			localPartyRole.serialize(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "partyRole"),
					xmlWriter);
		}

		if (localPartyContainment == null) {

			writeStartElement(null, "http://www.gepir.gs1.org.vn/", "partyContainment", xmlWriter);

			// write the nil attribute
			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
			xmlWriter.writeEndElement();
		} else {
			localPartyContainment.serialize(
					new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "partyContainment"), xmlWriter);
		}

		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://www.gepir.gs1.org.vn/")) {
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
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
					throws javax.xml.stream.XMLStreamException {
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
			javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
					throws javax.xml.stream.XMLStreamException {

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
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(
						prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not
			// possible to write any
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
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
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
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
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
			throws org.apache.axis2.databinding.ADBException {

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "gln"));

		elementList.add(
				localGln == null ? null : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGln));

		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "returnCode"));

		elementList.add(localReturnCode == null ? null
				: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCode));

		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "informationProviderGln"));

		elementList.add(localInformationProviderGln == null ? null
				: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInformationProviderGln));

		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "lastChangeDateTime"));

		elementList.add(localLastChangeDateTime == null ? null
				: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastChangeDateTime));

		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "gcp"));

		elementList.add(
				localGcp == null ? null : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGcp));
		if (localAdditionalPartyIdTracker) {
			if (localAdditionalPartyId != null) {
				for (int i = 0; i < localAdditionalPartyId.length; i++) {

					if (localAdditionalPartyId[i] != null) {
						elementList.add(
								new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "additionalPartyId"));
						elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localAdditionalPartyId[i]));
					} else {

						// have to do nothing

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("additionalPartyId cannot be null!!");

			}

		}
		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "partyName"));

		elementList.add(localPartyName == null ? null
				: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPartyName));
		if (localStreetAddressTracker) {
			if (localStreetAddress != null) {
				for (int i = 0; i < localStreetAddress.length; i++) {

					if (localStreetAddress[i] != null) {
						elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "streetAddress"));
						elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localStreetAddress[i]));
					} else {

						// have to do nothing

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("streetAddress cannot be null!!");

			}

		}
		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "pOBoxNumber"));

		elementList.add(localPOBoxNumber == null ? null
				: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPOBoxNumber));

		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "subDivision"));

		elementList.add(localSubDivision == null ? null
				: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubDivision));

		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "postalCode"));

		elementList.add(localPostalCode == null ? null
				: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostalCode));

		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "city"));

		elementList.add(
				localCity == null ? null : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCity));

		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "countryISOCode"));

		elementList.add(localCountryISOCode == null ? null
				: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountryISOCode));
		if (localContactTracker) {
			if (localContact != null) {
				for (int i = 0; i < localContact.length; i++) {

					if (localContact[i] != null) {
						elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "contact"));
						elementList.add(localContact[i]);
					} else {

						// nothing to do

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("contact cannot be null!!");

			}

		}
		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "partyRole"));

		elementList.add(localPartyRole == null ? null : localPartyRole);

		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "partyContainment"));

		elementList.add(localPartyContainment == null ? null : localPartyContainment);

		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
				attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an
		 * element, it is a complex type and the reader is at the event just
		 * after the outer start element Postcondition: If this object is an
		 * element, the reader is positioned at its end element If this object
		 * is a complex type, the reader is positioned at the end element of its
		 * outer element
		 */
		public static PartyDataLineType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			PartyDataLineType object = new PartyDataLineType();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader
							.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
					if (fullTypeName != null) {
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

						if (!"partyDataLineType".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (PartyDataLineType) vn.org.gs1.gepir.request.ExtensionMapper.getTypeObject(nsUri,
									type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				java.util.ArrayList list6 = new java.util.ArrayList();

				java.util.ArrayList list8 = new java.util.ArrayList();

				java.util.ArrayList list14 = new java.util.ArrayList();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "gln")
						.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setGln(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "returnCode")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setReturnCode(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "informationProviderGln")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setInformationProviderGln(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "lastChangeDateTime")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setLastChangeDateTime(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "gcp")
						.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setGcp(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "additionalPartyId")
								.equals(reader.getName())) {

					// Process the array and step past its final element's end.
					list6.add(reader.getElementText());

					// loop until we find a start element that is not part of
					// this array
					boolean loopDone6 = false;
					while (!loopDone6) {
						// Ensure we are at the EndElement
						while (!reader.isEndElement()) {
							reader.next();
						}
						// Step out of this element
						reader.next();
						// Step to next element event.
						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();
						if (reader.isEndElement()) {
							// two continuous end elements means we are exiting
							// the xml structure
							loopDone6 = true;
						} else {
							if (new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "additionalPartyId")
									.equals(reader.getName())) {
								list6.add(reader.getElementText());

							} else {
								loopDone6 = true;
							}
						}
					}
					// call the converter utility to convert and set the array

					object.setAdditionalPartyId((java.lang.String[]) list6.toArray(new java.lang.String[list6.size()]));

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "partyName")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setPartyName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "streetAddress")
								.equals(reader.getName())) {

					// Process the array and step past its final element's end.
					list8.add(reader.getElementText());

					// loop until we find a start element that is not part of
					// this array
					boolean loopDone8 = false;
					while (!loopDone8) {
						// Ensure we are at the EndElement
						while (!reader.isEndElement()) {
							reader.next();
						}
						// Step out of this element
						reader.next();
						// Step to next element event.
						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();
						if (reader.isEndElement()) {
							// two continuous end elements means we are exiting
							// the xml structure
							loopDone8 = true;
						} else {
							if (new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "streetAddress")
									.equals(reader.getName())) {
								list8.add(reader.getElementText());

							} else {
								loopDone8 = true;
							}
						}
					}
					// call the converter utility to convert and set the array

					object.setStreetAddress((java.lang.String[]) list8.toArray(new java.lang.String[list8.size()]));

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "pOBoxNumber")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setPOBoxNumber(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "subDivision")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setSubDivision(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "postalCode")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setPostalCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "city")
						.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setCity(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "countryISOCode")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setCountryISOCode(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "contact")
						.equals(reader.getName())) {

					// Process the array and step past its final element's end.
					list14.add(vn.org.gs1.gepir.www.PartyContactType.Factory.parse(reader));

					// loop until we find a start element that is not part of
					// this array
					boolean loopDone14 = false;
					while (!loopDone14) {
						// We should be at the end element, but make sure
						while (!reader.isEndElement())
							reader.next();
						// Step out of this element
						reader.next();
						// Step to next element event.
						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();
						if (reader.isEndElement()) {
							// two continuous end elements means we are exiting
							// the xml structure
							loopDone14 = true;
						} else {
							if (new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "contact")
									.equals(reader.getName())) {
								list14.add(vn.org.gs1.gepir.www.PartyContactType.Factory.parse(reader));

							} else {
								loopDone14 = true;
							}
						}
					}
					// call the converter utility to convert and set the array

					object.setContact(
							(vn.org.gs1.gepir.www.PartyContactType[]) org.apache.axis2.databinding.utils.ConverterUtil
									.convertToArray(vn.org.gs1.gepir.www.PartyContactType.class, list14));

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "partyRole")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setPartyRole(null);
						reader.next();

						reader.next();

					} else {

						object.setPartyRole(vn.org.gs1.gepir.www.PartyRoleListType.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "partyContainment")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setPartyContainment(null);
						reader.next();

						reader.next();

					} else {

						object.setPartyContainment(vn.org.gs1.gepir.www.ArrayOfPartyChildType.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing
					// invalid property
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
