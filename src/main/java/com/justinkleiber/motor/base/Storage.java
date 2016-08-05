package com.justinkleiber.motor.base;

import java.util.ArrayList;

/**
 * Defines the File I/O functions
 * @author Justin
 *
 */
public interface Storage {

	/**
	 * Saves a value to a file
	 * 
	 * @param file The location of the file that you want to save to
	 * @param value The String that you want to save in the specified file
	 */
	public void save(String file, String value);
	
	/**
	 * Returns the contents of a file as an ArrayList<String> assuming each line is its own element
	 * @param file The file to get the ArrayList from.
	 * @return The ArrayList with the file data
	 */
	public void save(String file, ArrayList<String> value);
	
	/**
	 * Returns a text file's contents as a String
	 * @param file The location of the file to get contents from
	 * @return String containing all the text file's data
	 */
	public ArrayList<String> loadToArray(String file);
	
	/**
	 * Loads a text file into a String
	 * @param file Location of the text file
	 * @return The String that contains the text file's data
	 */
	public String loadToString(String file);
	
	/**
	 * Sets a String as a Shared Preference
	 * @param key Unique Key used for Shared Preference
	 * @param str Value to store in Shared Preference
	 */
	public void setPref(String key, String str);
	/**
	 * Sets an int as a Shared Preference
	 * @param key Unique Key used for Shared Preference
	 * @param i Value to store in Shared Preference
	 */
	public void setPref(String key, int i);
	
	/**
	 * Sets a boolean as a Shared Preference
	 * @param key Unique Key used for Shared Preference
	 * @param b Value to store in Shared Preference
	 */
	public void setPref(String key, boolean b);
	
	/**
	 * Sets a float as a Shared Preference
	 * @param key Unique Key for Shared Preference
	 * @param f Value to store in Shared Preference 
	 */
	public void setFloatPref(String key, float f);
	
	/**
	 * Returns a String stored in a Shared Preference
	 * @param key Unique key for Shared Preference
	 * @param def The default value to return if no such Shared Preference exists
	 * @return The value of the Shared Preference, or the default if no such Preference exists
	 */
	public String getStringPref(String key, String def);
	/**
	 * Returns an int stored in a Shared Preference
	 * @param key Unique key for Shared Preference
	 * @param def The default value to return if no such Shared Preference exists
	 * @return The value of the Shared Preference, or the default if no such Preference exists
	 */
	public int getIntPref(String key, int def);
	/**
	 * Returns a boolean stored in a Shared Preference
	 * @param key Unique key for Shared Preference
	 * @param def The default value to return if no such Shared Preference exists
	 * @return The value of the Shared Preference, or the default if no such Preference exists
	 */
	public boolean getBoolPref(String key, boolean def);
	/**
	 * Returns a float stored in a Shared Preference
	 * @param key Unique key for Shared Preference
	 * @param def The default value to return if no such Shared Preference exists
	 * @return The value of the Shared Preference, or the default if no such Preference exists
	 */
	public float getFloatPref(String key, float def);
	
	/**
	 * Returns if a specified file exists or not
	 * @param file the file to check for existence
	 * @return true if the file exists, false if it does not
	 */
	public boolean isExist(String file);
}
