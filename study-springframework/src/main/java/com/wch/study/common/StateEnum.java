package com.wch.study.common;

public class StateEnum {
	public enum DeleteFlg{
		Yes("1","是"),No("0","否");
		
		private String value;
		
		private String label;
		
		private DeleteFlg(String value, String label) {
			this.value = value;
			this.label = label;
		}

		public String getValue() {
			return value;
		}

		public String getLabel() {
			return label;
		}
	}
}
