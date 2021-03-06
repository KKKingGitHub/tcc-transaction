package org.pankai.tcctransaction.spring.recover;

import org.pankai.tcctransaction.recover.RecoverConfig;

/**
 * Created by pktczwd on 2016/12/7.
 */
public class DefaultRecoverConfig implements RecoverConfig {

    public static final RecoverConfig INSTANCE = new DefaultRecoverConfig();

    private int maxRetryCount = 30;

    private int recoverDuration = 120; //120 seconds.

    private String cronExpression = "0 */1 * * * ?";

    @Override
    public int getMaxRetryCount() {
        return maxRetryCount;
    }

    @Override
    public int getRecoverDuration() {
        return recoverDuration;
    }

    @Override
    public String getCronExpression() {
        return cronExpression;
    }

    public void setMaxRetryCount(int maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }

    public void setRecoverDuration(int recoverDuration) {
        this.recoverDuration = recoverDuration;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }
}
