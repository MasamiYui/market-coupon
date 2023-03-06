package me.yui.market.model.basic;

import jakarta.annotation.PostConstruct;
import me.yui.market.utils.SnowflakeIdWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.UUID;


@Component
public class IDGenerator {

    private final static Logger LOG = LoggerFactory.getLogger(IDGenerator.class);

    private static SnowflakeIdWorker worker;

    @PostConstruct
    public void init() throws Exception {
        Integer index = 0;
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            String hostname = inetAddress.getHostName();
            index = getNumber(hostname);
        } catch (Exception e) {
            LOG.error("init failed", e);
        }
        worker = new SnowflakeIdWorker(Integer.valueOf(index % 32).longValue(), Integer.valueOf((index / 32) + 1).longValue());
    }


    private static Integer getNumber(String hostname) {
        LOG.info("hostname:{}", hostname);
        String[] strings = hostname.split("\\.");
        String[] strs = strings[0].split("-");
        return Integer.valueOf(strs[strs.length - 1]);
    }

    public static String id() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String snowId() {
        return String.valueOf(worker.nextId());
    }

    public static Long longSnowId() {
        return worker.nextId();
    }
}

