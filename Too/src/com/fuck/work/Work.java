package com.fuck.work;

import com.fuck.work.temp.Form;
import com.fuck.work.temp.SearchColumn;

public class Work {
	/**
	 * EAM_SpMunicipalPipelineSon 		spmp_Id
	 * EAM_SpConstructionSon 			spc_Id
	 * EAM_SpMunicipalSon 				spm_Id
	 * EAM_SpTrafficSon 				spts_Id
	 * EAM_SpLandSon					spc_Id
	 * EAM_SpDesignMunicipal			sjda_Id
	 * EAM_SpDesign 					sjda_Id 
	 */
	
	/**
	 * 
	 *   EAM_SpConstructionMunicipal
	 *   EAM_SpManageCommon
	 *   EAM_SpTraffic
	 *   EAM_SpPublicity
	 *   EAM_SpPrivateHouse
	 *   EAM_SpTemporary
	 *   EAM_SpLand
	 */
	public static void main(String[] args) {
//		String cls = "EAM_SpLandSon";
//	 	 FormSon.gen(cls);
//	 	 System.out.println("---------------------------------");
//	 	 Column.gen(cls);
//	 	 System.out.println("---------------------------------");
		
		 String cls = "EAM_CautionMoney";
		 Form.gen(cls);
//	 	 System.out.println("---------------------------------");
		

//	 	String cls = "EAM_SpTraffic";
//		 Table.gen(cls);
	 	 //System.out.println("---------------------------------");
		
//		String cls = "EAM_Record";
//		SearchColumn.gen(cls);
		
	 	 
	}

}  
