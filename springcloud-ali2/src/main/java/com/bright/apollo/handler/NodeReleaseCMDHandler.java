package com.bright.apollo.handler;

import com.bright.apollo.bean.Message;
import com.bright.apollo.common.entity.TObox;
import com.bright.apollo.common.entity.TOboxDeviceConfig;
import com.bright.apollo.common.entity.TScene;
import com.bright.apollo.common.entity.TSceneCondition;
import com.bright.apollo.service.OboxDeviceConfigService;
import com.bright.apollo.service.OboxService;
import com.bright.apollo.service.SceneService;
import com.bright.apollo.session.ClientSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NodeReleaseCMDHandler extends BasicHandler{

    @Autowired
    private OboxService oboxService;

    @Autowired
    private OboxDeviceConfigService oboxDeviceConfigService;

    @Autowired
    private SceneService sceneService;

    @Override
    public Message<String> process(ClientSession clientSession, Message<String> msg) throws Exception {
        String data = msg.getData();
        TObox tObox = oboxService.queryOboxsByOboxSerialId(clientSession.getUid());
        if (tObox != null) {
            if ("01".equals(data.substring(0, 2))) {
//                List<TOboxDeviceConfig> tOboxDeviceConfigs = OboxBusiness.queryOboxConfigs(tObox.getOboxId());
//                for (TOboxDeviceConfig tOboxDeviceConfig : tOboxDeviceConfigs) {
//                    if (!tOboxDeviceConfig.getGroupAddr().equals("00")) {
//                        TServerOboxGroup tServerOboxGroup = DeviceBusiness.queryOBOXGroupByAddr(tOboxDeviceConfig.getGroupAddr(), tOboxDeviceConfig.getOboxSerialId());
//                        if (tServerOboxGroup != null) {
//                            TServerGroup tServerGroup = DeviceBusiness.querySererGroupById(tServerOboxGroup.getServerId());
//                            if (tServerGroup != null) {
//                                DeviceBusiness.deleteServerGroup(tServerGroup);
//                            }
//                            DeviceBusiness.deleteOBOXGroupByAddr(tOboxDeviceConfig.getOboxSerialId(), tOboxDeviceConfig.getGroupAddr());
//                        }
//                    }
//                    DeviceBusiness.deleteDeviceGroup(tOboxDeviceConfig.getId());
//                    DeviceBusiness.deleteUserDeviceByDeviceId(tOboxDeviceConfig.getId());
//                    DeviceBusiness.delDeviceChannel(tOboxDeviceConfig.getId());
//
//                }

//                OboxBusiness.delOboxDeviceConfigs(tObox.getOboxId());
                oboxDeviceConfigService.deleteTOboxDeviceConfigByOboxId(tObox.getId());
//                List<TScene> scenes = OboxBusiness.queryOboxScenes(tObox.getOboxSerialId());
                List<TScene> scenes = sceneService.getSceneByOboxSerialId(tObox.getOboxSerialId());
                if (scenes != null) {
//                    for (TScene tScene : scenes) {
//                        List<TSceneCondition> tSceneConditions = SceneBusiness.querySceneConditionsBySceneNumber(tScene.getSceneNumber());
//                        if (tSceneConditions != null) {
//                            SceneBusiness.deleteSceneConditionBySceneNumber(tScene.getSceneNumber());
//                        }
//
//                        SceneBusiness.deleteUserScene(tScene.getSceneNumber());
//                        SceneBusiness.deleteSceneActionsBySceneNumber(tScene.getSceneNumber());
//                        SceneBusiness.deleteSceneBySceneNumber(tScene.getSceneNumber());
//                        SceneBusiness.deleteSceneLocationBySceneNumber(tScene.getSceneNumber());
//                    }
                    super.deleteSceneNumber(scenes,tObox);
//                    OboxBusiness.delOboxScenes(tObox.getOboxSerialId());
                }

            }
        }
        return null;
    }
}
