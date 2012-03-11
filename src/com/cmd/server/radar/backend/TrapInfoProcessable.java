package com.cmd.server.radar.backend;

import org.springframework.scheduling.annotation.Async;

import com.cmd.server.radar.model.TrapInfo;

public interface TrapInfoProcessable {

	@Async
	public abstract void processTrapInfo(TrapInfo info);

}