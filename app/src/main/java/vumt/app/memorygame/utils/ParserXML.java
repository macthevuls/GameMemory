package vumt.app.memorygame.utils;

import android.util.Log;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import vumt.app.memorygame.bean.UserObject;

public class ParserXML {

    public String getXml(String url) {
        String xmlData = null;
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(url)
                    .build();
            Response responses = null;

            try {
                responses = client.newCall(request).execute();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                xmlData = responses.body().string().toString();
            } catch (Exception e) {
                Log.d("Exception", e.toString());
            }
        } catch (Exception e) {
            Log.d("Exception", e.toString());
        }
        return xmlData;
    }

    public ArrayList<UserObject> getListUser(String xml) {
        ArrayList<UserObject> listUsers = new ArrayList<UserObject>();
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser sp = spf.newSAXParser();
            XMLReader xr = sp.getXMLReader();

            UserHandle handle = new UserHandle();
            xr.setContentHandler(handle);
            InputSource inStream = new InputSource();
            inStream.setCharacterStream(new StringReader(xml));

            xr.parse(inStream);
            listUsers = handle.getNewsList();
        } catch (Exception e) {
            Log.d("ParseXML exception", e.toString());
        }
        return listUsers;
    }
}
