package org.apache.session;

import java.util.HashMap;
import java.util.Map;

public class SessionManager {

    private static final Map<String, Session> SESSIONS = new HashMap<>();

    private SessionManager() {
    }

    public static void add(Session session) {
        SESSIONS.put(session.getId(), session);
    }

    public static Session findSession(String id) {
        return SESSIONS.get(id);
    }

    public static void remove(String id) {
        SESSIONS.remove(id);
    }
}
