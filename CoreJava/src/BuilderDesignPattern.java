
public class BuilderDesignPattern {

	public static void main(String[] args) {
		Cake myCake = new Cake.Builder().bread(12).build();
	}
	}

	class Cake {
		private Cake(Builder builder) {
			this.cupOfButter = builder.cupOfButter;
			this.cupOfSuger = builder.cupOfSuger;
			this.numberOfBread = builder.numberOfBread;
			this.numberOfEggs = builder.numberOfEggs;
		}

		private int numberOfEggs;
		private int cupOfSuger;
		private int numberOfBread;
		private int cupOfButter;

		public static class Builder {
			private int numberOfEggs;
			private int cupOfSuger;
			private int numberOfBread;
			private int cupOfButter;

			public Builder eggs(int numberOfEggs) {
				this.numberOfEggs = numberOfEggs;
				return this;
			}

			public Builder sugar(int cupOfSuger) {
				this.cupOfSuger = cupOfSuger;
				return this;
			}

			public Builder bread(int numberOfBread) {
				this.numberOfBread = numberOfBread;
				return this;
			}

			public Builder butter(int cupOfButter) {
				this.cupOfButter = cupOfButter;
				return this;
			}

			public Cake build() {
				return new Cake(this);
			}

		}

}
