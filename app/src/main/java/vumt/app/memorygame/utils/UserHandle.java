package vumt.app.memorygame.utils;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

import vumt.app.memorygame.bean.UserObject;

/**
 * Created by Mac The Vu on 3/10/2017.
 */

public class UserHandle extends DefaultHandler {
    Boolean currentElement = false;
    String currentValue = "";
    UserObject obj = null;
    private ArrayList<UserObject> listUsers = new ArrayList<UserObject>();

    public ArrayList<UserObject> getNewsList() {
        return this.listUsers;
    }

    // Called to get tag characters
    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        if (currentElement)
            currentValue = currentValue + new String(ch, start, length);
    }

    // Called when tag closing
    @Override
    public void endElement(String namespaceURI, String localName, String qName)
            throws SAXException {
        currentElement = false;
        // set values for channel
        if (localName.equalsIgnoreCase(GlobalVars.ID_TAG))
            obj.setIdUser(currentValue);
        else if (localName.equalsIgnoreCase(GlobalVars.USERNAME_TAG))
            obj.setUserName(currentValue);
        else if (localName.equalsIgnoreCase(GlobalVars.HIGHTSCORE_TAG))
            obj.setHightScore(Integer.parseInt(currentValue));
        else if (localName.equalsIgnoreCase(GlobalVars.ITEM_TAG))
            listUsers.add(obj);
    }

    // Called when tag starts
    @Override
    public void startElement(String namespaceURI, String localName,
                             String qName, Attributes atts) throws SAXException {
        currentElement = true;
        currentValue = "";
        if (localName.equals(GlobalVars.ITEM_TAG))
            obj = new UserObject();
    }
}
