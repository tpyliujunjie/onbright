package com.bright.apollo.handler;

import com.bright.apollo.bean.Message;
import com.bright.apollo.bean.PushMessage;
import com.bright.apollo.common.entity.TObox;
import com.bright.apollo.common.entity.TUser;
import com.bright.apollo.common.entity.TUserObox;
import com.bright.apollo.enums.Command;
import com.bright.apollo.enums.PushMessageType;
import com.bright.apollo.service.OboxService;
import com.bright.apollo.service.UserOboxService;
import com.bright.apollo.service.UserService;
import com.bright.apollo.session.ClientSession;
import com.bright.apollo.session.PushObserverManager;
import com.bright.apollo.session.SessionManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class FilterCMDHandler extends BasicHandler {
    private Logger log = Logger.getLogger(FilterCMDHandler.class);
    @Autowired
    private SessionManager sessionManager;
    @Autowired
    private PushObserverManager pushObserverManager;

    private static Set<String> releaseCMD = new ConcurrentSkipListSet<String>();

    @Autowired
    private OboxService oboxService;

    @Autowired
    private UserOboxService userOboxService;

    @Autowired
    private UserService userService;

    static {
        //the cmd who can send message to app
        //TODO
        releaseCMD.add(Command.CONTROLPW.getValue());//a007
        releaseCMD.add(Command.OBOXINFO.getValue());//a001
        releaseCMD.add(Command.NODESTATUS.getValue());//a100
        releaseCMD.add(Command.SCENE.getValue());//a00e
        releaseCMD.add(Command.CONTROLPWRESET.getValue());//a00b
        releaseCMD.add(Command.SEARCH_RESULT.getValue());//2003
        releaseCMD.add(Command.SENSOR.getValue());//2500
        releaseCMD.add(Command.NODECHANGE.getValue());//a004
        releaseCMD.add(Command.GROUPCHANGE.getValue());//a006
        releaseCMD.add(Command.RELEASE.getValue());//a008
        releaseCMD.add(Command.NODERELEASE.getValue());//a00a
        releaseCMD.add(Command.CHANNEL.getValue());//a015
        releaseCMD.add(Command.REMOTERBUTTON.getValue());//a016
        releaseCMD.add(Command.REMOTERCHANNEL.getValue());//a014
        releaseCMD.add(Command.REMOVEOBOXRESP.getValue());//a012
    }
    @Override
    public Message<String> process(ClientSession clientSession, Message<String> msg) throws Exception {
        if (msg.getCmd()!=null&&!msg.getCmd().equals("")&& releaseCMD.contains(msg.getCmd())) {
//            sessionManager = SessionManager.getInstance();
            TObox tObox = oboxService.queryOboxsByOboxSerialId(clientSession.getUid());
//            if (tObox.getLicense() != null) {
//                if (tObox.getLicense() != 0) {
//                    TUser user = UserBusiness.queryUserByLicense(tObox.getLicense());
//                    if (user != null) {
//                        ClientSession pushSession  = sessionManager.getClientSessionByUid(user.getUserId().toString());
//                        if (pushSession != null) {
//                            pushObserverManager=PushObserverManager.getInstance();
//                            PushMessage message = new PushMessage();
//                            message.setType(PushMessageType.OBOX_TRANS.getValue());
//                            message.setData(msg.getData());
//                            message.setCmd(msg.getCmd());
//                            message.setSerialId(clientSession.getUid());
//                            pushObserverManager.sendMessage(message, pushSession);
//                        }
//                    }
//                }
//            }
            List<TUserObox> list = userOboxService.getUserOboxBySerialId(tObox.getOboxSerialId());
            for (TUserObox tUserObox : list) {

                TUser user = userService.getUserByUserId(tUserObox.getUserId());
                if (user != null) {
                    ClientSession pushSession  = sessionManager.getClientSessionByUid(user.getId().toString());
                    if (pushSession != null) {
                        PushMessage message = new PushMessage();
                        message.setType(PushMessageType.OBOX_TRANS.getValue());
                        message.setData(msg.getData());
                        message.setCmd(msg.getCmd());
                        message.setSerialId(clientSession.getUid());
                        pushObserverManager.sendMessage(message, pushSession);
                    }
                }
            }

        }
        return null;
    }
}
