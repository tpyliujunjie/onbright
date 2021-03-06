package com.bright.apollo.handler;

import com.bright.apollo.bean.Message;
import com.bright.apollo.common.dto.OboxResp;
import com.bright.apollo.common.entity.TObox;
import com.bright.apollo.enums.CMDEnum;
import com.bright.apollo.service.CMDMessageService;
import com.bright.apollo.service.OboxDeviceConfigService;
import com.bright.apollo.service.OboxService;
import com.bright.apollo.service.SceneService;
import com.bright.apollo.session.ClientSession;
import com.bright.apollo.session.SessionManager;
import org.springframework.beans.factory.annotation.Autowired;

public class RemoveOBOXHandler extends BasicHandler {
    @Autowired
    private OboxService oboxService;

    @Autowired
    private SceneService sceneService;

    @Autowired
    private OboxDeviceConfigService oboxDeviceConfigService;

    @Autowired
    private SessionManager sessionManager;

    @Autowired
    private CMDMessageService cmdMessageService;

    @Override
    public Message<String> process(ClientSession clientSession, Message<String> msg) throws Exception {
        String data = msg.getData();
        String obox_serial_id = data.substring(0, 10);

        TObox obox = oboxService.queryOboxsByOboxSerialId(obox_serial_id);
        Message<String>  replyMsg = new Message<String>();

        if (obox == null) {
            replyMsg.setData("00"+data);

            return replyMsg;
        }
//TODO
        ClientSession OBOXclientSession = sessionManager.getClientSession(obox.getOboxSerialId());
        if (OBOXclientSession == null) {
            replyMsg.setData("00"+data);

            return replyMsg;
        }

        byte [] bodyBytes = new byte [1];
        bodyBytes[0] = 00;
        OboxResp oboxResp = cmdMessageService.send(obox, CMDEnum.delete_obox, bodyBytes);
        replyMsg.setData(oboxResp.getData());

        sceneService.deleteSceneByOboxSerialId(obox.getOboxSerialId());
//        OboxBusiness.delOboxScenes(obox.getOboxSerialId());
        oboxDeviceConfigService.deleteTOboxDeviceConfigByOboxId(obox.getId());
//        OboxBusiness.delOboxDeviceConfigs(obox.getOboxId());
        oboxService.deleteOboxById(obox);
//        OboxBusiness.delObox(obox.getOboxId());

        return replyMsg;
    }
}
