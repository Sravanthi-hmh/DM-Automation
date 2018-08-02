package com.hmhco.datamanager.config;


import com.hmhco.datamanager.utility.PropertiesUtil;

/**
 * Created by vadlamudis on 7/11/18.
 */
public final class EnvironmentConfiguration {

    private static PropertiesUtil propertiesUtil = new PropertiesUtil("environment.properties");

  private EnvironmentConfiguration() {

    }

    public static String getValue(final String key) {
        return propertiesUtil.getValue(key);
    }
}
