package org.yamcs.web.rest;

import java.util.List;

import org.yamcs.YamcsException;
import org.yamcs.management.ManagementService;
import org.yamcs.protobuf.Rest.EditLinkRequest;
import org.yamcs.protobuf.Rest.ListLinkInfoResponse;
import org.yamcs.protobuf.SchemaRest;
import org.yamcs.protobuf.SchemaYamcsManagement;
import org.yamcs.protobuf.YamcsManagement.LinkInfo;
import org.yamcs.web.BadRequestException;
import org.yamcs.web.HttpException;
import org.yamcs.web.InternalServerErrorException;

/**
 * Gives information on data links
 */
public class LinkRestHandler extends RestHandler {
    
    @Route(path="/api/links/:instance?", method="GET")
    public void listLinks(RestRequest req) throws HttpException {        
        String instance = req.getRouteParam("instance");
        if (instance != null) {
            verifyInstance(req, instance);
        }
        
        List<LinkInfo> links = ManagementService.getInstance().getLinkInfo();
        ListLinkInfoResponse.Builder responseb = ListLinkInfoResponse.newBuilder();
        
        for (LinkInfo link : links) {
            if (instance == null || instance.equals(link.getInstance())) {
                responseb.addLink(link);
            }
        }
        sendOK(req, responseb.build(), SchemaRest.ListLinkInfoResponse.WRITE);
    }
    
    @Route(path="/api/links/:instance/:name", method="GET")
    @Route(path="/api/links/:instance/link/:name", method="GET")
    public void getLink(RestRequest req) throws HttpException {
        LinkInfo linkInfo = verifyLink(req, req.getRouteParam("instance"), req.getRouteParam("name"));
        sendOK(req, linkInfo, SchemaYamcsManagement.LinkInfo.WRITE);
    }
    
    @Route(path="/api/links/:instance/:name", method={"PATCH", "PUT", "POST"})
    @Route(path="/api/links/:instance/link/:name", method={"PATCH", "PUT", "POST"})
    public void editLink(RestRequest req) throws HttpException {
        LinkInfo linkInfo = verifyLink(req, req.getRouteParam("instance"), req.getRouteParam("name"));
        
        EditLinkRequest request = req.bodyAsMessage(SchemaRest.EditLinkRequest.MERGE).build();
        String state = null;
        if (request.hasState()) state = request.getState();
        if (req.hasQueryParameter("state")) state = req.getQueryParameter("state");
        
        if (state != null) {
            ManagementService mservice = ManagementService.getInstance();
            switch (state.toLowerCase()) {
            case "enabled":
                try {
                    mservice.enableLink(linkInfo.getInstance(), linkInfo.getName());
                    sendOK(req);
                    return;
                } catch (YamcsException e) {
                    throw new InternalServerErrorException(e);
                }
            case "disabled":
                try {
                    mservice.disableLink(linkInfo.getInstance(), linkInfo.getName());
                    sendOK(req);                    
                    return;
                } catch (YamcsException e) {
                    throw new InternalServerErrorException(e);
                }
            default:
                throw new BadRequestException("Unsupported link state '" + state + "'");
            }
        } else {
            sendOK(req);
        }
    }
}
