package com.nkia.collect.service;

import com.mongodb.client.FindIterable;
import org.bson.Document;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Map;

public interface SearchService {


    public JSONArray getLineData(Map<String, String> searchKeys);

}