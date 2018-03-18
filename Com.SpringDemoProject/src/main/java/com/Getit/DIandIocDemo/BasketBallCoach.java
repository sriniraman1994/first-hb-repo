package com.Getit.DIandIocDemo;

public class BasketBallCoach implements Coach {
	private Fortune fortune;
	private int points;
	private String Versus;
	private String venue; 
	private String time;
	private String stadium;
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	public Fortune getFortune() {
		return fortune;
	}

	public String getTask() {
		return "Do Drive practice for 2 hrs";
	}

	public String getFortuneValue() {
		return fortune.getFortune();
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getVersus() {
		return Versus;
	}

	public void setVersus(String versus) {
		Versus = versus;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

}
