package com.mysoft.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysoft.dto.MapDto;
import com.mysoft.module.Allmechine;
import com.mysoft.repository.AllMechineRepository;
import com.mysoft.repository.ResultentryoneRepository;
import com.mysoft.repository.ResultentrythreeRepository;
import com.mysoft.repository.ResultentrytwoRepository;

@Component
public class IndexService {

	@Autowired
	ResultentrythreeRepository resultentrythreeRepository;
	@Autowired
	ResultentrytwoRepository resultentrytwoRepository;
	@Autowired
	ResultentryoneRepository resultentryoneRepository;
	@Autowired
	AllMechineRepository allMechineRepository;
	
	public Map<String,Integer> getMechineType(String province){
		Map<String,Integer> map = new HashMap<>();
		if(province.equals("home")){
			map.put("kongtiaoNum", 14715);
			map.put("guoluNum", 5841);
		}else{
			int kongtiaoNum = resultentrythreeRepository.getMechineType("1001", province);
			int guoluNum = resultentrythreeRepository.getMechineType("1002", province);
			map.put("kongtiaoNum", kongtiaoNum);
			map.put("guoluNum", guoluNum);
		}
		
		return map;
	} 
	
	
	public Map<String,Integer> getMechineState(String province){
		Map<String,Integer> map = new HashMap<>();
		if(province.equals("home")){
			map.put("sbw", 13542);
			map.put("yys", 937);
			map.put("jfz", 984);
		}else{
			int sbw = resultentrythreeRepository.getMechineState("三包外", province);
			int yys = resultentrythreeRepository.getMechineState("已验收", province);
			int jfz = resultentrythreeRepository.getMechineState("交付中", province);
			map.put("sbw", sbw);
			map.put("yys", yys);
			map.put("jfz", jfz);
		}
		
		return map;
	}
	
	
	public Integer[] getJiaofu(String province){
		Integer[] homejiaofuArr = {14,312,335,221,42,60};
		Integer[] jiaofuArr = {14,312,335,221,42,60};
		String[] state={"01厂内交付","02出厂到货","03调试巡查","04安装确认","05调试申请","06调试完成"};
		if(province.equals("home")){
			return homejiaofuArr;
		}else{
			for(int i=0;i<state.length;i++){
				int result = resultentrythreeRepository.getJiaofu(state[i], province);
				jiaofuArr[i] = result;
			}
		}
		return jiaofuArr;
	}
	
	
	public Map<String,Integer[]> getMechineBack(String province){
		String[] month = {"2017-03","2017-04","2017-05","2017-06","2017-07","2017-08","2017-09","2017-10","2017-11"};

		Integer[] homeresultW = {0,0,53,785,386,476,537,899,327};
		Integer[] homeresultN = {3,1,37,142,118,140,306,187,112};
		Map<String,Integer[]> map = new HashMap<>();
		Integer[] resultW = {0,0,0,0,0,0,0,0,0};
		Integer[] resultN = {0,0,0,0,0,0,0,0,0};
		if(province.equals("home")){
			map.put("resultW", homeresultW);
			map.put("resultN", homeresultN);
		}else{
			for(int i=0;i<month.length;i++){
				resultW[i] = resultentrytwoRepository.getMechineBack(month[i], province, "三包外");
				resultN[i] = resultentrytwoRepository.getMechineBack(month[i], province, "三包内");
			}
			map.put("resultW", resultW);
			map.put("resultN", resultN);
		}
		return map;
	}
	
	
	
	public Map<String,Integer[]> getMechineRepire(String province){
		
		Integer[] homeresult={79,58,149,136,175,198,69,59,97,76,1096};
		
		String[] time={"2017-01","2017-02","2017-03","2017-04","2017-05","2017-06","2017-07","2017-08","2017-09","2017-10","2017-全部"};

		Integer[] result={0,0,0,0,0,0,0,0,0,0,0};
		Map<String,Integer[]> map = new HashMap<>();
		if(province.equals("home")){
			map.put("result", homeresult);
		}else{
			for(int i=0;i<time.length;i++){
				result[i] = resultentryoneRepository.getMechineRepire(time[i], province);
			}
			for(int j=0;j<10;j++){
				result[10] += result[j];
			}
			map.put("result", result);
		}
		
		return map;
	}
	
	
	public List<MapDto> getKongtiaoData(String province){
		List<MapDto> list = new ArrayList<>();
		
		if(province.equals("home")){
			List<Allmechine> list1 = allMechineRepository.getByMtype("kongtiao");
			for(Allmechine a:list1){
				MapDto md= new MapDto();
				md.setName(a.getName());
				String[] position = {a.getJing(),a.getWei()};
				md.setValue(position);
				list.add(md);
			}
		}else{
			List<Allmechine> list1 = allMechineRepository.getMechine(province,"kongtiao");
			for(Allmechine a:list1){
				MapDto md= new MapDto();
				md.setName(a.getName());
				String[] position = {a.getJing(),a.getWei()};
				md.setValue(position);
				list.add(md);
			}
		}
		
		return list;
	}
	
	public List<MapDto> getGuoluData(String province){
		List<MapDto> list = new ArrayList<>();
		if(province.equals("home")){
			List<Allmechine> list2 = allMechineRepository.getByMtype("guolu");
			for(Allmechine a:list2){
				MapDto md= new MapDto();
				md.setName(a.getName());
				String[] position = {a.getJing(),a.getWei()};
				md.setValue(position);
				list.add(md);
			}
		}else{
			List<Allmechine> list2 = allMechineRepository.getMechine(province, "guolu");
			for(Allmechine a:list2){
				MapDto md= new MapDto();
				md.setName(a.getName());
				String[] position = {a.getJing(),a.getWei()};
				md.setValue(position);
				list.add(md);
			}
		}
		
		return list;
	}
	
	
}
