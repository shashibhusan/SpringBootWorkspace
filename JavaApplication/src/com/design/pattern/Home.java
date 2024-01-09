package com.design.pattern;

public class Home {

	private int walls;
	private int numberOfRoom;
	private String design;
	private String kitchenType;
	private String parking;
	private String swimingPool;

	private Home(HomeBuilber homeBuilber) {
		this.walls = homeBuilber.walls;
		this.numberOfRoom = homeBuilber.numberOfRoom;
		this.design = homeBuilber.design;
		this.kitchenType = homeBuilber.kitchenType;
		this.parking = homeBuilber.parking;
		this.swimingPool = homeBuilber.swimingPool;
	}

	public int getWalls() {
		return walls;
	}

	public int getNumberOfRoom() {
		return numberOfRoom;
	}

	public String getDesign() {
		return design;
	}

	public String getKitchenType() {
		return kitchenType;
	}

	public String getParking() {
		return parking;
	}

	public String getSwimingPool() {
		return swimingPool;
	}

	public static class HomeBuilber {

		private int walls;
		private int numberOfRoom;
		private String design;
		private String kitchenType;
		private String parking;
		private String swimingPool;

		public HomeBuilber walls(int walls) {
			this.walls = walls;
			return this;
		}

		public HomeBuilber numberOfRoom(int numberOfRoom) {
			this.numberOfRoom = numberOfRoom;
			return this;
		}

		public HomeBuilber design(String design) {
			this.design = design;
			return this;
		}

		public HomeBuilber kitchenType(String kitchenType) {
			this.kitchenType = kitchenType;
			return this;
		}

		public HomeBuilber parking(String parking) {
			this.parking = parking;
			return this;
		}

		public HomeBuilber swimingPool(String swimingPool) {
			this.swimingPool = swimingPool;
			return this;
		}

		public Home build() {
			return new Home(this);
		}

	}

}
