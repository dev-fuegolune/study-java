package bank;

import java.util.Random;

public class KaKao extends Bank implements Runnable{
	public boolean isExit;
	public boolean isBurnOut;
	
	private int principal;
	private int stockMoney;
	
	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}

	public int getStockMoney() {
		return stockMoney;
	}

	public void setStockMoney(int stockMoney) {
		this.stockMoney = stockMoney;
	}

	@Override
	public int showBalance() {
		setMoney(getMoney() / 2);
		return super.showBalance();
	}
	
//	주가
	public int stock() {
		Random random = new Random();
		int rating = random.nextInt(31);
		final boolean isDecrease = random.nextInt(2) == 1;
		
		if(isDecrease) {
			rating *= -1;
		}
		
		stockMoney *= (100 + rating) * 0.01;
		if(random.nextInt(10) == 0) {
			isBurnOut = true;
			stockMoney = 0;
		}
		return rating;
	}
	
//	매도
	public void sell() {
		setMoney(stockMoney);
		stockMoney = 0;
	}
	
	@Override
	public void run() {
		double rating = 0;
		int earningRate = 0, stockRating = 0;
		while(true) {
			stockRating = stock();
			if(isBurnOut) {
				System.out.println("↑상장 폐지↑");
				break;
			}
			rating = (double)stockMoney / principal;
			earningRate = (int)(rating < 1 ? (1 - rating) * -100 : (rating - 1) * 100);
			
			synchronized (this) {
				if(isExit) {
					try {wait();} catch (InterruptedException e) {;}
				}
				System.out.print("▶ 평가액: " + stockMoney + "원\t");
				System.out.print("▶ 주가: " + stockRating + "%\t");
				System.out.println("▶ 수익률: " + earningRate + "%");
			}
			
			try {Thread.sleep(3000);} catch (InterruptedException e) {break;}
		}
	}
}























