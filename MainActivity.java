package com.example.simpleadapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView lv = (ListView) findViewById(R.id.lv);
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		
		Map<String,String> map1 = new HashMap<String, String>();
		map1.put("name", "chenhai");
		map1.put("phone", "13884576987");
		
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("name", "wangcheng");
		map2.put("phone", "18221339272");
		
		Map<String,String> map3 = new HashMap<String, String>();
		map3.put("name", "hehuafeng");
		map3.put("phone", "13258647854");
		
		Map<String,String> map4 = new HashMap<String, String>();
		map4.put("name", "wangliangwen");
		map4.put("phone", "13166185977");
		
		data.add(map1);
		data.add(map2);
		data.add(map3);
		data.add(map4);
		
		SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.item, new String[]{"name","phone"}, new int[]{R.id.textView1,R.id.textView2});
		
		lv.setAdapter(adapter);
	}

	
}
