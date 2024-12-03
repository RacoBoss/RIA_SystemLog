package com.racoboss.ria_systemlog.Activity;

import com.racoboss.ria_systemlog.log;
import net.md_5.bungee.api.plugin.Plugin;

public class BungeeMain extends Plugin {

    @Override
    public void onEnable() {
        log.Message("시스템 로그 메시지 플러그인이 활성화되었습니다.");
    }

    @Override
    public void onDisable() {
        log.Message("시스템 로그 메시지 플러그인이 비활성화되었습니다.");
    }
}
