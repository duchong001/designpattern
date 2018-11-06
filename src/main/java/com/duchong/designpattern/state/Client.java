package com.duchong.designpattern.state;


public class Client {
	public static void main(String[] args) {
		HomeContext ctx = new HomeContext();

		ctx.setState(new FreeState());
		ctx.setState(new BookedState());

	}
}
