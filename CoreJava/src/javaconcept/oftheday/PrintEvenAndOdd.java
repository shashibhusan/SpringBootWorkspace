package javaconcept.oftheday;

public class PrintEvenAndOdd {

	int counter = 1;
	int count = 20;

	public void printEvenNumber() {
		synchronized (this) {
			
			while (counter < count) {

				while (counter % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(counter);
				counter++;
				notifyAll();
			}
			
		}

	}

	public void printOddNumber() {
		synchronized (this) {

			while (counter < count) {

				while (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(counter);
				counter++;
				notifyAll();
			}

		}

	}

	public static void main(String[] args) {
		PrintEvenAndOdd pe = new PrintEvenAndOdd();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				pe.printEvenNumber();
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				pe.printOddNumber();
			}
		};
		t2.start();
		t1.start();
	}

}
