package com.cmd.server.radar.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cmd.server.radar.backend.TrapInfoProcessable;
import com.cmd.server.radar.model.TrapInfo;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/trap")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "application/x-javascript"})
public class TrapReportService {
	private static final Logger log = Logger.getLogger(TrapReportService.class);
	@Autowired
	private TrapInfoProcessable thingy;
	
	@POST
	public void addTrapInfo(TrapInfo info) {
		thingy.processTrapInfo(info);
		log.debug(info.toString());
	}
	
	@GET
	public TrapInfo getTrapInfo() {
		log.debug("get was gotten");
		TrapInfo trap = new TrapInfo();
		trap.setId("12345678990");
		trap.setAccuracy(0);
		trap.setBearing(0);
		trap.setLoc(null);
		trap.setSpeed(2);
		trap.setTimeOfLocation(1212);
		trap.setTimeReported(8989);
		return trap;
	}
}
