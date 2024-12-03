package com.racoboss.ria_systemlog.Activity;

import com.racoboss.ria_systemlog.log;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitMain extends JavaPlugin {

    @Override
    public void onEnable() {
        log.Message("시스템 로그 메시지 플러그인이 활성화되었습니다.");
    }

    @Override
    public void onDisable() {
        log.Message("시스템 로그 메시지 플러그인이 비활성화되었습니다.");
    }
}
