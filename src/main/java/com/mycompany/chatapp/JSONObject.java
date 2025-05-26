/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

import java.util.HashMap;
import java.util.Map;

/**
 *This files has been created due to the fact that my Netbeans could not load or have library for Json Applications
 * @author eugen
 */
class JSONObject {
    // Internal Map to hold key-value pairs of JSON data
    private final Map<String, String> data;

    /**
     * Constructor initializes the internal data map.
     */
    public JSONObject() {
        data = new HashMap<>();
    }

    /**
     * Adds a key-value pair to the JSON object.
     * @param key The JSON key as a String
     * @param value The JSON value as a String
     */
    public void put(String key, String value) {
        data.put(key, value);
    }

    /**
     * Converts the JSONObject to a formatted JSON string representation.
     * Overrides the default toString method.
     * @return A nicely formatted JSON string.
     */
    @Override
    public String toString() {
        StringBuilder json = new StringBuilder("{\n");  // Start JSON object
        for (Map.Entry<String, String> entry : data.entrySet()) {
            // Append each key-value pair with indentation and quotes
            json.append("  \"").append(entry.getKey()).append("\": \"")
                .append(entry.getValue()).append("\",\n");
        }
        // Remove the last comma and newline to produce valid JSON syntax
        if (!data.isEmpty()) {
            json.setLength(json.length() - 2);
            json.append("\n");
        }
        json.append("}");  // Close JSON object
        return json.toString();
    }

    /**
     * Converts the JSONObject to a JSON string.
     * This method duplicates toString but could be used explicitly where needed.
     * @return JSON string representation of the data.
     */
    String toJSONString() {
        StringBuilder json = new StringBuilder("{\n");
        for (Map.Entry<String, String> entry : data.entrySet()) {
            json.append("  \"").append(entry.getKey()).append("\": \"")
                .append(entry.getValue()).append("\",\n");
        }
        if (!data.isEmpty()) {
            json.setLength(json.length() - 2); // Remove trailing comma
            json.append("\n");
        }
        json.append("}");
        return json.toString();
    }
}

