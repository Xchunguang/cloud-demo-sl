package com.mysoft.constroller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mysoft.dto.HomeModel;
import com.mysoft.dto.MapDto;
import com.mysoft.dto.MapModel;
import com.mysoft.module.Resultentrythree;
import com.mysoft.repository.ResultentrythreeRepository;
import com.mysoft.service.IndexService;

@RestController
public class IndexController {

	@Autowired
	IndexService indexService;
	@Autowired
	ResultentrythreeRepository resultentrythreeRepository;	
	@GetMapping("/getInfo/{province}")
	public HomeModel getInfo(@PathVariable String province){
		HomeModel hm = new HomeModel();
		Map<String,Integer> map1 = indexService.getMechineType(province);
		hm.setKongtiaoNum(map1.get("kongtiaoNum"));
		hm.setGuoluNum(map1.get("guoluNum"));
		
		Map<String,Integer> map2 =  indexService.getMechineState(province);
		hm.setSbw(map2.get("sbw"));
		hm.setYys(map2.get("yys"));
		hm.setJfz(map2.get("jfz"));
		
		Integer[] jiaofuArr =  indexService.getJiaofu(province);
		hm.setJiaofuArr(jiaofuArr);
		
		
		Map<String,Integer[]> map3 =  indexService.getMechineBack(province);
		hm.setResultN(map3.get("resultN"));
		hm.setResultW(map3.get("resultW"));
		
		
		Map<String,Integer[]> map4 = indexService.getMechineRepire(province);
		hm.setMechineRepire(map4.get("result"));

		
		return hm;
	}
	
	
	@GetMapping("/getGuoluAndKongtiao/{province}")
	public MapModel getGuolu(@PathVariable String province){
		if(!province.equals("home")){
			province = province.substring(0, 2);
		}
		List<MapDto> list1 = indexService.getGuoluData(province);
		List<MapDto> list2 = indexService.getKongtiaoData(province);
		MapModel mm = new MapModel();
		mm.setGuolu(list1);
		mm.setKongtiao(list2);
		return mm;
	}
	
	@GetMapping("/getMechine/{sbbh}")
	public Resultentrythree getMechine(@PathVariable String sbbh){
		List<Resultentrythree> list = resultentrythreeRepository.findBySbbh(sbbh);
		if(list.size() == 0){
			Resultentrythree error = new Resultentrythree();
			error.setResultentry3id(-1);
			return error;
		}
		Resultentrythree r = list.get(0);
		return r;
	}
	
	

	
}
