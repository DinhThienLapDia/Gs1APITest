
package vn.org.gs1.gepir.www;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Calendar;

import vn.org.gs1.gepir.load.*;
import vn.gpay.conf.CryptHelper;

import org.apache.axis2.databinding.types.*;

/**
 * RouterSkeleton java skeleton for the axisService
 */
public class Gs1VnAPISkeleton {

	private DBConnection db = new DBConnection();

	/**
	 * Auto generated method signature Obtains owner of a GLN
	 * 
	 * @param getOwnerOfGLN
	 * @return gepirParty
	 */

	public vn.org.gs1.gepir.www.GepirPartyE getOwnerOfGLN(vn.org.gs1.gepir.www.GetOwnerOfGLNE getOwnerOfGLN) {
		BigDecimal version = getOwnerOfGLN.getGetOwnerOfGLN().getVersion();
		String gln = getOwnerOfGLN.getGetOwnerOfGLN().getRequestedGln();
		System.out.println("received request gln: " + gln);

		ArrayOfLanguage requestedLanguages = getOwnerOfGLN.getGetOwnerOfGLN().getRequestedLanguages();
		Language[] requestedLanguageToArray = requestedLanguages.getLanguage();
		int numberOfLanguage = requestedLanguageToArray.length;

		Connection conn = db.getDBConnection();
		String SQL1 = "SELECT * FROM IDD.dbo.DD_COMPANY_GLN WHERE GLN =" + "'" + gln + "'";

		GepirParty gepirParty = new GepirParty();
		GepirPartyE gepirPartyE = new GepirPartyE();
		PartyDataLineType[] partyDataLineTypeArray = new PartyDataLineType[numberOfLanguage];

		for (int i = 0; i < numberOfLanguage; i++) {
			try {
				Statement stmt = conn.createStatement();
				Statement stmt2 = conn.createStatement();
				ResultSet rs = stmt.executeQuery(SQL1);
				String languageInString = requestedLanguageToArray[i].toString();
				while (rs.next()) {
					partyDataLineTypeArray[i] = new PartyDataLineType();

					String[] addressArray = new String[1];

					System.out.println(languageInString);
					if (languageInString.equals("vi")) {
						if (rs.getString("Address") != null) {

							addressArray[0] = CryptHelper.decrypt(rs.getString("Address"));
							partyDataLineTypeArray[i].setStreetAddress(addressArray);
							System.out.println(CryptHelper.decrypt(rs.getString("Address")));
						}
						if (rs.getString("Name") != null) {
							partyDataLineTypeArray[i].setPartyName(CryptHelper.decrypt(rs.getString("Name")));
							System.out.println(CryptHelper.decrypt(rs.getString("Name")));

						}
					}

					if (languageInString.equals("en")) {
						if (rs.getString("Address_E") != null) {
							addressArray[0] = CryptHelper.decrypt(rs.getString("Address_E"));
							partyDataLineTypeArray[i].setStreetAddress(addressArray);
							System.out.println(CryptHelper.decrypt(rs.getString("Address_E")));
						}
						if (rs.getString("Name_E") != null) {
							partyDataLineTypeArray[i].setPartyName(CryptHelper.decrypt(rs.getString("Name_E")));
							System.out.println(CryptHelper.decrypt(rs.getString("Name_E")));

						}
					}

					partyDataLineTypeArray[i].setReturnCode(new NonNegativeInteger("0"));
					partyDataLineTypeArray[i].setGln(gln);
					partyDataLineTypeArray[i].setGcp(gln.substring(0, 7));

					ResultSet rs2 = stmt2.executeQuery("SELECT * FROM IDD.dbo.DS_PROVINCE_CODE WHERE ProvinceID = " + "'"
							+ rs.getString("ProvinceID") + "'");
					while (rs2.next()) {
						if (languageInString.equals("vi")) {
							if (rs2.getString("ProvinceName") != null) {
								partyDataLineTypeArray[i].setCity(rs2.getString("ProvinceName"));
							}
						}

						if (languageInString.equals("en")) {
							if (rs2.getString("ProvinceNameE") != null) {
								partyDataLineTypeArray[i].setCity(rs2.getString("ProvinceNameE"));
							}
						}
					}
					Calendar lastChangeDateTime = Calendar.getInstance();
					if (rs.getDate("lastUpdated_Date") != null) {
						lastChangeDateTime.setTime(rs.getDate("lastUpdated_Date"));
					}

					partyDataLineTypeArray[i].setLastChangeDateTime(lastChangeDateTime);
					partyDataLineTypeArray[i].setInformationProviderGln(null);
					partyDataLineTypeArray[i].setCountryISOCode(null);
					partyDataLineTypeArray[i].setPartyContainment(null);
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}

		gepirParty.setPartyDataLine(partyDataLineTypeArray);
		gepirParty.setVersion(version);
		gepirPartyE.setGepirParty(gepirParty);
		return gepirPartyE;
	}

	/**
	 * Auto generated method signature Obtains Item information based on a GTIN
	 * 
	 * @param getItemByGTIN
	 * @return gepirItem
	 */

	public vn.org.gs1.gepir.www.GepirItemE getItemByGTIN(vn.org.gs1.gepir.www.GetItemByGTINE getItemByGTIN) {
		String requestedGtin = getItemByGTIN.getGetItemByGTIN().getRequestedGtin();

		ArrayOfLanguage requestedLanguages = getItemByGTIN.getGetItemByGTIN().getRequestedLanguages();
		Connection conn = db.getDBConnection();
		String SQL1 = "SELECT * FROM IDD.dbo.DD_ITEM WHERE GTIN =" + "'" + requestedGtin + "'";
		GepirItemE gepirItemE = new GepirItemE();
		GepirItem gepirItem = new GepirItem();

		Language[] requestedLanguageToArray = requestedLanguages.getLanguage();
		System.out.print(requestedLanguageToArray.length);

		int numberOfLanguage = requestedLanguageToArray.length;

		ItemDataLineType[] itemDataLineTypeArray = new ItemDataLineType[numberOfLanguage];

		Statement[] stmt = new Statement[numberOfLanguage];
		ResultSet[] rs = new ResultSet[numberOfLanguage];
		for (int i = 0; i < numberOfLanguage; i++) {
			try {
				stmt[i] = conn.createStatement();
				rs[i] = stmt[i].executeQuery(SQL1);
				while (rs[i].next()) {
					itemDataLineTypeArray[i] = new ItemDataLineType();
					if (rs[i].getString("Product_Name_V") != null) {
						itemDataLineTypeArray[i].setItemName(rs[i].getString("Product_Name_V"));
						System.out.println("Ten San Pham: " + rs[i].getString("Product_Name_V"));
					} else {
						itemDataLineTypeArray[i].setItemName("");
						System.out.println("Ten San Pham: null");
					}
					itemDataLineTypeArray[i].setGtin(requestedGtin);
					if (rs[i].getString("Provider_GLN") != null) {
						itemDataLineTypeArray[i].setInformationProviderGln(rs[i].getString("Provider_GLN"));
					} else {
						itemDataLineTypeArray[i].setInformationProviderGln("");
					}
					itemDataLineTypeArray[i].setLang(requestedLanguages.getLanguage()[i]);

					Calendar lastChangeDateTime = Calendar.getInstance();
					if (rs[i].getDate("lastUpdated_Date") != null) {
						lastChangeDateTime.setTime(rs[i].getDate("lastUpdated_Date"));
						itemDataLineTypeArray[i].setLastChangeDateTime(lastChangeDateTime);
					} else {
						lastChangeDateTime.setTime(null);
						itemDataLineTypeArray[i].setLastChangeDateTime(lastChangeDateTime);
					}

					itemDataLineTypeArray[i].setBrandName(rs[i].getString("Brand_Name_V"));
					if (rs[i].getString("Product_URL") != null) {
						URI linkURI = new URI(rs[i].getString("Product_URL"));
						ItemDataLineTypeLinkUri itemDataLineTypeLinkUri = new ItemDataLineTypeLinkUri();
						itemDataLineTypeLinkUri.setAnyURI(linkURI);
						itemDataLineTypeLinkUri.setFormat(ItemDataLineTypeLinkUriFormat.html);
						ItemDataLineTypeLinkUri[] itemDataLineTypeLinkUriArray = new ItemDataLineTypeLinkUri[1];
						itemDataLineTypeLinkUriArray[0] = itemDataLineTypeLinkUri;
						itemDataLineTypeArray[i].setLinkUri(itemDataLineTypeLinkUriArray);
					}
					System.out.println("Product URL:" + rs[i].getString("Product_URL"));

					itemDataLineTypeArray[i]
							.setTradeItemUnitDescriptor(ItemDataLineTypeTradeItemUnitDescriptor.BASE_UNIT_OR_EACH);

				}

			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				System.out.println(e.getMessage());
				System.exit(0);
			}

		}
		db.closeDB(conn);
		gepirItem.setItemDataLine(itemDataLineTypeArray);
		gepirItemE.setGepirItem(gepirItem);
		return gepirItemE;

	}

	/**
	 * Auto generated method signature Gepir Server Swiss for client version 2
	 * 
	 * @param gepirVersion2Request
	 * @return gepirVersion2Response
	 */

	public vn.org.gs1.gepir.response.GepirVersion2Response gepirVersion2(
			vn.org.gs1.gepir.request.GepirVersion2Request gepirVersion2Request) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#gepirVersion2");
	}

	/**
	 * Auto generated method signature Obtains the Party info of a GLN
	 * 
	 * @param getPartyByGLN
	 * @return gepirParty2
	 */

	public vn.org.gs1.gepir.www.GepirPartyE getPartyByGLN(vn.org.gs1.gepir.www.GetPartyByGLNE getPartyByGLN) {
		BigDecimal version = getPartyByGLN.getGetPartyByGLN().getVersion();
		String[] gln = getPartyByGLN.getGetPartyByGLN().getRequestedGln();
		int numberOfGLN = gln.length;

		ArrayOfLanguage requestedLanguage = getPartyByGLN.getGetPartyByGLN().getRequestedLanguages();
		Language[] requestedLanguageToArray = requestedLanguage.getLanguage();
		int numberOfLanguage = requestedLanguageToArray.length;

		Connection conn = db.getDBConnection();

		GepirParty gepirParty = new GepirParty();
		GepirPartyE gepirPartyE = new GepirPartyE();
		PartyDataLineType[] partyDataLineTypeArray = new PartyDataLineType[numberOfLanguage];
		for (int i1 = 0; i1 < numberOfGLN; i1++) {
			System.out.println("received request gln:" + gln[i1]);
			String SQL1 = "SELECT * FROM IDD.dbo.DD_COMPANY_GLN WHERE GLN =" + "'" + gln[i1] + "'";
			for (int i = 0; i < numberOfLanguage; i++) {
				try {
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(SQL1);
					while (rs.next()) {
						partyDataLineTypeArray[i] = new PartyDataLineType();
						partyDataLineTypeArray[i].setPartyName(CryptHelper.decrypt(rs.getString("Name")));
						System.out.println(CryptHelper.decrypt(rs.getString("Name")));
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					System.out.println(e.getMessage());
					System.exit(0);
				}
			}
		}
		gepirParty.setPartyDataLine(partyDataLineTypeArray);
		gepirParty.setVersion(version);
		gepirPartyE.setGepirParty(gepirParty);
		return gepirPartyE;
	}

	/**
	 * Auto generated method signature Get Gepir Authorization
	 * 
	 * @param getAuthorization
	 * @return gepirAuthorization
	 */

	public vn.org.gs1.gepir.www.GepirAuthorizationE getAuthorization(
			vn.org.gs1.gepir.www.GetAuthorizationE getAuthorization) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getAuthorization");
	}

	/**
	 * Auto generated method signature Obtains the Party info by name
	 * 
	 * @param getPartyByName
	 * @return gepirParty5
	 */

	public vn.org.gs1.gepir.www.GepirPartyE getPartyByName(vn.org.gs1.gepir.www.GetPartyByNameE getPartyByName) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getPartyByName");
	}

	/**
	 * Auto generated method signature SetAuthorize
	 * 
	 * @param sessionAuthorize
	 * @return sessionAuthorizeResponse
	 */

	public vn.org.gs1.gepir.www.SessionAuthorizeResponse sessionAuthorize(
			vn.org.gs1.gepir.www.SessionAuthorize sessionAuthorize) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#sessionAuthorize");
	}

	/**
	 * Auto generated method signature Obtains GLN based on a GTIN
	 * 
	 * @param getPartyByGTIN
	 * @return gepirParty7
	 */

	public vn.org.gs1.gepir.www.GepirPartyE getPartyByGTIN(vn.org.gs1.gepir.www.GetPartyByGTINE getPartyByGTIN) {
		Connection conn = db.getDBConnection();
		BigDecimal version = getPartyByGTIN.getGetPartyByGTIN().getVersion();

		String[] requestedGTIN = getPartyByGTIN.getGetPartyByGTIN().getRequestedGtin();
		ArrayOfLanguage requestedLanguage = getPartyByGTIN.getGetPartyByGTIN().getRequestedLanguages();

		int numberOfGTIN = requestedGTIN.length;
		int numberOfLanguage = requestedLanguage.getLanguage().length;

		GepirParty gepirParty = new GepirParty();
		GepirPartyE gepirPartyE = new GepirPartyE();
		PartyDataLineType[] partyDataLineTypeArray = new PartyDataLineType[numberOfLanguage];

		for (int i = 0; i < numberOfGTIN; i++) {
			String SQL1 = "SELECT * FROM IDD.dbo.DD_ITEM WHERE GTIN =" + "'" + requestedGTIN[i] + "'";
			for (int i2 = 0; i < numberOfLanguage; i++) {
				try {
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(SQL1);
					while (rs.next()) {
						partyDataLineTypeArray[i2] = new PartyDataLineType();
						partyDataLineTypeArray[i2].setPartyName(rs.getString("Brand_Name_V"));
						System.out.println("Tee: " + rs.getString("Brand_Name_V"));
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					System.out.println(e.getMessage());
					System.exit(0);
				}
			}
		}

		gepirParty.setVersion(version);
		gepirParty.setPartyDataLine(partyDataLineTypeArray);
		gepirPartyE.setGepirParty(gepirParty);
		return gepirPartyE;
	}

	/**
	 * Auto generated method signature Obtains GLN based on a SSCC
	 * 
	 * @param getPartyBySSCC
	 * @return gepirParty9
	 */

	public vn.org.gs1.gepir.www.GepirPartyE getPartyBySSCC(vn.org.gs1.gepir.www.GetPartyBySSCCE getPartyBySSCC) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getPartyBySSCC");
	}

	/**
	 * Auto generated method signature Get Gepir Statistics
	 * 
	 * @param getStatistics
	 * @return gepirStatistics
	 */

	public vn.org.gs1.gepir.www.GepirStatisticsE getStatistics(vn.org.gs1.gepir.www.GetStatisticsE getStatistics) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getStatistics");
	}

}
