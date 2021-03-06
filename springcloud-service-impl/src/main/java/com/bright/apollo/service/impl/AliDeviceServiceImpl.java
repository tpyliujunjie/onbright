package com.bright.apollo.service.impl;

import com.bright.apollo.common.entity.TAliDevTimer;
import com.bright.apollo.common.entity.TAliDevice;
import com.bright.apollo.common.entity.TAliDeviceUS;
import com.bright.apollo.dao.device.mapper.AliDeviceMapper;
import com.bright.apollo.service.AliDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AliDeviceServiceImpl implements AliDeviceService {

    @Autowired
    private AliDeviceMapper mapper;


    @Override
    public TAliDevice getAliDeviceBySerializeId(String oboxSerialId) {
        return mapper.getAliDeviceBySerializeId(oboxSerialId);
    }

    @Override
    public TAliDeviceUS getAliUSDeviceBySerializeId(String oboxSerialId) {
        return mapper.getAliUSDeviceBySerializeId(oboxSerialId);
    }

    @Override
    public TAliDevTimer getAliDevTimerByTimerId(int id) {
        return mapper.getAliDevTimerByTimerId(id);
    }

    @Override
    public void deleteAliDevTimerBySerializeIdAndType(String deviceSerialId, int isCountdown) {
        mapper.deleteAliDevTimerBySerializeIdAndType(deviceSerialId,isCountdown);
    }

    @Override
    public TAliDevice getAliDeviceByProductKeyAndDeviceName(String productKey, String deviceName) {
        System.out.println("getAliUSDeviceByProductKeyAndDeviceName ------ productKey ------ "+ productKey);
        System.out.println("getAliUSDeviceByProductKeyAndDeviceName ------ deviceName ------ "+ deviceName);
        System.out.println("getAliUSDeviceByProductKeyAndDeviceName ------ mapper ------ "+ mapper);
        return mapper.getAliDeviceByProductKeyAndDeviceName(productKey,deviceName);
    }

    @Override
    public TAliDeviceUS getAliUSDeviceByProductKeyAndDeviceName(String productKey, String deviceName) {
        return mapper.getAliUSDeviceByProductKeyAndDeviceName(productKey,deviceName);
    }

    @Override
    public void updateAliDevice(TAliDevice aliDevice) {
        mapper.updateAliDevice(aliDevice);
    }

    @Override
    public void updateAliUSDevice(TAliDeviceUS aliDevice) {
        mapper.updateAliUSDevice(aliDevice);
    }
}
