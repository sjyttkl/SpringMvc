package com.sjyttkl.springmvc.demo.web;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/tags")
public class TagsController
{

	@RequestMapping(value = "/test")
	public String test(Model model)
	{

		if (!model.containsAttribute("contentModel"))
		{

			TagsModel tagsModel = new TagsModel();

			tagsModel.setUsername("aaa");
			tagsModel.setPassword("bbb");
			tagsModel.setTestBoolean(true);
			tagsModel.setSelectArray(new String[]
			{ "arrayItem ·�˼�" });
			tagsModel.setTestArray(new String[]
			{ "arrayItem ·�˼�", "arrayItem ·����", "arrayItem ·�˱�" });
			tagsModel.setRadiobuttonId(1);
			tagsModel.setSelectId(2);
			tagsModel.setSelectIds(Arrays.asList(1, 2));
			Map<Integer, String> map = new HashMap<Integer, String>();
			map.put(1, "mapItem ·�˼�");
			map.put(2, "mapItem ·����");
			map.put(3, "mapItem ·�˱�");
			tagsModel.setTestMap(map);
			tagsModel.setRemark("��ע...");

			model.addAttribute("contentModel", tagsModel);
			System.out.println(tagsModel);
		}
		return "tagstest";
	}

}