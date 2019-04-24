package com.mobilegg.common;

import java.util.HashMap;
import java.util.Map;

public class ModuleManager {

    private ModuleManager() {
    }

    private static Map<Class, IModule> map = new HashMap<>();

    public static <T extends IModule> T get(Class<T> clz) {
        if (!clz.isInterface()) {
            throw new RuntimeException(String.format("clz %s should be a interface class", clz.getCanonicalName()));
        }

        return (T) map.get(clz);
    }

    public static <T extends IModule> void register(Class<T> clz, T impl) {
        if (clz == null || impl == null) {
            return;
        }

        if (map.containsKey(clz)) {
            return;
        }

        map.put(clz, impl);
    }

    public static void unRegister(Class clz) {
        if (clz == null) {
            return;
        }

        map.remove(clz);
    }

}
