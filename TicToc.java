package assgn5;

import java.util.concurrent.Semaphore;

class Tic extends Thread {
	Semaphore a, b;

	public Tic(Semaphore a, Semaphore b) {
		this.a = a;
		this.b = b;

	}

	@Override
	public void run() {

			for (int i = 1; i < 10; i++) {
				try {
					a.acquire();
					System.out.print("Tic-");
					b.release();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

	}
}

class Toc extends Thread {
	Semaphore a, b;

	public Toc(Semaphore a, Semaphore b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {


			for (int i = 0; i < 10; i++) {
				try {
					a.acquire();
					System.out.println("-Toc");
					b.release();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

	}
}

public class TicToc {

	public static void main(String[] args) {
		Semaphore i = new Semaphore(1);
		Semaphore j = new Semaphore(0);

		Tic t1 = new Tic(i, j);
		Toc t2 = new Toc(j, i);
		t1.start();
		t2.start();
	}

}
