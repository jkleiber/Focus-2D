package com.justinkleiber.motor.controllers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.justinkleiber.motor.base.Storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

/**
 * Manages File I/O
 * @author Justin
 *
 */
public class FileManager implements Storage{
	
	Context context;
	SharedPreferences prefs;
	Editor editor;
	
	/**
	 * Initializes a FileManager Object
	 * @param c Context of the Android Application
	 */
	
	public FileManager(Context c)
	{
		this.context=c;
		prefs = PreferenceManager.getDefaultSharedPreferences(context);
		editor = prefs.edit();
	}
	
	
	@Override
	public void save(String file, String value) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fos = context.openFileOutput(file, Context.MODE_PRIVATE);
			fos.write(value.getBytes());
			fos.close();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

	
	@Override
	public ArrayList<String> loadToArray(String file) {
		// TODO Auto-generated method stub
		try
	    {
			FileInputStream fis = context.openFileInput(file);
	        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
	        String line = null;
	        ArrayList<String> input = new ArrayList<String>();
	        while ((line = reader.readLine()) != null)
	        {
	            input.add(line);
	        }
	        reader.close();
	       
	        //toast("File successfully loaded.");
	        return input;
	    }
	    catch (Exception ex)
	    {
	        //toast("Error loading file: " + ex.getLocalizedMessage());
	        return null;
	    }
	}

	
	@Override
	public String loadToString(String file) {
		// TODO Auto-generated method stub
		
		try
	    {
	        FileInputStream fis = context.openFileInput(file);
	        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
	        String line = null, input="";
	        while ((line = reader.readLine()) != null)
	            input += line;
	        reader.close();
	        fis.close();
	        //toast("File successfully loaded.");
	        return input;
	    }
	    catch (Exception ex)
	    {
	        //toast("Error loading file: " + ex.getLocalizedMessage());
	        return "";
	    }
		
		
	}

	
	@Override
	public void setPref(String key, String str) {
		// TODO Auto-generated method stub
		editor.putString(key, str);
		editor.commit();
	}
	
	@Override
	public void setPref(String key, int i) {
		// TODO Auto-generated method stub
		editor.putInt(key, i);
		editor.commit();
	}
	
	@Override
	public void setPref(String key, boolean b) {
		// TODO Auto-generated method stub
		editor.putBoolean(key, b);
		editor.commit();
	}

	@Override
	public void setFloatPref(String key, float f) {
		editor.putFloat(key, f);
	}

	/**
	 * Returns a String from a Shared Preference
	 * @param key Unique Key used to get Shared Preference
	 * @param def Default value if the specified Shared Preference does not exist
	 * @return Value of the Shared Preference
	 */
	@Override
	public String getStringPref(String key, String def) {
		// TODO Auto-generated method stub
		String str;
		str = prefs.getString(key, def);
		return str;
	}

	/**
	 * Returns an int from a Shared Preference
	 * @param key Unique Key used to get Shared Preference
	 * @param def Default value if the specified Shared Preference does not exist
	 * @return Value of the Shared Preference
	 */
	@Override
	public int getIntPref(String key, int def) {
		// TODO Auto-generated method stub
		int i;
		i = prefs.getInt(key, def);
		return i;
	}

	/**
	 * Returns a boolean from a Shared Preference
	 * @param key Unique Key used to get Shared Preference
	 * @param def Default value if the specified Shared Preference does not exist
	 * @return Value of the Shared Preference
	 */
	@Override
	public boolean getBoolPref(String key, boolean def) {
		// TODO Auto-generated method stub
		boolean bool;
		bool = prefs.getBoolean(key, def);
		return bool;
	}

	/**
	 * Returns a float from a Shared Preference
	 * @param key Unique Key used to get Shared Preference
	 * @param def Default value if the specified Shared Preference does not exist
	 * @return Value of the Shared Preference
	 */
	@Override
	public float getFloatPref(String key, float def) {
		float f;
		f=prefs.getFloat(key, def);
		return f;
	}

	/**
	 * Checks to see if a specified file path exists
	 * @param file the path to check
	 * @return Whether the file exists or not
	 */
	@Override
	public boolean isExist(String file) {
		// TODO Auto-generated method stub
		try
	    {
	        FileInputStream fis = context.openFileInput(file);
	        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
	        String line = null, input="";
	        while ((line = reader.readLine()) != null)
	            input += line;
	        reader.close();
	        fis.close();
	        //toast("File successfully loaded.");
	        return true;
	    }
	    catch (Exception ex)
	    {
	        //toast("Error loading file: " + ex.getLocalizedMessage());
	        return false;
	    }
	}
	
	/**
	 * Saves an ArrayList<String> in a text file. Each element is saved on a new line.
	 * @param file The path of the text file
	 * @param value The ArrayList to be saved
	 */
	@Override
	public void save(String file, ArrayList<String> value) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fos = context.openFileOutput(file, Context.MODE_PRIVATE);
			String newline = System.getProperty("line.separator");
			for(String str : value)
			{
				fos.write(str.getBytes());
				fos.write(newline.getBytes());
			}
			
			fos.close();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

	

}
