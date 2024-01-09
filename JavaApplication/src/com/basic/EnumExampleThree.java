package com.basic;

public class EnumExampleThree {

	enum MusicType {
		CLASSICAL(1), JAZZ(2), METAL(4);

		private int earDamageFactor;

		private MusicType(int earDamageFactor) {
			this.earDamageFactor = earDamageFactor;
		}

		public int calcHearingLoss(int hours) {
			return hours * earDamageFactor;
		}

		public String toString() {
			return this.name() + " - " + this.ordinal() + " - " + this.earDamageFactor;
		}

	}

	public static void main(String[] args) {
		MusicType musicType = MusicType.JAZZ;
		System.out.println(" : " + musicType);
		System.out.println(" : " + musicType.calcHearingLoss(1));
	}

}
