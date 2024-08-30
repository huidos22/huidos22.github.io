	package com.huidos22.algoritmos.hilos;

	public class DosHilosMonitorUpdate {
		private static int variable1 = 100;

		public static void main(String[] args) {

			startUpdateThread();
			startMonitorThread();
		}

		public static void update() {
			variable1 = variable1 + 10;

			variable1 = variable1 - 10;

		}

		public static void monitor() {

			int b = variable1;
			if (b != 100) {

				System.out.println("Value changed: " + b);

				System.exit(0);

			}else {
				System.out.println("Value changed: " + b);
			}

		}

		public static void startUpdateThread() {
			Thread t = new Thread(() -> {

				while (true) {

					update();

				}

			});

			t.start();

		}

		public static void startMonitorThread() {
			Thread t = new Thread(() -> {

				while (true) {

					monitor();

				}

			});

			t.start();

		}

}
