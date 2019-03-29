package com.example.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import io.shardingjdbc.core.api.config.TableRuleConfiguration;

@Configuration
public class TableRuleConfig {
	
	public List<TableRuleConfiguration> getTableRuleConfig() {
		List<TableRuleConfiguration> list = new ArrayList<TableRuleConfiguration>();
		list.add(getUserTableRule());
		list.add(getLogTableRule());
		return list;
	}
	
	public TableRuleConfiguration getUserTableRule() {
		TableRuleConfiguration tableRuleConfig = new TableRuleConfiguration();
		tableRuleConfig.setLogicTable("t_user");
		tableRuleConfig.setActualDataNodes("ds.t_user_${0..5}");
		tableRuleConfig.setKeyGeneratorColumnName("f_user_id");
        return tableRuleConfig;
	}
	
	public TableRuleConfiguration getLogTableRule() {
		TableRuleConfiguration tableRuleConfig = new TableRuleConfiguration();
		tableRuleConfig.setLogicTable("t_log");
		tableRuleConfig.setActualDataNodes("ds.t_log_${0..2}");
		tableRuleConfig.setKeyGeneratorColumnName("f_log_id");
		return tableRuleConfig;
	}
	
	public List<String> getTableGroupConfig() {
		List<String> list = new ArrayList<String>();
		list.add("t_user");
		list.add("t_log");
		return list;
	}

}
