package com.duchong.designpattern.chainOfResp;

/**
 * 抽象类
 * @author Administrator
 *
 */
public abstract class Leader {
	protected String name;
	/**
	 * 责任链上的后继对象
	 */
	protected Leader nextLeader;

	public Leader(String name) {
		super();
		this.name = name;
	}

	/**
	 * 设定责任链上的后继对象
	 */
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}


	/**
	 * 处理请求的核心的业务方法
	 * @param request
	 */
	public abstract void handleRequest(LeaveRequest request);



}
