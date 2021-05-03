package main.data.database;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;


import org.w3c.dom.Node;
import org.w3c.dom.Element;

class DatabaseSetting {
	public static iDatabaseSettingData LoadFile() {
		try{
			File inputFile = new File("DatabaseSetting.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("Database");

			return getData(nList);
			
		} catch (Exception e) {
			e.printStackTrace();
			return new DatabaseSettingData();
		}

	}

	private static iDatabaseSettingData getData(NodeList data){
		Node nNode = data.item(0);

		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			Element eElement = (Element) nNode;

			String IP = eElement.getElementsByTagName("IP").item(0).getTextContent();
			String Port = eElement.getElementsByTagName("Port").item(0).getTextContent();
			String Username = eElement.getElementsByTagName("Username").item(0).getTextContent();
			String Password = eElement.getElementsByTagName("Password").item(0).getTextContent();
			String DatabaseName = eElement.getElementsByTagName("DatabaseName").item(0).getTextContent();
			boolean IntegratedSecurity = eElement.getElementsByTagName("IntegratedSecurity").item(0).getTextContent().toLowerCase().equalsIgnoreCase("true");

			return new DatabaseSettingData(IP, Port, Username, Password, DatabaseName, IntegratedSecurity);
		} else {
			return new DatabaseSettingData();
		}
	}
}
