package com.company;
public class Enum {
	public enum StudentName {
		Names("Artem", "Nataha", "Oleg","Roma", "Vova_Nemets"),
		SurNames("Hurin", "Cherepushchak", "Decik","Shamakhin", "Zyhmund");
		private final String ast;
		private final String nst;
		private final String ost;
		private final String rst;
		private final String vst;

		StudentName(String ast, String nst, String ost, String rst, String vst){
			this.ast = ast;
			this.nst = nst;
			this.ost = ost;
			this.rst = rst;
			this.vst = vst;
		}
		public String getAst() {
			return ast;
		}

		public String getNst() {
			return nst;
		}
		public String getOst() {
			return ost;
		}
		public String getRst() {
			return rst;
		}
		public String getVst() {
			return vst;
		}
	}

}

