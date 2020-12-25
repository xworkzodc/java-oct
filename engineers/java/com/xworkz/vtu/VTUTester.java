package com.xworkz.vtu;

import com.xworkz.vtu.engineer.CSEnginner;
import com.xworkz.vtu.engineer.Engineer;
import com.xworkz.vtu.engineer.TCEngineer;

public class VTUTester {
	
	

	public static void main(String[] args) {

		
		Engineer engineer = new Engineer();
		System.out.println(engineer.USN);
		System.out.println(engineer.branch);
		engineer.problemSolving();

		CSEnginner csEnginner = new CSEnginner();
		System.out.println(csEnginner.USN);
		System.out.println(csEnginner.getBranch());
		System.out.println(csEnginner.getParentBranch());
		csEnginner.problemSolving();

		Engineer engineer2 = new CSEnginner();
		System.out.println(engineer2.branch);
		CSEnginner csEnginner2 = (CSEnginner) engineer2;
		System.out.println(csEnginner2.branch);
		engineer2.problemSolving();
		csEnginner2.problemSolving();
		TCEngineer tcEngineer = new TCEngineer();
		System.out.println(tcEngineer.branch);
		tcEngineer.problemSolving();
		System.out.println(tcEngineer.branchE);
	//	tcEngineer.branchE = Branch.BIOTECH;
		System.out.println(tcEngineer.branchE);

	}

}
