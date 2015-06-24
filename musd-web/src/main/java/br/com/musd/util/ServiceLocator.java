package br.com.musd.util;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by gilson on 26/01/15.
 */
public class ServiceLocator {

    private static InitialContext initialContext;

    static {
        try {
            initialContext = new InitialContext();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T getService(Class<T> clazz) throws NamingException {
        String serviceName = String.format("java:module/%s!%s", clazz.getSimpleName(), clazz.getCanonicalName());
        return (T) initialContext.lookup(serviceName);
    }
}
