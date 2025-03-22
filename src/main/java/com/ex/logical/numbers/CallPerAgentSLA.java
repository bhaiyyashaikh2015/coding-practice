package com.ex.logical.numbers;

public class CallPerAgentSLA {

	public static void main(String[] args) {

		double totalContacts = 30, sla = 30, availableAgent = 10, callsToTrigger = 0;

		callsToTrigger = availableAgent * 100 / sla;

		if (totalContacts < callsToTrigger)
			System.out.println("Triggering calls ==> " + Math.round(totalContacts));
		else
			System.out.println("Triggering calls ==> " + Math.round(callsToTrigger));

	}
}
