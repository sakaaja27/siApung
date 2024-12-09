/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package global;

import java.util.prefs.Preferences;

/**
 *
 * @author Hidayah Arif
 */
public class GlobalPreferences {

    private static final Preferences prefs = Preferences.userRoot().node("GlobalData");

    public static void setUsername(String username) {
        prefs.put("username", username);
    }

    public static String getUsername() {
        return prefs.get("username", "DefaultUsername");
    }
    public static void setPassword(String password) {
        prefs.put("password", password);
    }

    public static String getPassword() {
        return prefs.get("password", "DefaultPassword");
    }
}
