package org.ekstep.ep.samza.domain;

import org.ekstep.ep.samza.logger.Logger;

import java.util.Map;

public class Event {
    static Logger LOGGER = new Logger(Event.class);
    public Map<String, Object> map;

    public Event(Map<String, Object> map) {
        this.map = map;
    }

    public Map<String, Object> getMap() {
        return this.map;
    }

    public String id() {
        return getMap() != null && getMap().containsKey("metadata") &&
                (((Map<String, Object>) getMap().get("metadata")).containsKey("checksum"))
                ? (String) ((Map<String, Object>) getMap().get("metadata")).get("checksum")
                : null;
    }
}